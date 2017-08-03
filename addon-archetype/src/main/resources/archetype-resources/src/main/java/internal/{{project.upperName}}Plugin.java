package ${package}.internal;

import io.nuun.kernel.api.plugin.InitState;
import io.nuun.kernel.api.plugin.context.Context;
import io.nuun.kernel.api.plugin.context.InitContext;
import org.seedstack.seed.core.internal.AbstractSeedPlugin;
import ${package}.{{project.upperName}}Config;

public class {{project.upperName}}Plugin extends AbstractSeedPlugin {
    private {{project.upperName}}Config {{project.lowerName}}Config;

    @Override
    public String name() {
        return "{{project.lowerName}}";
    }

    @Override
    public String pluginPackageRoot() {
        return "${package}";
    }

    @Override
    public InitState initialize(InitContext initContext) {
        {{project.lowerName}}Config = getConfiguration({{project.upperName}}Config.class);

        // TODO: place add-on initialization code here if any

        return InitState.INITIALIZED;
    }

    @Override
    public Object nativeUnitModule() {
        return new {{project.upperName}}Module();
    }

    @Override
    public void start(Context context) {
        // TODO: place add-on startup code here if any
    }

    @Override
    public void stop() {
        // TODO: place add-on shutdown code here if any
    }
}
