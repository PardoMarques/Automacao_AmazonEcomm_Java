package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features/",
		glue = {"StepDefinitions"},
		tags = "@all_home",
		monochrome = true,
		plugin = {"pretty",
				"junit:target/junitreport.xml",
				"json:target/jsonreport.json",
				"html:target/cucumber-reports",
		}
)

public class TestRunner {
}

