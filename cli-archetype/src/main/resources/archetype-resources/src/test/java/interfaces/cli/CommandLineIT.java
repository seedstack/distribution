package ${package}.interfaces.cli;

import org.junit.Test;
import org.seedstack.seed.cli.WithCommandLine;
import org.seedstack.seed.it.AbstractSeedIT;

public class CommandLineIT extends AbstractSeedIT {
    @Test
    @WithCommandLine(
            command = "sample",
            args = {
                    "arg1", "arg2",
                    "--flag",
                    "--value", "something",
                    "--array", "1,2,3,4,5,6,7,8,9",
                    "--map", "key1=value1", "key2=value2"
            },
            expectedExitCode = 0
    )
    public void execute_sample_command() {
        // assert execution outcome here
    }
}
