package core.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

/**
 * A command handler for exporting all RQS and Use Case Diagram XMI files to the static ontology.
 * 
 * @author themis
 */
public class CompileStaticRequirementsHandler extends CommandExecutorHandler {

	/**
	 * This function is called when the user selects the menu item. It populates the static ontology.
	 * 
	 * @param event the event containing the information about which file was selected.
	 * @return the result of the execution which must be {@code null}.
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (getProjectOfExecutionEvent(event) != null) {
			executeCommand("eu.scasefp7.eclipse.reqeditor.commands.exportAllToOntology");
			executeCommand("eu.scasefp7.eclipse.umlrec.ui.commands.exportUseCaseDiagramsToOntology");
			return null;
		} else {
			throw new ExecutionException("No project selected");
		}
	}

}