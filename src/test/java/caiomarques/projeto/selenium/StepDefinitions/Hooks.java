package caiomarques.projeto.selenium.StepDefinitions;

import Core.DriverFactory;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void InitializeTest() {
		System.out.println("Abrindo o navegador");
	}
	
	@After
	public void TearDownTest (Scenario scenario) {
		if(scenario.isFailed() == true) {
			System.out.println("Cenário: " + scenario.getName());
		}
		System.out.println("Fechando o navegador");
		DriverFactory.killDriver();
	}
}
