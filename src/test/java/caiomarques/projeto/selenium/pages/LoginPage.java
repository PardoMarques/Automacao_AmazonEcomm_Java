package caiomarques.projeto.selenium.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
	//Locators
	private By linkLogo = By.css("[class='logo']");
    private By iconSearch = By.css("#menuSearch");
    private By iconLogin = By.css("#menuUser");
    private By iconCart = By.css("#menuCart");
    private By iconHelp = By.css("#menuHelp");
    private By inptSearch = By.css("#autoComplete");

	// public void signin() {
	// 	if(super.isDisplayed(emailAddressLocator)) {
	// 		super.type("exemplo_email@gmail.com", emailAddressLocator);
	// 		super.type("123456", passwordLocator);
	// 		super.click(submitBtnLocator);
	// 	} else {
	// 		System.out.println("email textbox was not present");
	// 	}
	// }
	
	public String getMyAccountMessage() {
		return super.getText(tagMyAccountLocator);
	}

}
