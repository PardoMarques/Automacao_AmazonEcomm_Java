package caiomarques.projeto.selenium.Runner;
import org.junit.After;
import org.junit.runner.RunWith;

import Core.DriverFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// O Runner é a ponte para que sejam executados os testes do JUnit com o Cucumber
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features/exemplo.feature",
		glue = {"StepDefinitions"},
		tags = {"@all_home"}, 
		plugin = {"pretty"},
		monochrome = true,
		dryRun = false,
		strict = false
		)
public class Runner {

//	@After
//	public void tearDown() {
//		DriverFactory.killDriver();
//	}
}
