package core.ontology;

//import core.builder.ProjectUtils;
import core.ontology.OntologySource.OntologyType;

/**
 * Contains helper functions that check whether an ontology file exists.
 * 
 * @author themis
 */
public class OntologyHelpers {

    /** This class should not be instantiated. */
    private OntologyHelpers()
    {   
    }
    
	/**
	 * Checks whether the given project contains the ontology in the models folder location.
	 * 
	 * @param project the project to check for the ontology file.
	 * @param ontologyFilename the filename of the ontology to check if it exists.
	 * @return {@code true} if the ontology exists, or {@code false} otherwise.
	 */
//	private static boolean projectHasOntology(IProject project, String ontologyFilename) {
//		IContainer container = ProjectUtils.getProjectModelsFolder(project);
//		return container.getFile(new Path(ontologyFilename)).exists();
//	}
//
//	/**
//	 * Checks whether the given project contains the static ontology in the models folder location.
//	 * 
//	 * @param project the project to check for the ontology file.
//	 * @return {@code true} if the ontology exists, or {@code false} otherwise.
//	 */
//	public static boolean projectHasStaticOntology(IProject project) {
//		return projectHasOntology(project, OntologyJenaAPI.getFilenameForOntologyType(OntologyType.STATIC));
//	}
//
//	/**
//	 * Checks whether the given project contains the dynamic ontology in the models folder location.
//	 * 
//	 * @param project the project to check for the ontology file.
//	 * @return {@code true} if the ontology exists, or {@code false} otherwise.
//	 */
//	public static boolean projectHasDynamicOntology(IProject project) {
//		return projectHasOntology(project, OntologyJenaAPI.getFilenameForOntologyType(OntologyType.DYNAMIC));
//	}
//
//	/**
//	 * Checks whether the given project contains the linked ontology in the models folder location.
//	 * 
//	 * @param project the project to check for the ontology file.
//	 * @return {@code true} if the ontology exists, or {@code false} otherwise.
//	 */
//	public static boolean projectHasLinkedOntology(IProject project) {
//		return projectHasOntology(project, OntologyJenaAPI.getFilenameForOntologyType(OntologyType.LINKED));
//	}
}
