package ${package}.interfaces.cli;

import org.seedstack.seed.cli.CliArgs;
import org.seedstack.seed.cli.CliCommand;
import org.seedstack.seed.cli.CliOption;
import org.seedstack.seed.cli.CommandLineHandler;

import java.util.Map;

@CliCommand("sample")
public class SampleCommandLineHandler implements CommandLineHandler {
    @CliOption(name = "f", longName = "flag")
    private Boolean flag;

    @CliOption(name = "v", longName = "value", valueCount = 1)
    private String value;

    @CliOption(name = "m", longName = "map", valueCount = -1, valueSeparator = '=')
    private Map<String, String> map;

    @CliOption(name = "a", longName = "array", valueCount = -1, mandatory = true, defaultValues = {"1", "2", "3"})
    private String[] array;

    @CliArgs(mandatoryCount = 2)
    private String[] args;

    public Integer call() throws Exception {
        // do something here

        return 0;
    }
}
