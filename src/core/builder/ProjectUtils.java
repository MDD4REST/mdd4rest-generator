package core.builder;

import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.QualifiedName;

import core.Activator;


/**
 * Utility methods for project handling.
 * 
 * @author Marin Orlic
 */
public class ProjectUtils 
{
    /** Path to project folders for requirements. */
    public static final String REQUIREMENTS_FOLDER = "eu.scasefp7.eclipse.core.ui.rqsFolder"; //NON-NLS-1$

    /** Path to project folders for requirements. */
    public static final String COMPOSITIONS_FOLDER = "eu.scasefp7.eclipse.core.ui.compFolder"; //$NON-NLS-1$

    /** Path to project folders for requirements. */
    public static final String MODELS_FOLDER = "eu.scasefp7.eclipse.core.ui.modelsFolder"; //$NON-NLS-1$
    
    /** Path to project folders for requirements. */
    public static final String OUTPUT_FOLDER = "eu.scasefp7.eclipse.core.ui.outputFolder"; //$NON-NLS-1$
    
    /** Project domain. */
    public static final String PROJECT_DOMAIN = "eu.scasefp7.eclipse.core.projectDomain"; //$NON-NLS-1$
    
    /** Default project domain (unset). */
    public static final int PROJECT_DOMAIN_DEFAULT = -1;
    
    /** Configuration problem marker */
    public static final String CONFIG_MARKER_TYPE = "eu.scasefp7.eclipse.core.configurationMarker";

    /**
	 * Returns the project that the selected resource(s) belong to.
	 * 
	 * @param selectionList the selected resource(s).
	 * @return the project that the selected resource(s) belong to.
	 */
	public static IProject getProjectOfSelectionList(List<Object> selectionList) {
		IProject project = null;
		for (Object object : selectionList) {
			IProject theproject = getProjectOfSelectionElement(object);
			if (theproject != null) {
				if (project == null) {
					project = theproject;
				} else {
					if (!project.equals(theproject)) {
						return null;
					}
				}
			}
		}
		return project;
	}

    /**
     * Returns the project that the selected resource belongs to.
     * 
     * @param element the selected resource.
     * @return the project that the selected resources belong to.
     */
    public static IProject getProjectOfSelectionElement(Object element) {
        IProject project = null;
        IResource resource = (IResource) Platform.getAdapterManager().getAdapter(element, IResource.class);
        if (resource != null) {
            project = resource.getProject();
        } else {
            project = (IProject) Platform.getAdapterManager().getAdapter(element, IProject.class);
        }
        return project;
    }
    
    /**
     * Checks if the project exists, is opened and has the S-CASE nature configured.
     * 
     * @param project to check
     * @return true if both the project and the S-CASE nature are available
     */
    public static boolean hasNature(IProject project) {
        try {
            return project.exists() && project.isOpen() && project.hasNature(ScaseNature.NATURE_ID);
        } catch (CoreException e) {
            Activator.log("Unable to check if project nature is configured.", e);
        }
        return false;
    }
    
    /**
     * Adds the S-CASE nature to the project.
     * 
     * @param project to add the nature to
     * @param monitor progress monitor
     * @throws CoreException
     */
    public static void addNature(IProject project, IProgressMonitor monitor) throws CoreException {
        if(isValidJavaIdentifier(project.getName())) {
            try {
                IProjectDescription description = project.getDescription();
                String[] natures = description.getNatureIds();
                String[] newNatures = new String[natures.length + 1];
                System.arraycopy(natures, 0, newNatures, 0, natures.length);
                newNatures[natures.length] = ScaseNature.NATURE_ID;
                description.setNatureIds(newNatures);
                project.setDescription(description, monitor);
            } catch (CoreException e) {
                Activator.log("Unable to add S-CASE project nature to project.", e);
            }
        } else {
            setProjectMarker(project, "Project name is not a valid Java identifier", IMarker.SEVERITY_ERROR, IMarker.PRIORITY_HIGH, "(configuration)");
        }
    }

    /**
     * Add a marker to the project.
     * 
     * @param project to add marker on.
     * @param message of the marker.
     * @param severity of the marker.
     * @param priority of the marker.
     * @param location of the marker.
     */
    public static void setProjectMarker(IProject project, String message, int severity, int priority, String location) {
        try {
            IMarker marker = project.createMarker(CONFIG_MARKER_TYPE);
            marker.setAttribute(IMarker.MESSAGE, message);
            marker.setAttribute(IMarker.SEVERITY, severity);
            marker.setAttribute(IMarker.PRIORITY, priority);
            marker.setAttribute(IMarker.LOCATION, location);
        } catch (CoreException e) {
            Activator.log("Unable to set marker", e);
        }
    }
    
    
    /**
     * Clear all project markers.
     *
     * @param project to clear markers.
     */
    public static void clearProjectMarkers(IProject project) {
        try {
            project.deleteMarkers(CONFIG_MARKER_TYPE, false, IResource.DEPTH_ZERO);
        } catch (CoreException e) {
            Activator.log("Unable to clear marker", e);
        }
    }
    
    
    /**
     * Sets the project models folder property.
     * 
     * @param project to configure
     * @param path to set as models path
     */
    public static void setProjectModelsPath(IProject project, String path) {
        try {
            project.setPersistentProperty(new QualifiedName("", MODELS_FOLDER), path);
        } catch (CoreException e) {
            Activator.log("Unable to set project property.", e);
        }
    }
    
    /**
     * Reads the project models folder property.
     * 
     * @param project to configure
     * @return path set as models path
     */
    public static String getProjectModelsPath(IProject project) {
        String path = "";
        try {
            path = project.getPersistentProperty(new QualifiedName("", MODELS_FOLDER));
        } catch (CoreException e) {
            Activator.log("Error retrieving project property.", e);
        }
        return path;
    }
    
    /**
     * Gets the project models folder.
     * 
     * @param project
     * @return models folder
     */
    public static IContainer getProjectModelsFolder(IProject project) {
        String path = getProjectModelsPath(project);
        IContainer container = project;
        if (path != null) {
            IResource folder = project.findMember(new Path(path));
            if (folder != null && folder.exists()) {
                container = (IContainer) folder;
            }
        }
        return container;
    }
    
    /**
     * Sets the project requirements folder property.
     * 
     * @param project to configure
     * @param path to set as requirements path
     */
    public static void setProjectRequirementsPath(IProject project, String path) {
        try {
            project.setPersistentProperty(new QualifiedName("", REQUIREMENTS_FOLDER), path);
        } catch (CoreException e) {
            Activator.log("Unable to set project properties.", e);
        }
    }
    
    /**
     * Reads the project requirements folder property.
     * 
     * @param project to configure
     * @return path set as requirements path
     */
    public static String getProjectRequirementsPath(IProject project) {
        String path = "";
        try {
            path = project.getPersistentProperty(new QualifiedName("", REQUIREMENTS_FOLDER));
        } catch (CoreException e) {
            Activator.log("Error retrieving project property.", e);
        }
        return path;
    }
    
    /**
     * Gets the project requirements folder.
     * 
     * @param project
     * @return models folder
     */
    public static IContainer getProjectRequirementsFolder(IProject project) {
        String path = getProjectRequirementsPath(project);
        IContainer container = project;
        if (path != null) {
            IResource folder = project.findMember(new Path(path));
            if (folder != null && folder.exists()) {
                container = (IContainer) folder;
            }
        }
        return container;
    }
    
    /**
     * Sets the project compositions folder property.
     * 
     * @param project to configure
     * @param path to set as compositions path
     */
    public static void setProjectCompositionsPath(IProject project, String path) {
        try {
            project.setPersistentProperty(new QualifiedName("", COMPOSITIONS_FOLDER), path);
        } catch (CoreException e) {
            Activator.log("Unable to set project property.", e);
        }
    }
    
    /**
     * Reads the project compositions folder property.
     * 
     * @param project to configure
     * @return path set as compositions path
     */
    public static String getProjectCompositionsPath(IProject project) {
        String path = "";
        try {
            path = project.getPersistentProperty(new QualifiedName("", COMPOSITIONS_FOLDER));
        } catch (CoreException e) {
            Activator.log("Error retrieving project property.", e);
        }
        return path;
    }
    
    /**
     * Gets the project compositions folder.
     * 
     * @param project
     * @return compositions folder
     */
    public static IContainer getProjectCompositionsFolder(IProject project) {
        String path = getProjectCompositionsPath(project);
        IContainer container = project;
        if (path != null) {
            IResource folder = project.findMember(new Path(path));
            if (folder != null && folder.exists()) {
                container = (IContainer) folder;
            }
        }
        return container;
    }
    
    /**
     * Sets the project output folder property.
     * 
     * @param project to configure
     * @param path to set as output path
     */
    public static void setProjectOutputPath(IProject project, String path) {
        try {
            project.setPersistentProperty(new QualifiedName("", OUTPUT_FOLDER), path);
        } catch (CoreException e) {
            Activator.log("Unable to set project property.", e);
        }
    }
    
    /**
     * Reads the project output folder property.
     * 
     * @param project to configure
     * @return path set as ouput path
     */
    public static String getProjectOutputPath(IProject project) {
        String path = "";
        try {
            path = project.getPersistentProperty(new QualifiedName("", OUTPUT_FOLDER));
        } catch (CoreException e) {
            Activator.log("Error retrieving project property.", e);
        }
        return path;
    }
    
    /**
     * Gets the project output folder.
     * 
     * @param project
     * @return output folder
     */
    public static IContainer getProjectOutputFolder(IProject project) {
        String path = getProjectOutputPath(project);
        IContainer container = project;
        if (path != null) {
            IResource folder = project.findMember(new Path(path));
            if (folder != null && folder.exists()) {
                container = (IContainer) folder;
            }
        }
        return container;
    }
    
    /**
     * Gets the project domain.
     * 
     * @param project
     * @return domain
     */
    public static int getProjectDomain(IProject project) {
        try {
            String domain = project.getPersistentProperty(new QualifiedName("", PROJECT_DOMAIN));
            if(domain != null) {
                return Integer.parseInt(domain);
            }
        } catch (CoreException ce) {
            Activator.log("Error retrieving project property.", ce);
        } catch (NumberFormatException nfe) {
            Activator.log("Error parsing project domain.", nfe);
        }
        return PROJECT_DOMAIN_DEFAULT;
    }

    /**
     * Sets the project domain property.
     * 
     * @param project to configure
     * @param domain to set
     */
    public static void setProjectDomain(IProject project, int domain) {
        try {
            project.setPersistentProperty(new QualifiedName("", PROJECT_DOMAIN), Integer.toString(domain));
        } catch (CoreException e) {
            Activator.log("Unable to set project property.", e);
        }
    }

    /**
     * Checks if a string is a valid Java identifier.
     * 
     * @param name
     * @return true if project name is valid
     */
    public final static boolean isValidJavaIdentifier(String name) {
         // an empty or null string cannot be a valid identifier
         if (name == null || name.length() == 0) {
             return false;
         }
    
         char[] c = name.toCharArray();
         if (!Character.isJavaIdentifierStart(c[0])) {
             return false;
         }
    
         for (int i = 1; i < c.length; i++) {
             if (!Character.isJavaIdentifierPart(c[i])) {
                 return false;
             }
         }
    
         return true;
    }
}

