package ${package};

import org.seedstack.coffig.Config;

@Config("${identifierPrefix}")
public class ${classPrefix}Config {
    private String property = "defaultValue";

    public String getProperty() {
        return property;
    }
}
