package caiomarques.projeto.selenium.PageObjects;

import caiomarques.projeto.selenium.Core.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
	//Locators
	private By linkLogo = By.cssSelector("[class='logo']");
    private By iconSearch = By.cssSelector("#menuSearch");
    private By iconLogin = By.cssSelector("#menuUser");
    private By iconCart = By.cssSelector("#menuCart");
    private By iconHelp = By.cssSelector("#menuHelp");
    private By inptSearch = By.cssSelector("#autoComplete");

    private By lblCategoryTitle = By.cssSelector("h3.categoryTitle");

	// public void signin() {
	// 	if(super.isDisplayed(emailAddressLocator)) {
	// 		super.type("exemplo_email@gmail.com", emailAddressLocator);
	// 		super.type("123456", passwordLocator);
	// 		super.click(submitBtnLocator);
	// 	} else {
	// 		System.out.println("email textbox was not present");
	// 	}
	// }
	
	public String getCategoryTitleText() {
		return super.getText(lblCategoryTitle);
	}

}
