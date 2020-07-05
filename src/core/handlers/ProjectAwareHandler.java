package core.handlers;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import core.builder.ProjectUtils;

/**
 * Abstract handler with a convenience method to get the project out of selection list.
 * 
 * @author themis
 */
public abstract class ProjectAwareHandler extends AbstractHandler {

	/**
	 * Returns the project that the event belongs to.
	 * 
	 * @param event the given event of this handler.
	 * @return the project that the event belongs to, or null if there is no project.
	 */
	@SuppressWarnings("unchecked")
	protected IProject getProjectOfExecutionEvent(ExecutionEvent event) {
		IProject project = null;
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			List<Object> selectionList = structuredSelection.toList();
			project = ProjectUtils.getProjectOfSelectionList(selectionList);
		}
		return project;
	}

}
