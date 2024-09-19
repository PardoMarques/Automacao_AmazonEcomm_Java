package StepDefinitions;

import Core.DriverFactory;
import PageObjects.HomePage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class HomeSteps {

	private HomePage homePage = new HomePage();

	@Dado("que acesso a página inicial da Amazon")
	public void que_acesso_a_página_inicial_da_amazon() {
		homePage.visitarPagina();
	}

	@Dado("que acesso a página inicial da Amazon em menos de três segundos")
	public void que_acesso_a_página_inicial_da_amazon_em_menos_de_três_segundos() {
		homePage.validarVisitaComTempoDeCarregamento();
	}

	@Quando("escrevo no campo de pesquisa o trecho {string}")
	public void escrevo_no_campo_de_pesquisa_o_trecho(String textoProduto) {
		homePage.preencherCampoDePesquisa(textoProduto);
	}

	@Então("deve aparecer dez sugestões sobre o trecho {string}")
	public void deve_aparecer_dez_sugestões_sobre_o_trecho(String textoProduto) {
		homePage.validarSugestoesDePesquisa(textoProduto);
	}
	
}
