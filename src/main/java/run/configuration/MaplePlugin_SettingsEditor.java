package run.configuration;
import com.intellij.openapi.options.*;
import com.intellij.openapi.ui.*;
import org.jetbrains.annotations.NotNull;
import javax.swing.*;

public class MaplePlugin_SettingsEditor extends SettingsEditor<MaplePlugin_RunConfiguration> {
    private JPanel myPanel;
    private LabeledComponent<ComponentWithBrowseButton> myMainClass;

    @Override
    protected void resetEditorFrom(MaplePlugin_RunConfiguration MaplePluginRunConfiguration) {

    }

    @Override
    protected void applyEditorTo(MaplePlugin_RunConfiguration MaplePluginRunConfiguration) throws ConfigurationException {

    }

    @NotNull
    @Override
    protected JComponent createEditor() {
        return myPanel;
    }

    private void createUIComponents() {
        myMainClass = new LabeledComponent<ComponentWithBrowseButton>();
        myMainClass.setComponent(new TextFieldWithBrowseButton());
    }
}