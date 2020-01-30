package ${package}.interfaces.cli;

import java.util.Arrays;
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

    @CliOption(name = "a", longName = "array", valueCount = -1, defaultValues = {"1", "2", "3"})
    private String[] array;

    @CliArgs
    private String[] args;

    public Integer call() throws Exception {
        System.out.println("Running sample command:");
        System.out.println(String.format("\tArguments: %s", Arrays.toString(args)));
        System.out.println(String.format("\tBoolean option: %s", flag));
        System.out.println(String.format("\tValue option: %s", value));
        System.out.println(String.format("\tMap option: %s", map));
        System.out.println(String.format("\tArray option: %s", Arrays.toString(array)));
        return 0;
    }
}
