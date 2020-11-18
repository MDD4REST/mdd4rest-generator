package core.handlers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ActivityDiagramMetamodel.Action;
import ActivityDiagramMetamodel.ActivityDiagram;
import ActivityDiagramMetamodel.ActivityDiagramMetamodelFactory;
import ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage;
import ActivityDiagramMetamodel.ActivityEdge;
import ActivityDiagramMetamodel.ActivityNode;
import ActivityDiagramMetamodel.ActivityPartition;
import ActivityDiagramMetamodel.Aggregate;
import ActivityDiagramMetamodel.CommandAction;
import ActivityDiagramMetamodel.ControlNode;
import ActivityDiagramMetamodel.DecisionNode;
import ActivityDiagramMetamodel.EventAction;
import ActivityDiagramMetamodel.FinalNode;
import ActivityDiagramMetamodel.InitialNode;
import ActivityDiagramMetamodel.QueryAction;
import ActivityDiagramMetamodel.impl.ControlNodeImpl;
import core.ontology.DynamicOntologyAPI;

public class ExportActivityDiagramMetamodelToOntologyHandler {

	private String projectName;
	private String projectPath;
	private DynamicOntologyAPI dynamicOntology;

	public ExportActivityDiagramMetamodelToOntologyHandler(String projectName, String projectPath) {
		this.projectName = projectName;
		this.projectPath = projectPath;
	}

	public DynamicOntologyAPI instantiateOntology() {
		dynamicOntology = new DynamicOntologyAPI(projectName, projectPath, true);

		ActivityDiagramMetamodelPackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("activitydiagrammetamodel", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		File dir = new File(projectPath + "/CIM/activity diagrams");
		String[] extensions = new String[] { "activitydiagrammetamodel" };
		List<File> files = (List<File>) FileUtils.listFiles(dir, extensions, true);

		System.out.println();
		System.out.println("***************************");
		System.out.println("ACTIVITY DIAGRAMS WHICH DISCOVERED");
		System.out.println();
		for (File file : files) {

			System.out.println(file.getName());
			Resource resource = resSet
					.getResource(URI.createURI(projectPath + "/CIM/activity diagrams/" + file.getName()), true);
			// Get the first model element and cast it to the right type, in my
			// example everything is hierarchical included in this first node
			ActivityDiagram acd = (ActivityDiagram) resource.getContents().get(0);
			activityDiagramTransformation(acd);
		}

		dynamicOntology.close();
		return dynamicOntology;
	}

	private void activityDiagramTransformation(ActivityDiagram acd) {
		String diagramName = acd.getName();
		System.out.println(diagramName);
		dynamicOntology.addActivityDiagram(diagramName);

		if (acd.getPrecondition() != null)
			dynamicOntology.addPreconditionToDiagram(diagramName, acd.getPrecondition());

		if (acd.getPrecondition() != null)
			dynamicOntology.addPreconditionToDiagram(diagramName, acd.getPostcondition());

		for (ActivityPartition activityPartition : acd.getActivitypartition()) {
			activityPartitionTranformation(diagramName, activityPartition);
		}
	}

	private void activityPartitionTranformation(String diagramName, ActivityPartition activityPartition) {
		String actorName = activityPartition.getName();
		if (!dynamicOntology.getActors().contains(actorName)) {
			dynamicOntology.addActor(actorName);
		}

		ArrayList<CommandAction> commands = new ArrayList<CommandAction>();
		ArrayList<QueryAction> queries = new ArrayList<QueryAction>();
		ArrayList<EventAction> events = new ArrayList<EventAction>();
		ArrayList<Aggregate> aggregates = new ArrayList<Aggregate>();
		ArrayList<DecisionNode> policies = new ArrayList<DecisionNode>();
		InitialNode initialNode = null;
		FinalNode finalNode = null;

		for (ActivityNode activityNode : activityPartition.getActivitynode()) {
			switch (activityNode.eClass().getClassifierID()) {
			case ActivityDiagramMetamodelPackage.INITIAL_NODE: {
				initialNode = (InitialNode) activityNode;
				break;
			}
			case ActivityDiagramMetamodelPackage.FINAL_NODE: {
				finalNode = (FinalNode) activityNode;
				break;
			}
			case ActivityDiagramMetamodelPackage.FORK_NODE: {
				break;
			}
			case ActivityDiagramMetamodelPackage.JOIN_NODE: {
				break;
			}
			case ActivityDiagramMetamodelPackage.DECISION_NODE: {
				policies.add((DecisionNode) activityNode);
				break;
			}

			case ActivityDiagramMetamodelPackage.MERGE_NODE: {
				break;
			}

			case ActivityDiagramMetamodelPackage.COMMAND_ACTION: {
				commands.add((CommandAction) activityNode);
				break;
			}
			case ActivityDiagramMetamodelPackage.EVENT_ACTION: {
				events.add((EventAction) activityNode);
				break;
			}

			case ActivityDiagramMetamodelPackage.CALL_ACTION: {
				break;
			}

			case ActivityDiagramMetamodelPackage.QUERY_ACTION: {
				queries.add((QueryAction) activityNode);
				break;
			}

			case ActivityDiagramMetamodelPackage.AGGREGATE: {
				aggregates.add((Aggregate) activityNode);
				break;
			}
			default:
				break;
			}
		}
		
		if(initialNode!=null)
			initialNodeTransformation(diagramName, initialNode);
		
		for (CommandAction action : commands) {
			commandNodesTransformation(diagramName, actorName, action);
		}
		
		for (QueryAction action : queries) {
			queryNodesTransformation(diagramName, actorName, action);
		}
		
		for (Aggregate aggregate : aggregates) {
			aggregateNodesTransformation(actorName, aggregate);
		}
		
		for (EventAction action : events) {
			eventNodesTransformation(actorName, action);
		}
		
		if(finalNode != null)
			finalNodeTransformation(diagramName, finalNode);
		
		transitionTransformation(diagramName, initialNode);

		for (ActivityPartition subPartition : activityPartition.getSubpartition()) {
			activityPartitionTranformation(diagramName, subPartition);
		}
	}

	private void commandNodesTransformation(String diagramName, String actorName, CommandAction action) {
		String activityName = action.getName();
		dynamicOntology.addActivity(activityName);
		dynamicOntology.connectActivityDiagramToElement(diagramName, activityName);
		dynamicOntology.addCommandToActivity(activityName, activityName);
		dynamicOntology.connectActorToActivity(actorName, activityName);
	}

	private void queryNodesTransformation(String diagramName, String actorName, QueryAction action) {
		String activityName = action.getName();
		dynamicOntology.addActivity(activityName);
		dynamicOntology.connectActivityDiagramToElement(diagramName, activityName);
		dynamicOntology.addCommandToActivity(activityName, activityName);
		dynamicOntology.connectActorToActivity(actorName, activityName);
	}

	private void eventNodesTransformation(String actorName, EventAction action) {
		if (action.getAggregate() != null) {
			String actionName = action.getName();
			String activityName = getActivityNameOfAggregation(action.getAggregate());
			if (activityName != null)
				dynamicOntology.addEventToActivity(activityName, actionName);
		}
	}

	private void aggregateNodesTransformation(String actorName, Aggregate aggregate) {
		String aggregateName = aggregate.getName();
		String activityName = getActivityNameOfAggregation(aggregate);
		if (activityName != null)
			dynamicOntology.addAggregateToActivity(activityName, aggregateName);
	}

	private void initialNodeTransformation(String diagramName, InitialNode activityNode) {
		String activityName = "StartNode__" + diagramName;
		dynamicOntology.addInitialActivity(activityName);
		dynamicOntology.connectActivityDiagramToElement(diagramName, activityName);
		
		if (activityNode == null)
			return;
		
		
	}

	private void finalNodeTransformation(String diagramName, FinalNode activityNode) {
		String activityName = "FinalNode__" + diagramName;
		dynamicOntology.addFinalActivity(activityName);
		dynamicOntology.connectActivityDiagramToElement(diagramName, activityName);
	}
	
	private void transitionTransformation(String diagramName, InitialNode initialNode) {
		String initialString = "StartNode__" + diagramName;
		
		if (initialNode!= null) {
			for(ActivityEdge outgoing: initialNode.getOutcomming()) {
				ActivityNode targetNode = outgoing.getTarget();
				if(targetNode != null) {
					if(ActivityDiagramMetamodelPackage.Literals.ACTION.isSuperTypeOf(targetNode.eClass())) {
						Action actionNode = (Action) targetNode;
						System.out.println(actionNode.getName());
						dynamicOntology.addTransition(initialString, actionNode.getName());
						dynamicOntology.connectActivityDiagramToTransition(diagramName, initialString, actionNode.getName());
					}
					
				}
			}
		}
	}

	private String getActivityNameOfAggregation(Aggregate aggregate) {
		CommandAction command = aggregate.getCommand();
		QueryAction query = aggregate.getQuery();
		if (command != null) {
			return command.getName();
		} else if (query != null) {
			return query.getName();
		} else {
			return null;
		}
	}
}
