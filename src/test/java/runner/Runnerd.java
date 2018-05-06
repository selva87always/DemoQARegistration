package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class Runnerd {
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "DemoQARegistration"
			,glue={"stepDefinition"}
			,tags={"tag1"}
			)

	public class TestRunner {

	}

}
