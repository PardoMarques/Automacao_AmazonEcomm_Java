package PageObjects;

import Core.PageBase;
import Utilidades.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	// Mapeamento
	@FindBy(css = "#twotabsearchtextbox")
	private WebElement inputSearch;

	@FindBy(css = "#nav-search-submit-button")
	private WebElement iconSearch;
    
    //Metodos
	    public void visitarPagina() {
	        getDriver().get(Constants.HOME_PAGE_URL);
	    }

		public void clicarNoIconeDePesquisa(){
			click(inputSearch);
		}

	    public void preencherCampoDePesquisa(String textoProduto) {
			iconSearch.clear();
			iconSearch.sendKeys(textoProduto);
	    }

	    public void realizarPesquisa(String textoProduto) {
			preencherCampoDePesquisa(textoProduto);
			clicarNoIconeDePesquisa();
	    }
		
}
