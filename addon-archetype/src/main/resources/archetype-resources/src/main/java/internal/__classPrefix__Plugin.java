package ${package}.internal;

import io.nuun.kernel.api.plugin.InitState;
import io.nuun.kernel.api.plugin.context.Context;
import io.nuun.kernel.api.plugin.context.InitContext;
import org.seedstack.seed.core.internal.AbstractSeedPlugin;
import ${package}.${classPrefix}Config;

public class ${classPrefix}Plugin extends AbstractSeedPlugin {
    private ${classPrefix}Config ${identifierPrefix}Config;

    @Override
    public String name() {
        return "${identifierPrefix}";
    }

    @Override
    public String pluginPackageRoot() {
        return "${package}";
    }

    @Override
    public InitState initialize(InitContext initContext) {
        ${identifierPrefix}Config = getConfiguration(${classPrefix}Config.class);

        // TODO: place add-on initialization code here if any

        return InitState.INITIALIZED;
    }

    @Override
    public Object nativeUnitModule() {
        return new ${classPrefix}Module();
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
