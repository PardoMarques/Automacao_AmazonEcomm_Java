package caiomarques.projeto.selenium.PageObjects;

import caiomarques.projeto.selenium.Core.PageBase;
import caiomarques.projeto.selenium.Utilidades.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage2 extends PageBase{

	// Mapeamento
	@FindBy(css = "[class='logo']")
	private WebElement linkLogo;

	@FindBy(css = "#menuSearch")
	private WebElement iconSearch;

	@FindBy(css = "#menuUser")
	private WebElement iconLogin;

	@FindBy(css = "#menuCart")
	private WebElement iconCart;

	@FindBy(css = "#menuHelp")
	private WebElement iconHelp;

	@FindBy(css = "#autoComplete")
	private WebElement inptSearch;

	@FindBy(css = "h3.categoryTitle")
	private WebElement lblCategoryTitle;
    
    //Metodos
	    public void visitPage() {
	        getDriver().get(Constants.HOME_PAGE_URL);
	    }

		public void clickIconLogin(){
			click(iconLogin);
		}

	    public void setUsername(String theUsername) {
	        usernameField.clear();
	        usernameField.sendKeys(theUsername);
	    }
	
	    public void setPassword(String thePassword) {
	        passwordField.clear();
	        passwordField.sendKeys(thePassword);
	    }
	
	    public void login(String theUsername, String thePassword) {
	        setUsername(theUsername);
	        setPassword(thePassword);
	        loginButton.click();
	    }
		
}
