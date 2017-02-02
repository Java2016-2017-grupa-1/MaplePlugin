package run.configuration;
import com.intellij.execution.configurations.*;
import com.intellij.icons.AllIcons;
import org.jetbrains.annotations.NotNull;
import javax.swing.*;

public class MaplePlugin_RunConfigurationType implements ConfigurationType {
    @Override
    public String getDisplayName() {
        return "MaplePlugin";
    }

    @Override
    public String getConfigurationTypeDescription() {
        return "MaplePlugin Run Configuration Type";
    }

    @Override
    public Icon getIcon() {
        return AllIcons.General.Information;
    }

    @NotNull
    @Override
    public String getId() {
        return "MaplePlugin_RUN_CONFIGURATION";
    }

    @Override
    public ConfigurationFactory[] getConfigurationFactories() {
        return new ConfigurationFactory[]{new MaplePlugin_ConfigurationFactory(this)};
    }
}