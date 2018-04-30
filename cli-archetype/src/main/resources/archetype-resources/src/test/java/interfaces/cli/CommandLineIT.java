package ${package}.interfaces.cli;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seedstack.seed.cli.WithCliCommand;
import org.seedstack.seed.testing.Arguments;
import org.seedstack.seed.testing.junit4.internal.JUnit4Runner;

@RunWith(JUnit4Runner.class)
public class CommandLineIT {
    @Test
    @WithCliCommand(command = "sample", expectedStatusCode = 0)
    @Arguments({
            "arg1", "arg2",
            "--flag",
            "--value", "something",
            "--array", "1,2,3,4,5,6,7,8,9",
            "--map", "key1=value1", "key2=value2"
    })
    public void execute_sample_command() {
        // assert execution outcome here
    }
}
