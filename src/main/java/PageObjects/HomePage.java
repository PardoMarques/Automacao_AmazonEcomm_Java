package PageObjects;

import Core.BasePage;
import Utilidades.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class HomePage extends BasePage {

	// Mapeamento
	@FindBy(css = "#twotabsearchtextbox")
	private WebElement inputSearch;

	@FindBy(css = "#nav-search-submit-button")
	private WebElement iconSearch;

	@FindBy(css = "[class='left-pane-results-container']")
	private WebElement boxSugestions;

	//Metodos
	    public void visitarPagina() {
	        getDriver().get(Constants.HOME_PAGE_URL);
	    }

		public void clicarNoIconeDePesquisa(){
			click(inputSearch);
		}

	    public void preencherCampoDePesquisa(String textoProduto) {
			iconSearch.click();
			iconSearch.sendKeys(textoProduto);
	    }

	    public void realizarPesquisa(String textoProduto) {
			preencherCampoDePesquisa(textoProduto);
			clicarNoIconeDePesquisa();
	    }

		public void validarSugestoesDePesquisa(String textoProduto) {
			// Localizar todas as divs que contêm as sugestões
			List<WebElement> suggestions = boxSugestions.findElements(By.cssSelector("[class='s-suggestion s-suggestion-ellipsis-direction']"));

			for (WebElement suggestion : suggestions) {
				String suggestionText = getText(suggestion);
				assertEquals(suggestionText, textoProduto);
			}
		}


		
}
