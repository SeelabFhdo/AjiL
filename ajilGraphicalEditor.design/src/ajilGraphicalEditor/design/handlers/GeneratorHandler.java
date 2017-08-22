package ajilGraphicalEditor.design.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class GeneratorHandler extends AbstractHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveShell(event);		
		//
		IWorkspaceRoot root=ResourcesPlugin.getWorkspace().getRoot();
		ElementTreeSelectionDialog dialog=new ElementTreeSelectionDialog( shell, new WorkbenchLabelProvider(), new WorkbenchContentProvider());
		dialog.setTitle("Select your AjiL Model");
		dialog.setInput(root);
		if (dialog.open() == Window.OK) { 
			IFile file = (IFile) dialog.getResult()[0];
			String location = file.getLocationURI().toString();
			if(!location.isEmpty()) {
				System.out.println("Here the generator should be started....");
			} else {
				try {
					throw new Exception("Selected Path was empty!");
				} catch (Exception e) {
					e.printStackTrace();
				}
			};
		}
		return null;
	}

}
