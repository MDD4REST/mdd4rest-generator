package core.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

/**
 * A command handler for exporting all service compositions to the linked ontology.
 * 
 * @author themis
 */
public class CompileServiceCompositionsHandler extends CommandExecutorHandler {

	/**
	 * This function is called when the user selects the menu item. It populates the linked ontology.
	 * 
	 * @param event the event containing the information about which file was selected.
	 * @return the result of the execution which must be {@code null}.
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (getProjectOfExecutionEvent(event) != null) {
			executeCommand("eu.scasefp7.eclipse.servicecomposition.commands.exportAllToOntology");
			return null;
		} else {
			throw new ExecutionException("No project selected");
		}
	}

}