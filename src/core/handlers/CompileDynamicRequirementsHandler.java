package core.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

/**
 * A command handler for exporting all Storyboards and Activity Diagram XMI files to the dynamic ontology.
 * 
 * @author themis
 */
public class CompileDynamicRequirementsHandler extends CommandExecutorHandler {

	/**
	 * This function is called when the user selects the menu item. It populates the dynamic ontology.
	 * 
	 * @param event the event containing the information about which file was selected.
	 * @return the result of the execution which must be {@code null}.
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (getProjectOfExecutionEvent(event) != null) {
			executeCommand("eu.scasefp7.eclipse.storyboards.commands.exportAllToOntology");
			executeCommand("eu.scasefp7.eclipse.umlrec.ui.commands.exportActivityDiagramsToOntology");
			return null;
		} else {
			throw new ExecutionException("No project selected");
		}
	}
}