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
		plugin = {
				"pretty",
				"html:target/cucumber-reports.html",
				"json:target/cucumber-reports/cucumber.json"
		}
)

public class TestRunner {
}

