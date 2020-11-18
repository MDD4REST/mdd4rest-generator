package core.parser;

import java.awt.Point;
import java.util.ArrayList;

/**
 * A class that represents an activity/condition/initial/final node in the
 * ontology.
 * 
 * @author mkoutli
 *
 */
public class XMIActivityNode extends XMINode {
	private ArrayList<String> incoming = new ArrayList<String>();
	private ArrayList<String> outgoing = new ArrayList<String>();

	private ArrayList<XMIActivityNode> sourceNodes = new ArrayList<XMIActivityNode>();
	private ArrayList<XMIActivityNode> destinationNodes = new ArrayList<XMIActivityNode>();
	private ArrayList<XMIEdge> incomingEdges = new ArrayList<XMIEdge>();
	private ArrayList<XMIEdge> outgoingEdges = new ArrayList<XMIEdge>();
	
	public XMIActivityNode() {
		super();
	}

	public XMIActivityNode(String type, String id, String name, String annotations, ArrayList<Point> coordinates, ArrayList<String> incoming, ArrayList<String> outgoing) {
		super(type, id, name, annotations, coordinates);
		this.incoming = incoming;
		this.outgoing = outgoing;
	}

	// Getters and Setters

	public ArrayList<String> getIncoming() {
		return this.incoming;
	}
	
	public void setIncoming(String oldValue, String newValue) {
		this.incoming.remove(oldValue);
		this.incoming.add(newValue);
	}

	public ArrayList<String> getOutgoing() {
		return this.outgoing;
	}
	
	public void setOutgoing(String oldValue, String newValue) {
		this.outgoing.remove(oldValue);
		this.outgoing.add(newValue);
	}
	
	public ArrayList<XMIActivityNode> getSourceNodes() {
		return this.sourceNodes;
	}
	
	public void setSourceNodes(XMIActivityNode node) {
		this.sourceNodes.add(node);
	}

	public ArrayList<XMIActivityNode> getDestinationNodes() {
		return this.destinationNodes;
	}

	public void setDestinationNodes(XMIActivityNode node) {
		this.destinationNodes.add(node);
	}
	

	public ArrayList<XMIEdge> getIncomingEdges() {
		return incomingEdges;
	}
	

	public ArrayList<XMIEdge> getOutgoingEdges() {
		return outgoingEdges;
	}

}

