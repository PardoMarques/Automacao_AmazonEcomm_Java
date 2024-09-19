package StepDefinitions;

import PageObjects.HomePage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;

public class HomeSteps {
	
	private HomePage homePage = new HomePage();
	
	@Dado("que acesso a página inicial da Amazon")
	public void que_acesso_a_página_inicial_da_amazon() {
		homePage.visitarPagina();
	}

	@Quando("escrevo no campo de pesquisa o trecho {string}")
	public void escrevo_no_campo_de_pesquisa_o_trecho(String textoProduto) {
		homePage.preencherCampoDePesquisa(textoProduto);
	}

	@Então("deve aparecer outras sugestões sobre o trecho {string}")
	public void deve_aparecer_outras_sugestões_sobre_o_trecho(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Então("deve aparecer no titulo a mensagem {string}")
	public void deve_aparecer_no_titulo_a_mensagem(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Então("deve constar na atual url o valor {string}")
	public void deve_constar_na_atual_url_o_valor(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	
}
