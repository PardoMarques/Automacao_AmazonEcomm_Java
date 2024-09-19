package StepDefinitions;

import PageObjects.HomePage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

import static org.junit.Assert.assertEquals;

public class BaseSteps {

	private HomePage basePage = new HomePage();

	@Então("deve aparecer no titulo a mensagem {string}")
	public void deve_aparecer_no_titulo_a_mensagem(String textoTitulo) {
		String tituloAtual = basePage.getTitle();
		assertEquals(tituloAtual.trim(), textoTitulo.trim());
	}

	@Então("deve constar na atual url o valor {string}")
	public void deve_constar_na_atual_url_o_valor(String textoUrl) {
		String urlAtual = basePage.getCurrentUrl();
		assertEquals(urlAtual, textoUrl);
	}
	
}
