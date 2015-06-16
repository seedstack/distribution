package ${groupId}.batch;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.seedstack.seed.cli.api.WithCommandLine;
import org.seedstack.seed.it.AbstractSeedIT;

public class HelloWorldJobIT extends AbstractSeedIT {

	@Test
	@WithCommandLine(value={"--job","helloWorldJob"}, expectedExitCode = 0)
	public void helloWorld() throws Exception {
	}

}
