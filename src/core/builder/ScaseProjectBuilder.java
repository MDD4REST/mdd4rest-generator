package core.builder;

import java.util.Map;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.Parameterization;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.services.IServiceLocator;

import core.Activator;

/**
 * Builder for S-CASE projects.
 * 
 * @author Leonora Gašpar
 * @author Marin Orlić
 *
 */
public class ScaseProjectBuilder extends IncrementalProjectBuilder {

    /**
     * Builder ID
     */
    public static final String BUILDER_ID = "eu.scasefp7.eclipse.core.scaseBuilder";

    /** Problem marker */
    public static final String MARKER_TYPE = "eu.scasefp7.eclipse.core.problemMarker";

    /** Configuration problem marker */
    public static final String CONFIG_MARKER_TYPE = "eu.scasefp7.eclipse.core.configurationMarker";
    
    class SampleDeltaVisitor implements IResourceDeltaVisitor {

        public boolean visit(IResourceDelta delta) throws CoreException {
            // IResource resource = delta.getResource();
            switch (delta.getKind()) {
            case IResourceDelta.ADDED:
                break;
            case IResourceDelta.REMOVED:
                break;
            case IResourceDelta.CHANGED:
                break;
            }

            return true;
        }
    }

    class SampleResourceVisitor implements IResourceVisitor {
        boolean fileExsists = false;
        int fileCount = 0;
        IFile firstXmlFile;

        public boolean visit(IResource resource) {
//            boolean other = checkXML(resource);

//            if (resource instanceof IFile && resource.getName().endsWith(".rqs"))
//                executeCommand("eu.scasefp7.eclipse.reqeditor.commands.exportToOntology", resource.getFullPath()
//                        .toString());
//
//            if (resource instanceof IFile && resource.getName().endsWith(".sbd"))
//                executeCommand("eu.scasefp7.eclipse.storyboards.commands.exportToOntology", resource.getFullPath()
//                        .toString());

            
//            if (resource instanceof IFile && (
//                    resource.getName().equals("StaticOntology.owl")
//                    || resource.getName().equals("DynamicOntology.owl"))) {
//                executeCommand("eu.scasefp7.eclipse.core.commands.linkOntologies");
//            }
            
            
            
//            
//            if (fileExsists && other) {
//                if (fileCount < 2)
//                    addMarker(firstXmlFile, "The project must contain only one .xml file", 1, IMarker.SEVERITY_ERROR);
//                addMarker((IFile) resource, "The project must contain only one .xml file", 1, IMarker.SEVERITY_ERROR);
//                fileCount++;
//            }
//
//            if (!fileExsists && other) {
//                fileCount++;
//                fileExsists = true;
//                firstXmlFile = (IFile) resource;
//            }

            // return true to continue visiting children.
            return true;
        }
    }

    boolean checkXML(IResource resource) {
        if (resource instanceof IFile && resource.getName().endsWith(".xml")) {
            return true;
        }
        return false;
    }

    protected void executeCommand(String commandId) throws NotDefinedException, NotHandledException, NotEnabledException, ExecutionException {
        // Obtain IServiceLocator implementer, e.g. from PlatformUI.getWorkbench():
        IServiceLocator serviceLocator = PlatformUI.getWorkbench();
        // or a site from within a editor or view:
        // IServiceLocator serviceLocator = getSite();
        IHandlerService handlerService = (IHandlerService) serviceLocator.getService(IHandlerService.class);
        // Execute commmand via its ID
		System.out.println(handlerService);
//            handlerService.executeCommand(commandId, null);
    }

    protected void executeCommand(String commandId, String fileName) {
        IServiceLocator serviceLocator = PlatformUI.getWorkbench();

        ICommandService commandService = (ICommandService) serviceLocator.getService(ICommandService.class);
        IHandlerService handlerService = (IHandlerService) serviceLocator.getService(IHandlerService.class);

        try {
            Command command = commandService.getCommand(commandId);

            Parameterization[] params = new Parameterization[] { new Parameterization(command.getParameter("fileName"),
                    (String) fileName) };

            ParameterizedCommand parametrizedCommand = new ParameterizedCommand(command, params);

//            handlerService.executeCommand(parametrizedCommand, null);

        } catch (NotDefinedException ex) {
            Activator.log("Unable to execute command " + commandId + " with filename " + fileName, ex);
        }
        
//    } catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException ex) {
//        Activator.log("Unable to execute command " + commandId + " with filename " + fileName, ex);
//    }

    }


//    private void addMarker(IFile file, String message, int lineNumber, int severity) {
//        try {
//            IMarker marker = file.createMarker(MARKER_TYPE);
//            marker.setAttribute(IMarker.MESSAGE, message);
//            marker.setAttribute(IMarker.SEVERITY, severity);
//            if (lineNumber == -1) {
//                lineNumber = 1;
//            }
//            marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
//        } catch (CoreException e) {
//        }
//    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.core.internal.events.InternalBuilder#build(int,
     * java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
     */
    protected IProject[] build(int kind, @SuppressWarnings("rawtypes") Map args, IProgressMonitor monitor) throws CoreException {
        if (kind == FULL_BUILD) {
            fullBuild(monitor);
        } else {
            IResourceDelta delta = getDelta(getProject());
            if (delta == null) {
                fullBuild(monitor);
            } else {
                incrementalBuild(delta, monitor);
            }
        }
        return null;
    }

    protected void clean(IProgressMonitor monitor) throws CoreException {
        // delete markers set and files created
        getProject().deleteMarkers(MARKER_TYPE, true, IResource.DEPTH_INFINITE);
    }

    protected void deleteMarkers(IFile file) {
        try {
            file.deleteMarkers(MARKER_TYPE, false, IResource.DEPTH_ZERO);
        } catch (CoreException ce) {
        }
    }

    protected void fullBuild(final IProgressMonitor monitor) throws CoreException {
        try {
            clean(monitor);
            getProject().accept(new SampleResourceVisitor());
        } catch (CoreException e) {
        }
    }

    protected void incrementalBuild(IResourceDelta delta, IProgressMonitor monitor) throws CoreException {
        try {
            clean(monitor);
            // delta.accept(new SampleDeltaVisitor());
            getProject().accept(new SampleResourceVisitor());
        } catch (CoreException e) {
            System.out.println(e);
        }
    }

}

