package caiomarques.projeto.selenium.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Core.PageBase;
import Utilidades.Constants;

public class ExemploPage extends PageBase{

	// Mapeamento
		@FindBy(id = "user-name")
	    private WebElement usernameField;
	
	    @FindBy(id = "password")
	    private WebElement passwordField;
	
	    @FindBy(className=  "login-button")
	    private WebElement loginButton;
	
	    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/h3/text()[1]")
	    private WebElement errorText;
	    
    
    //Metodos
	    public void visitPage() {
	        getDriver().get(Constants.HOME_PAGE_URL);
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
