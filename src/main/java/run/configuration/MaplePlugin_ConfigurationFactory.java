package run.configuration;
import com.intellij.execution.configurations.*;
import com.intellij.openapi.project.Project;

public class MaplePlugin_ConfigurationFactory extends ConfigurationFactory {
    private static final String FACTORY_NAME = "MaplePlugin configuration factory";

    protected MaplePlugin_ConfigurationFactory(ConfigurationType type) {
        super(type);
    }

    @Override
    public RunConfiguration createTemplateConfiguration(Project project) {
        return new MaplePlugin_RunConfiguration(project, this, "MaplePlugin");
    }

    @Override
    public String getName() {
        return FACTORY_NAME;
    }
}