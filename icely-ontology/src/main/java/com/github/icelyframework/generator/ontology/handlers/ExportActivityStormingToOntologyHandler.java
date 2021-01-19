package com.github.icelyframework.generator.ontology.handlers;

import java.io.File;
import java.lang.System;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.github.icelyframework.activitystorming.*;
import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.github.icelyframework.generator.ontology.api.DynamicOntologyAPI;

public class ExportActivityStormingToOntologyHandler {

	private String projectName;
	private String projectPath;
	private DynamicOntologyAPI dynamicOntology;

	public ExportActivityStormingToOntologyHandler(String projectName, String projectPath) {
		this.projectName = projectName;
		this.projectPath = projectPath;
	}

	public DynamicOntologyAPI instantiateOntology() {
		dynamicOntology = new DynamicOntologyAPI(projectName, projectPath, true);

		ActivitystormingPackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("actstorm", new XMIResourceFactoryImpl());
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		File dir = new File(projectPath + "/CIM/activity storming");
		String[] extensions = new String[] { "actstorm" };
		List<File> files = (List<File>) FileUtils.listFiles(dir, extensions, true);

		System.out.println();
		System.out.println("***************************");
		System.out.println("ACTIVITY STORMINGS WHICH DISCOVERED");
		System.out.println();
		for (File file : files) {

			System.out.println(file.getName());
			System.out.println(URI.createURI(projectPath + "/CIM/activity storming/" + file.getName()).toString());
			Resource resource = resSet
					.getResource(URI.createURI("file://" + projectPath + "/CIM/activity storming/" + file.getName()), true);
			System.out.println(resource.getContents());
			System.out.println(resource.getContents().get(0).eAllContents());
			ActivityDiagram acd = (ActivityDiagram) resource.getContents().get(0);
			activityDiagramTransformation(acd);
		}
		
		System.out.println();
		System.out.println("ACTIVITY STORMINGS ADDED");
		System.out.println("***************************");
		System.out.println();

		dynamicOntology.close();
		return dynamicOntology;
	}

	private void activityDiagramTransformation(ActivityDiagram acd) {
		String diagramName = "ACD_" + acd.getName();
		System.out.println(diagramName);
		dynamicOntology.addActivityDiagram(diagramName);

		if (acd.getPrecondition() != null)
			dynamicOntology.addPreconditionToDiagram(diagramName, acd.getPrecondition());

		if (acd.getPrecondition() != null)
			dynamicOntology.addPreconditionToDiagram(diagramName, acd.getPostcondition());
		
		ArrayList<ActivityEdge> edges = new ArrayList<ActivityEdge>();
		
		for (ActivityPartition activityPartition : acd.getActivitypartition()) {
			activityPartitionTranformation(diagramName, activityPartition);
			edges.addAll(activityPartitionEdges(diagramName, activityPartition));
		}
		
		for (ActivityEdge edge : edges) {
			transitionTransformation(diagramName, edge);
		}
	}

	private void activityPartitionTranformation(String diagramName, ActivityPartition activityPartition) {
		String actorName = activityPartition.getName();
		if (activityPartition.eClass().getClassifierID() == ActivitystormingPackage.ACTOR) {
			dynamicOntology.addUserActor(actorName);
		} else if (activityPartition.eClass().getClassifierID() == ActivitystormingPackage.SYSTEM) {
			dynamicOntology.addSystemActor(actorName);
		} else {
			dynamicOntology.addActor(actorName);
		}
		
		ArrayList<CommandAction> commands = new ArrayList<CommandAction>();
		ArrayList<QueryAction> queries = new ArrayList<QueryAction>();
		ArrayList<DomainEvent> events = new ArrayList<DomainEvent>();
		ArrayList<Aggregate> aggregates = new ArrayList<Aggregate>();
		ArrayList<DecisionNode> policies = new ArrayList<DecisionNode>();
		ArrayList<ReadModel> readModels = new ArrayList<ReadModel>();

		InitialNode initialNode = null;
		FinalNode finalNode = null;

		for (ActivityNode activityNode : activityPartition.getActivitynode()) {
			switch (activityNode.eClass().getClassifierID()) {
			case ActivitystormingPackage.INITIAL_NODE: {
				initialNode = (InitialNode) activityNode;
				break;
			}
			case ActivitystormingPackage.FINAL_NODE: {
				finalNode = (FinalNode) activityNode;
				break;
			}
			case ActivitystormingPackage.FORK_NODE: {
				break;
			}
			case ActivitystormingPackage.JOIN_NODE: {
				break;
			}
			case ActivitystormingPackage.DECISION_NODE: {
				policies.add((DecisionNode) activityNode);
				break;
			}

			case ActivitystormingPackage.MERGE_NODE: {
				break;
			}

			case ActivitystormingPackage.COMMAND_ACTION: {
				commands.add((CommandAction) activityNode);
				break;
			}
			case ActivitystormingPackage.DOMAIN_EVENT: {
				events.add((DomainEvent) activityNode);
				break;
			}

			case ActivitystormingPackage.CALL_ACTION: {
				break;
			}

			case ActivitystormingPackage.QUERY_ACTION: {
				queries.add((QueryAction) activityNode);
				break;
			}

			case ActivitystormingPackage.AGGREGATE: {
				aggregates.add((Aggregate) activityNode);
				break;
			}

			case ActivitystormingPackage.READ_MODEL: {
				readModels.add((ReadModel) activityNode);
				break;
			}

			default:
				break;
			}
		}
		
		if (initialNode != null)
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

		for (DomainEvent event : events) {
			eventNodesTransformation(event);
		}

		for (ReadModel readModel : readModels) {
			readModelTransformation(readModel);
		}
		
		if (finalNode != null)
			finalNodeTransformation(diagramName, finalNode);
		
		for (ActivityPartition subPartition : activityPartition.getSubpartition()) {
			activityPartitionTranformation(diagramName, subPartition);
		}
	}
	
	private ArrayList<ActivityEdge> activityPartitionEdges(String diagramName, ActivityPartition activityPartition) {
		ArrayList<ActivityEdge> transitions = new ArrayList<ActivityEdge>();
		
		for (ActivityNode activityNode : activityPartition.getActivitynode()) {
			transitions.addAll(activityNode.getOutcomming());
		}
		
		for (ActivityPartition subPartition : activityPartition.getSubpartition()) {
			transitions.addAll(activityPartitionEdges(diagramName, subPartition));
		}
		
		return transitions;
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
		dynamicOntology.addQueryToActivity(activityName, activityName);
		dynamicOntology.connectActorToActivity(actorName, activityName);
	}

	private void eventNodesTransformation(DomainEvent event) {
		if (event.getSupplier() != null) {
			String eventName = event.getName();
			String activityName = getActivityNameOfAggregation(event.getSupplier());
			dynamicOntology.addEventToActivity(activityName, eventName);
			dynamicOntology.addEventToSupplier(event.getSupplier().getName(), eventName);
		} else if (event.getConstraint() != null) {
			System.out.println("Constraint " + event.getConstraint());
			String eventName = event.getName();
			String activityName = getActivityNameOfAggregation(event.getConstraint().getSupplier());
			dynamicOntology.addEventToActivity(activityName, eventName);
			dynamicOntology.addEventToSupplier(event.getConstraint().getSupplier().getName(), eventName);
		}
	}

	private void readModelTransformation(ReadModel readModel) {
		String readModelName = readModel.getName();
		Supplier supplier;
		if (readModel.getSupplier() != null) {
			supplier = readModel.getSupplier();
			String activityName = getActivityNameOfAggregation(supplier);
			dynamicOntology.addReadModelToActivity(activityName, readModelName);
			dynamicOntology.addReadModelToSupplier(supplier.getName(), readModelName);
		} else if (readModel.getEvent() != null) {
			supplier = readModel.getEvent().getSupplier();
			String activityName = getActivityNameOfAggregation(supplier);
			dynamicOntology.addReadModelToActivity(activityName, readModelName);
			dynamicOntology.addReadModelToEvent(readModel.getEvent().getName(), readModelName);
		}
	}

	private void aggregateNodesTransformation(String actorName, Aggregate aggregate) {
		String aggregateName = aggregate.getName();
		String activityName = getActivityNameOfAggregation(aggregate);
		if (activityName != null)
			dynamicOntology.addAggregateToActivity(activityName, aggregateName);
		addDomainObjectsToAggregate(activityName, aggregate);

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

	private void transitionTransformation(String diagramName, ActivityEdge edge) {
		ActivityNode sourceNode = edge.getSource();
		ActivityNode targetNode = edge.getTarget();
		String fromString = "";
		String toString = targetTransitionName(diagramName, targetNode);
		if (ActivitystormingPackage.Literals.INITIAL_NODE.isSuperTypeOf(sourceNode.eClass())) {
			fromString = "StartNode__" + diagramName;
			addTransition(diagramName, fromString, toString);
		} else if(ActivitystormingPackage.Literals.READ_MODEL.isSuperTypeOf(sourceNode.eClass())) {
			ReadModel node = (ReadModel) sourceNode;
			fromString = node.getName();
			addTransition(diagramName, fromString, toString);
		} else if(ActivitystormingPackage.Literals.DECISION_NODE.isSuperTypeOf(sourceNode.eClass())) {
			DecisionNode source = (DecisionNode) sourceNode;
			fromString = dynamicOntology.getSourceOfPolicy(source.getName());
			String transitionName = "FROM__" + fromString + "__TO__" + toString;
			addTransition(diagramName, fromString, toString);
			dynamicOntology.addPolicyToTransition(transitionName, source.getName());
		} else if(ActivitystormingPackage.Literals.DOMAIN_EVENT.isSuperTypeOf(sourceNode.eClass())) {
			DomainEvent source = (DomainEvent) sourceNode;
			fromString = source.getName();
			if(ActivitystormingPackage.Literals.DECISION_NODE.isSuperTypeOf(targetNode.eClass())) {
				dynamicOntology.addEventSourceToPolicy(toString, fromString);
				return;
			}
			addTransition(diagramName, fromString, toString);
		}
	}
	
	private String targetTransitionName(String diagramName, ActivityNode node) {
		switch(node.eClass().getClassifierID()) {
		case ActivitystormingPackage.ACTION: {
			return ((Action) node).getName();
		}
		case ActivitystormingPackage.COMMAND_ACTION: {
			return ((CommandAction) node).getName();
		}
		case ActivitystormingPackage.QUERY_ACTION: {
			return ((QueryAction) node).getName();
		}
		case ActivitystormingPackage.READ_MODEL: {
			return ((ReadModel) node).getName();
		}
		case ActivitystormingPackage.DECISION_NODE: {
			return ((DecisionNode) node).getName();
		}
		case ActivitystormingPackage.FINAL_NODE: {
			return "FinalNode__" + diagramName;
		}
		default:
			return null;
		}
	}
	
	private void addTransition(String diagramName, String fromString, String toString) {
		dynamicOntology.addTransition(fromString, toString);
		dynamicOntology.connectActivityDiagramToTransition(diagramName, fromString, toString);
	}

	private void addDomainObjectsToAggregate(String activityName, Aggregate aggregate) {
		for (DomainObject domain : aggregate.getDomainobject()) {
			switch (domain.eClass().getClassifierID()) {
			case ActivitystormingPackage.ENTITY: {
				dynamicOntology.addEntityToAggregate(aggregate.getName(), domain.getName());
				break;
			}
			case ActivitystormingPackage.VALUE_OBJECT: {
				dynamicOntology.addValueObjectToAggregate(aggregate.getName(), domain.getName());
				break;
			}
			default: {
				dynamicOntology.addObjectToAggregate(aggregate.getName(), domain.getName());
				break;
			}
			}
			dynamicOntology.addObjectToActivity(activityName, domain.getName());
		}
	}

	private String getActivityNameOfAggregation(Supplier supplier) {
		Action action = supplier.getAction();
		return action.getName();
	}
}
