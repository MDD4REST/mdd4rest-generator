package core.parser;

import java.awt.Point;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Parses the xmi activity uml diagram.
 * 
 * @author mkoutli
 *
 */
public class ActivityParser {

	ArrayList<XMIEdge> edges = new ArrayList<XMIEdge>();
	ArrayList<XMIEdge> edgesWithCondition = new ArrayList<XMIEdge>();
	ArrayList<XMIEdge> edgesWithoutCondition = new ArrayList<XMIEdge>();
	ArrayList<XMIActivityNode> nodes = new ArrayList<XMIActivityNode>();
	String type = "activity";
	private boolean correctXMI;

	/**
	 * Parses the given xmi document to fill the edges and nodes lists of this
	 * ActivityParser object. You need to use this method together with
	 * UMLRecognizer.makePapyrusCompliantUML or
	 * PapyrusGenerator.makeSourceUMLPapyrusCompliant() to produce correct xmi
	 * format.
	 * 
	 * @param doc
	 *            The xmi document to be parsed.
	 */
	public void Parsexmi(Document doc) {
		NodeList edgeList = doc.getElementsByTagName("edge");
		NodeList nodeList = doc.getElementsByTagName("node");
		// We set the correctXMI flag to false,
		// to indicate that we are setting up this ActivityParser using
		// incorrect XMI as input, i.e. as passed from UMLrecognizer
		correctXMI = false;

		buildNodesAndEdges(nodeList, edgeList);

		// for each node, we set the incoming and outgoing "edges"
		for (XMIActivityNode n : nodes) {
			ArrayList<String> incomingEdgesIds = n.getIncoming();
			ArrayList<String> outgoingEdgesIds = n.getOutgoing();

			// however, the node's source "edges" are actually nodes
			for (String s : incomingEdgesIds) {
				for (XMIActivityNode nn : nodes) {
					if (s.equals(nn.getId())) {
						n.setSourceNodes(nn);
					}
				}
			}
			// same with outgoing "edges"
			for (String s : outgoingEdgesIds) {
				for (XMIActivityNode nn : nodes) {
					if (s.equals(nn.getId())) {
						n.setDestinationNodes(nn);
					}
				}
			}
		}

		findEdgesWithoutCondition();

		// we check all nodes to find those that are condition nodes
		for (XMIActivityNode n : nodes) {
			// if the node is a condition node
			if (n.getType().equals("uml:DecisionNode") || n.getType().equals("uml:ForkNode")
					|| n.getType().equals("uml:JoinNode")) {
				ArrayList<XMIActivityNode> sourcesOfConditionNode = n.getSourceNodes();
				ArrayList<XMIActivityNode> destinationsOfConditionNode = n.getDestinationNodes();
				int i = 1;
				// we take all its source nodes
				for (XMIActivityNode source : sourcesOfConditionNode) {
					// and all its destination nodes
					for (XMIActivityNode destination : destinationsOfConditionNode) {
						// and we construct a new edge for each pair of source
						// and destination nodes
						XMIEdge e = new XMIEdge("", destination.getId(), source.getId(), "", "uml:ControlFlow", null);
						e.setSourceNode(source);
						e.setTargetNode(destination);
						// Then, if the initial condition node is a decision
						// node
						if (n.getType().equals("uml:DecisionNode")) {
							// we check all edges
							for (XMIEdge edge : edges) {
								// to find the one that starts from the initial
								// condition node
								// and goes to the current destination node
								if (destination.getId().equals(edge.getTarget())
										&& n.getId().equals(edge.getSource())) {
									// If this edge's name is empty, we set its
									// condition to the name of the initial node
									// plus an index
									// and also set the same condition to the
									// newly constructed edge
									if (edge.getName().isEmpty()) {
										edge.setCondition(n.getName() + "__" + i);
										e.setCondition(n.getName() + "__" + i);
										i++;
										// otherwise, if the edge's name is not
										// empty, we set its condition to the
										// name of the initial node plus the
										// edge's own name
										// and also set the same condition to
										// the newly constructed edge
									} else {
										edge.setCondition(n.getName() + "__" + edge.getName());
										e.setCondition(n.getName() + "__" + edge.getName());
									}
								}
							}
						}
						// Finally, we add the newly created edge to the set of
						// edges with condition
						edgesWithCondition.add(e);
					}
				}
			}
		}
	}

	/**
	 * Parses the given xmi document to fill the edges and nodes lists of this
	 * ActivityParser object.
	 * 
	 * @param doc
	 *            The xmi document to be parsed.
	 */
	public void parsePapyrusXMI(Document doc) {
		NodeList edgeList = doc.getElementsByTagName("edge");
		NodeList nodeList = doc.getElementsByTagName("node");
		// We set the correctXMI flag to true,
		// to indicate that we are setting up this ActivityParser using correct
		// XMI as input e.g. XMI from a papyrus model
		// If this is not the case, method findEdge() will change the value to
		// false.
		correctXMI = true;

		buildNodesAndEdges(nodeList, edgeList);

		// for each node, we set the incoming and outgoing edges
		for (XMIActivityNode n : nodes) {
			ArrayList<String> incomingEdgeIds = n.getIncoming();
			ArrayList<String> outgoingEdgeIds = n.getOutgoing();

			// the node's incoming IDs are actually node IDs
			// Based on the incoming node ID we find the incoming edge
			for (String inEdgeID : incomingEdgeIds) {
				XMIEdge inEdge = findEdge(inEdgeID);
				n.getIncomingEdges().add(inEdge);
			}
			// same with outgoing IDs
			for (String outEdgeID : outgoingEdgeIds) {
				XMIEdge outEdge = findEdge(outEdgeID);
				n.getOutgoingEdges().add(outEdge);
			}
		}

		findEdgesWithoutCondition();

		// we check all nodes to find those that are condition nodes
		for (XMIActivityNode n : nodes) {
			// if the node is a condition node
			if (n.getType().equals("uml:DecisionNode") || n.getType().equals("uml:ForkNode")
					|| n.getType().equals("uml:JoinNode")) {
				ArrayList<XMIEdge> inEdges = n.getIncomingEdges();
				ArrayList<XMIEdge> outEdges = n.getOutgoingEdges();
				int i = 1;
				// we take all its incoming edges
				for (XMIEdge inEdge : inEdges) {
					// and all its outgoing edges
					for (XMIEdge outEdge : outEdges) {
						// and we construct a new edge
						XMIEdge e = new XMIEdge("", outEdge.getTarget(), inEdge.getSource(), "", "uml:ControlFlow",
								null);
						e.setSourceNode(inEdge.getSourceNode());
						e.setTargetNode(outEdge.getTargetNode());
						// Then, if the initial condition node is a decision
						// node
						if (n.getType().equals("uml:DecisionNode")) {
							// If the name of the outgoing edge is empty, we set
							// its condition to the name of the initial node
							// plus an index
							// and also set the same condition to the newly
							// constructed edge
							if (outEdge.getName().isEmpty()) {
								outEdge.setCondition(n.getName() + "__" + i);
								e.setCondition(n.getName() + "__" + i);
								i++;
								// otherwise, if the outgoing edge's name is not
								// empty, we set its condition to the name of
								// the initial node plus the edge's own name
								// and also set the same condition to the newly
								// constructed edge
							} else {
								outEdge.setCondition(n.getName() + "__" + outEdge.getName());
								e.setCondition(n.getName() + "__" + outEdge.getName());
							}
						}
						// At the end, we add the newly created edge to the set
						// of edges with condition
						edgesWithCondition.add(e);
					}
				}
			}
		}
	}

	/**
	 * 
	 * @return the nodes of the diagram.
	 */
	public ArrayList<XMIActivityNode> getNodes() {
		return nodes;
	}

	/**
	 * 
	 * @return the edges of the diagram
	 */
	public ArrayList<XMIEdge> getEdgesWithoutCondition() {
		return edgesWithoutCondition;
	}

	/**
	 * 
	 * @return the edges of the diagram
	 */
	public ArrayList<XMIEdge> getEdges() {
		return edges;
	}

	/**
	 * 
	 * @return the edges of the diagram
	 */
	public ArrayList<XMIEdge> getEdgesWithCondition() {
		return edgesWithCondition;
	}

	/**
	 * 
	 * @return the diagram's type
	 */
	public String getType() {
		return type;
	}

	public boolean isCorrectXMI() {
		return correctXMI;
	}

	/**
	 * Separates a string into different strings every time "_" character occurs
	 * and puts the strings in a list.
	 * 
	 * @param s:
	 *            the initial string
	 * @param list:
	 *            the empty list
	 * @return the list with the string values
	 */
	protected static ArrayList<String> substring(String s, ArrayList<String> list) {
		int startOfSubstring = 0;
		char delimeter = ' ';
		String trimmedS = s.trim();
		for (int i = 0; i < trimmedS.length(); i++) {
			if (trimmedS.charAt(i) == delimeter) {
				if (!trimmedS.substring(startOfSubstring, i).isEmpty()) {
					list.add(trimmedS.substring(startOfSubstring, i));
				} else {
					break;
				}
				startOfSubstring = i + 1;
			}
		}
		list.add(trimmedS.substring(startOfSubstring, trimmedS.length()));

		return list;
	}

	/**
	 * Split a string into coordinates.
	 * 
	 * @param s
	 * @param list
	 * @return
	 */
	protected static ArrayList<Point> substringCoordinates(String s, ArrayList<Point> list) {
		Pattern p = Pattern.compile("\\(([^)]+)\\)");
		Matcher m = p.matcher(s);
		String x = "";
		String y = "";
		while (m.find()) {
			String c = m.group(1);
			// System.out.println(m.group(1));
			for (int i = 0; i < c.length(); i++) {
				if (c.charAt(i) == ',') {
					x = c.substring(0, i);
					y = c.substring(i + 1);
				}
			}
			Point coor = new Point(Integer.valueOf(x), Integer.valueOf(y));
			list.add(coor);
		}

		return list;
	}

	public boolean checkParsedXmi() {
		final Display disp = Display.getCurrent();
		boolean xmiIsOk = true;
		boolean decisionNodesOk = true;
		boolean initialNodeOk = true;
		boolean finalNodeOk = true;
		boolean actionNodesOk = true;
		boolean joinNodesOk = true;
		boolean forkNodesOk = true;
		boolean edgesOk = true;
		String nodeOrEdgeString = correctXMI ? "edge" : "node";

		// if this ActivityParser does not have correct XMI content
		if (!correctXMI) {
			// checking for edge validity
			for (XMIEdge edge : edges) {
				if (edge.getSource().isEmpty() || edge.getTarget().isEmpty()) {
					edgesOk = false;
					disp.syncExec(new Runnable() {
						@Override
						public void run() {
							System.out.println(disp.getActiveShell() + "Error occured" + 
									"Edge with id " + edge.getId() + " should have both source and target nodes!");
						}
					});
					return false;
				}
			}
		}

		// checking for node validity
		for (XMIActivityNode n : nodes) {
			// checks for decision nodes
			if (n.getType().equals("uml:DecisionNode")) {
				for (int i = 0; i < n.getIncoming().size(); i++) {
					// check if an incoming ID is empty
					if (n.getIncoming().get(i).isEmpty()) {
						decisionNodesOk = false;

						disp.syncExec(new Runnable() {
							@Override
							public void run() {
								System.out.println(disp.getActiveShell() + "Error occured" +
										"Decision node with id " + n.getId() + " should have incoming "
												+ nodeOrEdgeString + "!");
							}
						});
						return false;
					}
				}
				// check if an outgoing ID is empty
				for (int i = 0; i < n.getOutgoing().size(); i++) {
					if (n.getOutgoing().get(i).isEmpty()) {
						decisionNodesOk = false;

						disp.syncExec(new Runnable() {
							@Override
							public void run() {
								System.out.println(disp.getActiveShell() + "Error occured" +
										"Decision node with id " + n.getId() + " should have outgoing "
												+ nodeOrEdgeString + "!");
							}
						});
						return false;
					}

				}
				// check if there are too few outgoing IDs
				if (n.getOutgoing().size() < 2) {
					decisionNodesOk = false;

					disp.syncExec(new Runnable() {
						@Override
						public void run() {
							System.out.println(disp.getActiveShell() + "Error occured" +
									"Decision node with id " + n.getId() + " should have at least two outgoing "
											+ nodeOrEdgeString + "s!");
						}
					});
					return false;
				}
				// checks for initial node
			} else if (n.getType().equals("uml:InitialNode")) {
				// check whether there are no outgoing IDs
				if (n.getOutgoing().size() == 0 || n.getOutgoing().get(0).isEmpty()) {
					initialNodeOk = false;

					disp.syncExec(new Runnable() {
						@Override
						public void run() {
							System.out.println(disp.getActiveShell() + "Error occured"+
									"Initial node with id " + n.getId() + " should have outgoing " + nodeOrEdgeString
											+ "!");
						}
					});
					return false;
				}
				// checks for activity final node
			} else if (n.getType().equals("uml:ActivityFinalNode")) {
				// check whether there are no incoming IDs
				if (n.getIncoming().size() == 0 || n.getIncoming().get(0).isEmpty()) {
					finalNodeOk = false;

					disp.syncExec(new Runnable() {
						@Override
						public void run() {
							System.out.println(disp.getActiveShell() + "Error occured"+ "Final node with id "
									+ n.getId() + " should have incoming " + nodeOrEdgeString + "!");
						}
					});
					return false;
				}
				// checks for opaque action
			} else if (n.getType().equals("uml:OpaqueAction")) {
				// check if there are both incoming and outgoing IDs present
				if (n.getIncoming().size() == 0 || n.getIncoming().get(0).isEmpty() || n.getOutgoing().size() == 0
						|| n.getOutgoing().get(0).isEmpty()) {
					actionNodesOk = false;

					disp.syncExec(new Runnable() {
						@Override
						public void run() {
							System.out.println(disp.getActiveShell() + "Error occured"+
									"Opaque Action node with id " + n.getId()
											+ " should have both incoming and outgoing " + nodeOrEdgeString + "s!");
						}
					});
					return false;
				}
				// checks for join node
			} else if (n.getType().equals("uml:JoinNode")) {
				// check if there are both incoming and outgoing IDs present
				if (n.getIncoming().size() == 0 || n.getIncoming().get(0).isEmpty() || n.getOutgoing().size() == 0
						|| n.getOutgoing().get(0).isEmpty()) {
					joinNodesOk = false;

					disp.syncExec(new Runnable() {
						@Override
						public void run() {
							System.out.println(disp.getActiveShell() + "Error occured"+ "Join node with id "
									+ n.getId() + " should have both incoming and outgoing " + nodeOrEdgeString + "s!");
						}
					});
					return false;
				}
				// check if there are too few outgoing IDs
				if (n.getIncoming().size() < 2) {
					joinNodesOk = false;

					disp.syncExec(new Runnable() {
						@Override
						public void run() {
							System.out.println(disp.getActiveShell() + "Error occured"+ "Join node with id "
									+ n.getId() + " should have at least two incoming " + nodeOrEdgeString + "s!");
						}
					});
					return false;
				}
				// checks for fork node
			} else if (n.getType().equals("uml:ForkNode")) {
				// check if there are both incoming and outgoing IDs present
				if (n.getIncoming().size() == 0 || n.getIncoming().get(0).isEmpty() || n.getOutgoing().size() == 0
						|| n.getOutgoing().get(0).isEmpty()) {
					forkNodesOk = false;

					disp.syncExec(new Runnable() {
						@Override
						public void run() {
							System.out.println(disp.getActiveShell() + "Error occured"+ "Fork node with id "
									+ n.getId() + " should have both incoming and outgoing " + nodeOrEdgeString + "s!");
						}
					});
					return false;
				}
				// check if there are too few outgoing IDs
				if (n.getOutgoing().size() < 2) {
					forkNodesOk = false;

					disp.syncExec(new Runnable() {
						@Override
						public void run() {
							System.out.println(disp.getActiveShell() + "Error occured"+ "Fork node with id "
									+ n.getId() + " should have at least two outgoing " + nodeOrEdgeString + "s!");
						}
					});
					return false;
				}
			}

		}
		xmiIsOk = actionNodesOk && finalNodeOk && initialNodeOk && decisionNodesOk && joinNodesOk && forkNodesOk
				&& edgesOk;
		return xmiIsOk;
	}

	public boolean checkParsedXmiForPapyrus(Display display) {
		final Display disp;
		if (display != null) {
			disp = display;
		} else {
			disp = Display.getCurrent();
		}
		ArrayList<String> edgeIDsToDelete = new ArrayList<String>();
		boolean edgesOk = true;

		for (int i = edges.size() - 1; i >= 0; i--) {
			if (edges.get(i).getSource().isEmpty() || edges.get(i).getTarget().isEmpty()) {
				edgeIDsToDelete.add(edges.get(i).getId());
				edges.remove(edges.get(i));
			}
		}
		for (int i = edges.size() - 1; i >= 0; i--) {
			boolean sourceIsConditionNode = false;

			if (((XMIActivityNode) edges.get(i).getSourceNode()).getType().equals("uml:DecisionNode")) {
				sourceIsConditionNode = true;
			}

			if (!edges.get(i).getName().isEmpty() && !sourceIsConditionNode) {
				edges.get(i).setName("");
			}
		}
		if (!edgeIDsToDelete.isEmpty()) {
			disp.syncExec(new Runnable() {
				@Override
				public void run() {
					String deletedIDs = "";
					boolean firstLine = true;
					for (String id : edgeIDsToDelete) {
						if (!firstLine)
							deletedIDs += "\n";
						else
							firstLine = false;
						deletedIDs += id;
					}
					System.out.println(disp.getActiveShell()+ "Problematic edges found and removed" +
							"The edges with the following IDs were removed, as they were missing a source node, target node or both:\n"
									+ deletedIDs);
				}
			});
		}
		return edgesOk;
	}

	private XMIEdge findEdge(String edgeID) {
		XMIEdge correspondingEdge = null;
		int index = edges.indexOf(new XMIEdge(edgeID));
		if (index >= 0) {
			correspondingEdge = edges.get(index);
		} else {
			correctXMI = false;
		}
		return correspondingEdge;
	}

	private void buildNodesAndEdges(NodeList nodeList, NodeList edgeList) {
		// we build the edges of the graph
		for (int i = 0; i < edgeList.getLength(); i++) {

			Node nNode = edgeList.item(i);

			if (nNode.getNodeType() == Node.ELEMENT_NODE) {

				Element eElement = (Element) nNode;

				String coordinates = eElement.getAttribute("coordinates");
				ArrayList<Point> coordinatesList = new ArrayList<Point>();
				coordinatesList = substringCoordinates(coordinates, coordinatesList);

				XMIEdge edge = new XMIEdge(eElement.getAttribute("name"), eElement.getAttribute("target"),
						eElement.getAttribute("source"), eElement.getAttribute("xmi:id"),
						eElement.getAttribute("xmi:type"), coordinatesList);
				System.out.println("\nCurrent Element :" + edge.getName() + ", type: " + edge.getType());
				edges.add(edge);
			}
		}

		// we build the nodes of the graph
		for (int i = 0; i < nodeList.getLength(); i++) {

			Node nNode = nodeList.item(i);

			if (nNode.getNodeType() == Node.ELEMENT_NODE) {

				Element eElement = (Element) nNode;
				String incomingString = eElement.getAttribute("incoming");
				String outgoingString = eElement.getAttribute("outgoing");
				ArrayList<String> incoming = new ArrayList<String>();
				ArrayList<String> outgoing = new ArrayList<String>();

				// these lists contain either edge or node IDs,
				// depending on whether we are parsing correct XMI or not
				incoming = substring(incomingString, incoming);
				outgoing = substring(outgoingString, outgoing);

				String coordinates = eElement.getAttribute("coordinates");
				ArrayList<Point> coordinatesList = new ArrayList<Point>();
				coordinatesList = substringCoordinates(coordinates, coordinatesList);

				XMIActivityNode node = new XMIActivityNode(eElement.getAttribute("xmi:type"),
						eElement.getAttribute("xmi:id"), eElement.getAttribute("name"),
						eElement.getAttribute("annotations"), coordinatesList, incoming, outgoing);

				System.out.println("\nCurrent Element :" + node.getName() + ", type: " + node.getType());
				nodes.add(node);
			}
		}

		// for each edge, we set the source and target nodes according to their
		// IDs
		for (XMIEdge e : edges) {
			for (XMIActivityNode n : nodes) {
				if (e.getSource().equals(n.getId())) {
					e.setSourceNode(n);
				}
				if (e.getTarget().equals(n.getId())) {
					e.setTargetNode(n);
				}
			}
		}
	}

	private void findEdgesWithoutCondition() {
		// we check all edges to find those without condition
		boolean sourceOK = false;
		boolean targetOK = false;
		for (XMIEdge e : edges) {
			// we check whether its source node is NOT a decision, fork or join
			// node
			if (((XMIActivityNode) e.getSourceNode()) != null) {
				if (!(((XMIActivityNode) e.getSourceNode()).getType().equals("uml:DecisionNode")
						|| ((XMIActivityNode) e.getSourceNode()).getType().equals("uml:ForkNode")
						|| ((XMIActivityNode) e.getSourceNode()).getType().equals("uml:JoinNode"))) {

					sourceOK = true;

				} else {
					sourceOK = false;
				}
			}
			// similarly, we check whether its target node is NOT a decision,
			// fork or join node
			if (((XMIActivityNode) e.getTargetNode()) != null) {
				if (!(((XMIActivityNode) e.getTargetNode()).getType().equals("uml:DecisionNode")
						|| ((XMIActivityNode) e.getTargetNode()).getType().equals("uml:ForkNode")
						|| ((XMIActivityNode) e.getTargetNode()).getType().equals("uml:JoinNode"))) {

					targetOK = true;
				} else {
					targetOK = false;
				}
			}

			// if both source and target nodes are NOT of decision, fork or join
			// type, we add the edge to
			// the list of edges without condition
			if (sourceOK && targetOK) {
				if (!edgesWithoutCondition.contains(e)) {
					edgesWithoutCondition.add(e);
				}
			}
		}
	}
}
