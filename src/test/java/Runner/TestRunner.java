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
				"pretty",                               	// Formato de saída legível
				"json:target/cucumber-reports/report.json", // Geração de relatório em JSON
				"html:target/cucumber-reports/report.html"  // Geração de relatório em HTML
		}
)

public class TestRunner {
}

