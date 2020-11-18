package core.parser;

import java.util.ArrayList;

import core.ontology.DynamicOntologyAPI;
import core.parser.XMIActivityNode;
import core.parser.XMIEdge;

/**
 * Add a uml activity diagram to the ontology.
 * 
 * @author mkoutli
 */
public class WriteDynamicOntology {

	/**
	 * Writes to the ontology.
	 * 
	 *
	 */
	public static void modifyOntology(ArrayList<XMIEdge> edgesWithCondition, ArrayList<XMIEdge> edgesWithoutCondition,
			ArrayList<XMIEdge> edges, ArrayList<XMIActivityNode> nodes, DynamicOntologyAPI ontology, String diagramName) {

		for (XMIActivityNode node : nodes) {
			if (node.getType().equals("uml:InitialNode")) {
				ontology.addInitialActivity(node.getName());
				ontology.connectActivityDiagramToElement(diagramName, node.getName());

			} else if (node.getType().equals("uml:ActivityFinalNode")) {
				ontology.addFinalActivity(node.getName());
				ontology.connectActivityDiagramToElement(diagramName, node.getName());

			} else if (node.getType().equals("uml:OpaqueAction")) {
				ontology.addActivity(node.getName());
				ontology.connectActivityDiagramToElement(diagramName, node.getName());
				if (!node.getAnnotations().equals("")) {
					String[] actionAndObject = getActionAndObject(node.getName(), node.getAnnotations());
					if (actionAndObject != null) {
						String action = actionAndObject[0];
						String object1 = actionAndObject[1];
						if (!action.equals(""))
							ontology.addActionToActivity(node.getName(), action);
						if (!object1.equals(""))
							ontology.addObjectToActivity(node.getName(), object1);
					}
				}

			} else if (node.getType().equals("uml:DecisionNode")) {

			}

		}

		for (XMIEdge edge : edgesWithCondition) {

			ontology.addTransition(((XMIActivityNode) edge.getSourceNode()).getName(),
					((XMIActivityNode) edge.getTargetNode()).getName());
			ontology.connectActivityDiagramToTransition(diagramName,
					((XMIActivityNode) edge.getSourceNode()).getName(),
					((XMIActivityNode) edge.getTargetNode()).getName());
			if (edge.getCondition() != null) {
				ontology.addConditionToTransition(edge.getCondition(),
						((XMIActivityNode) edge.getSourceNode()).getName(),
						((XMIActivityNode) edge.getTargetNode()).getName());
				// not needed
				// ontology.connectActivityDiagramToElement(diagramName,
				// edge.getCondition());
			}
		}

		for (XMIEdge edge : edgesWithoutCondition) {

			ontology.addTransition(((XMIActivityNode) edge.getSourceNode()).getName(),
					((XMIActivityNode) edge.getTargetNode()).getName());
			ontology.connectActivityDiagramToTransition(diagramName,
					((XMIActivityNode) edge.getSourceNode()).getName(),
					((XMIActivityNode) edge.getTargetNode()).getName());
		}

		System.out.println("\nFinish!");
	}

	/**
	 * Extracts the action and the object of an activity.
	 * 
	 * @param activity
	 *            the activity to be split.
	 * @param annotations
	 *            the annotations of this activity.
	 * @return a string array including the action in the first position and the
	 *         object in the second.
	 */
	protected static String[] getActionAndObject(String activity, String annotations) {
		String[] actobj = new String[2];
		actobj[0] = "";
		actobj[1] = "";
		if (annotations != null) {
			String[] annotationList = annotations.split("\\\\n");
			for (int i = 0; i < annotationList.length; i++) {
				String annotation = annotationList[i];
				String annType = annotation.split("\\\\t")[0].split(":")[1].substring(0, 1);
				if (annType.equals("T")) {
					String annotationType = annotation.split("\\\\t")[1].split("\\s+")[0];
					if (annotationType.equals("Action"))
						actobj[0] = annotation.split("\\\\t")[2];
					else if (annotationType.equals("Object"))
						actobj[1] = annotation.split("\\\\t")[2];
				}
			}
		}
		if (actobj[0].equals("") && actobj[1].equals(""))
			return null;
		return actobj;
	}

}
