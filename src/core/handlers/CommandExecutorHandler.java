package core.handlers;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.services.IServiceLocator;

import core.Activator;

/**
 * Abstract handler with a convenience method to execute other commands.
 * 
 * @author themis
 */
public abstract class CommandExecutorHandler extends ProjectAwareHandler {

	/**
	 * Executes a command if it exists. Returns {@code true} if the command exists or {@code false} otherwise. Note that
	 * if the command exists but is not executed correctly (e.g. it is not enabled), this function still returns
	 * {@code true}.
	 * 
	 * @param commandId the id of the command to be executed, which can reside in other plugins.
	 * @return {@code true} if the command exists or {@code false} otherwise.
	 */
	protected boolean executeCommand(String commandId) {
		IServiceLocator serviceLocator = PlatformUI.getWorkbench();
		ICommandService commandService = (ICommandService) serviceLocator.getService(ICommandService.class);
		if (commandService.getDefinedCommandIds().contains(commandId)) {
			try {
				Command command = commandService.getCommand(commandId);
				command.executeWithChecks(new ExecutionEvent());
			} catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
				Activator.log("Unable to execute command " + commandId, e);
			}
			return true;
		} else
			return false;
	}

}