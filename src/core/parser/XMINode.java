/**
 * 
 */
package core.parser;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

/**
 * @author tsirelis
 *
 */
public class XMINode {
	
	protected String type;
	protected String id;
	protected String name;
	protected String annotations;
	protected List<Point> coordinates =  new ArrayList<Point>();
	
	/**
	 * The constructors
	 */
	public XMINode() {
		this.type = "";
		this.id = "";
		this.name = "";
		this.annotations = "";
	}

	public XMINode(String id) {
		this.type = "";
		this.id = id;
		this.name = "";
		this.annotations = "";
	}
	
	public XMINode(String type, String id, String name, String annotations, ArrayList<Point> coordinates) {
		this.type = type;
		this.id = id;
		this.name = name;
		this.annotations = annotations;
		this.coordinates = coordinates;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof XMINode) {
			XMINode oNode = (XMINode)o;
			if (!this.id.isEmpty() && this.id.equals(oNode.getId())) {
				return true;
			}
		}
		return super.equals(o);
	}
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the annotations
	 */
	public String getAnnotations() {
		return annotations;
	}
	/**
	 * @param annotations the annotations to set
	 */
	public void setAnnotations(String annotations) {
		this.annotations = annotations;
	}
	/**
	 * @return the coordinates
	 */
	public List<Point> getCoordinates() {
		return coordinates;
	}
	/**
	 * @param coordinates the coordinates to set
	 */
	public void setCoordinates(ArrayList<Point> coordinates) {
		this.coordinates = coordinates;
	}
	
}
