package core.handlers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IFile;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import core.ontology.DynamicOntologyAPI;
import core.ontology.StaticOntologyAPI;
import core.parser.*;

/**
 * A command handler for exporting a uml diagram to the dynamic or static
 * ontology.
 * 
 * @author amirdeljouyi
 */
public class ExportToOntologyHandler {

	public void execute(String path) {
		File file = new File(path);
		instantiateOntology(file);
	}

	public void execute() {
		File file = new File("resources/activity diagram/model.uml");
		instantiateOntology(file);
	}

	/**
	 * Returns the XML document of a file.
	 * 
	 * @param file the file of which the XML document is returned.
	 * @return the XML document of the file, or null if there is a parsing error.
	 */
	protected Document getXMIDocOfFile(File file) {
		Document doc = null;
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			doc = docBuilder.parse(file);
			doc.getDocumentElement().normalize();
			NodeList nodeList = doc.getElementsByTagName("node");
//			for(int i =0; i<nodeList.getLength(); i++) {
//				System.out.println(nodeList.item(i).getLocalName());
//			}
//			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
		return doc;
	}

	/**
	 * Returns the diagram type of an XMI file.
	 * 
	 * @param file the file of which diagram the type is returned.
	 * @return the diagram type of the given file, either "UseCaseDiagram" or
	 *         "ActivityDiagram" (or "Error" if there is a parsing error).
	 */
	protected String getDiagramType(Document doc) {
		String sourceUMLType = "Error";

		Element root = doc.getDocumentElement();
		Node packagedElement = root.getFirstChild().getNextSibling();
		while (packagedElement != null) {
			if (packagedElement.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) packagedElement;
				String xmiType = eElement.getAttribute("xmi:type");
				if (xmiType.equalsIgnoreCase("uml:UseCase") || xmiType.equalsIgnoreCase("uml:Actor")) {
					sourceUMLType = "UseCaseDiagram";
					break;
				} else if (xmiType.equalsIgnoreCase("uml:Activity")) {
					sourceUMLType = "ActivityDiagram";
					break;
				}
			}
			packagedElement = packagedElement.getNextSibling();
		}

		return sourceUMLType;
	}

	/**
	 * Instantiates the ontology given the file of a uml diagram.
	 * 
	 * @param file an {@link IFile} instance of a uml diagram.
	 */
	protected void instantiateOntology(File file) {
//		InputStream fileStream;
//		try {
//			fileStream = new FileInputStream(file);
//			int i;
//			char c;
//			while ((i = fileStream.read()) != -1) {
//
//				// converts integer to character
//				c = (char) i;
//
//				// prints character
//				System.out.print(c);
//			}
			Document doc = getXMIDocOfFile(file);
			System.out.println("doc: " + doc.getTextContent());

			if (doc != null) {
				String diagramType = getDiagramType(doc);
				System.out.println("type" + diagramType);
//				System.out.println(doc.getDocumentElement().get);

//				System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
				if (diagramType.equals("ActivityDiagram")) {
					DynamicOntologyAPI ontology = new DynamicOntologyAPI(file.getName());
					instantiateDynamicOntology(doc, file, ontology);
					ontology.close();
				}
//				else if (diagramType.equals("UseCaseDiagram")) {
//					StaticOntologyAPI ontology = new StaticOntologyAPI(file.getName());
//					instantiateStaticOntology(doc, file, ontology);
//					ontology.close();
//				}
			}
//		} 
//		catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	/**
	 * Instantiates the dynamic ontology given the file of a UML Activity diagram.
	 * 
	 * @param file     an {@link IFile} instance of a UML Activity diagram.
	 * @param ontology the dynamic ontology instance to be instantiated.
	 */
	protected void instantiateDynamicOntology(Document doc, File file, DynamicOntologyAPI ontology) {
		String filename = file.getName();
		String diagramName = filename.substring(0, filename.lastIndexOf('.'));
		diagramName = "ACD_" + diagramName.substring(diagramName.lastIndexOf('\\') + 1);
		ontology.addActivityDiagram(diagramName);
		ActivityParser parser = new ActivityParser();
		parser.parsePapyrusXMI(doc);
		ArrayList<XMIEdge> edgesWithCondition = parser.getEdgesWithCondition();
		ArrayList<XMIEdge> edgesWithoutCondition = parser.getEdgesWithoutCondition();
		ArrayList<XMIEdge> edges = parser.getEdges();
		ArrayList<XMIActivityNode> nodes = parser.getNodes();
		if (parser.checkParsedXmi()) {
			WriteDynamicOntology.modifyOntology(edgesWithCondition, edgesWithoutCondition, edges, nodes, ontology,
					diagramName);
		}
	}

}
