/**
 * Created by Mohru on 25.11.2016.
 */

import com.intellij.execution.filters.TextConsoleBuilderFactory;
import com.intellij.execution.ui.ConsoleView;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;


public class HelloAction extends AnAction {
    public HelloAction() {
        super("Interpret!");
    }

    public void actionPerformed(AnActionEvent event) {
        Project project = event.getData(PlatformDataKeys.PROJECT);
        Messages.showMessageDialog(project, "Press OK to see the Maple interpretation of your selected code!", "Interpreter", Messages.getInformationIcon());
		
		final Editor editor = event.getRequiredData(CommonDataKeys.EDITOR);
		final Project projec2 = event.getRequiredData(CommonDataKeys.PROJECT);
		
		final Document document = editor.getDocument();
		final SelectionModel selectionModel = editor.getSelectionModel();
		final int start = selectionModel.getSelectionStart();
		final int end selectionModel.getSelectionEnd();
		
		ConsoleView cv = TextConsoleBuilderFactory.getInstance().createBuilder(project2).getConsole();
		MapleTerminal mt = MapleTerminal.getInstance();
		String out = mt.evaluate(selectionModel.getSelectedText());
		Messages.showMessageDialog(project, out, "Maple Interpreter", Messages.getInformationIcon());
		
	}
}
