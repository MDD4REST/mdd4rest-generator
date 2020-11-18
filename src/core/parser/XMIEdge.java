package core.parser;

import java.awt.Point;
import java.util.ArrayList;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * A class that represents a transition in the ontology.
 * 
 * @author mkoutli
 *
 */
public class XMIEdge {
	
	public static final String ASSOCIATION_TYPE = "uml:Association";
	public static final String GENERALIZATION_TYPE = "uml:Generalization";
	public static final String INCLUDE_TYPE = "uml:Include";
	public static final String EXTEND_TYPE = "uml:Extend";
// following are not yet parsed
//	public static final String REALIZATION_TYPE = "uml:Realization";
//	public static final String ABSTRACTION_TYPE = "uml:Abstraction";
//	public static final String USAGE_TYPE = "uml:Usage";
//	public static final String DEPENDENCY_TYPE = "uml:Dependency";
	
	private String name;
	private String target;
	private String source;
	private Object targetNode;
	private Object sourceNode;
	private String id;
	private String type;
	private String condition;
	private ArrayList<Point> coordinates;
	
	public XMIEdge() {
		this.name = "";
		this.target = "";
		this.source = "";
		this.id = "";
		this.type = "";
		this.coordinates = new ArrayList<Point>();
	}

	public XMIEdge(String id) {
		this.name = "";
		this.target = "";
		this.source = "";
		this.id = id;
		this.type = "";
		this.coordinates = new ArrayList<Point>();
	}
	
	public XMIEdge(String name, String target, String source, String id, String type, ArrayList<Point> coordinates) {
		this.name = name;
		this.target = target;
		this.source = source;
		this.id = id;
		this.type = type;
		this.coordinates = coordinates;
	}
	
	public static boolean isEdgeType(Element e) {
		switch (e.getAttribute("xmi:type")) {
			case ASSOCIATION_TYPE: return true;
			case GENERALIZATION_TYPE: return true;
			case INCLUDE_TYPE: return true;
			case EXTEND_TYPE: return true;
// following are not yet parsed
//			case REALIZATION_TYPE: return true;
//			case ABSTRACTION_TYPE: return true;
//			case USAGE_TYPE: return true;
//			case DEPENDENCY_TYPE: return true;
			default: return false;
		}
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof XMIEdge) {
			XMIEdge oEdge = (XMIEdge)o;
			if (!this.id.isEmpty() && this.id.equals(oEdge.getId())) {
				return true;
			}
		}
		return super.equals(o);
	}
	
	// Getters and Setters
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getTarget() {
		return this.target;
	}

	public String getSource() {
		return this.source;
	}
	
	public Object getTargetNode() {
		return this.targetNode;
	}
	
	public void setTargetNode(Object target) {
		this.targetNode = target;
	}

	public Object getSourceNode() {
		return this.sourceNode;
	}
	
	public void setSourceNode(Object source) {
		this.sourceNode = source;
	}

	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getCondition() {
		return this.condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	/**
	 * @return the coordinates
	 */
	public ArrayList<Point> getCoordinates() {
		return coordinates;
	}

	/**
	 * @param coordinates the coordinates to set
	 */
	public void setCoordinates(ArrayList<Point> coordinates) {
		this.coordinates = coordinates;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
}
