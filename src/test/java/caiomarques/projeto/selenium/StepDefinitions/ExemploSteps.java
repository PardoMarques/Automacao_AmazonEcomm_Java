package caiomarques.projeto.selenium.StepDefinitions;

import caiomarques.projeto.selenium.PageObjects.ExemploPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;

public class ExemploSteps{
	
	private ExemploPage pagina_home = new ExemploPage();

	@Dado("um usuário acessar a página Home")
	public void um_usuário_acessar_a_página_home() {
		pagina_home.visitPage();
		pagina_home.login("standard_user", "secret_sauce");
	}

	@Dado("um usuario simples acessar a página Home")
	public void um_usuario_simples_acessar_a_página_Home() {
		pagina_home.visitPage();
		pagina_home.login("standard_user", "secret_sauce");
	}

	@Então("encontrará a breve descrição {string} na página")
	public void encontrará_a_breve_descrição_na_página(String string) {
	}

	@Então("encontrará o número {int} na página")
	public void encontrará_o_número_na_página(Integer int1) {
	}
	
}
