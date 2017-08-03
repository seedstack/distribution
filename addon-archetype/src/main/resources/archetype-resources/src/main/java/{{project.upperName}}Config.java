package ${package};

import org.seedstack.coffig.Config;

@Config("{{project.lowerName}}")
public class {{project.upperName}}Config {
    private String property = "defaultValue";

    public String getProperty() {
        return property;
    }
}
