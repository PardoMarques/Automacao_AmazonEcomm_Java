package caiomarques.projeto.selenium.tests;

import caiomarques.projeto.selenium.pages.BasePage;
import caiomarques.projeto.selenium.pages.RegisterPage;
import caiomarques.projeto.selenium.pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class BaseTest {
	protected BasePage basePage;
	protected LoginPage loginPage;
	protected RegisterPage registerPage;
	protected final String URL = "https://advantageonlineshopping.com/#/";

	@BeforeEach
	void setUp() throws Exception {
		this.loginPage = new LoginPage();
		this.registerPage = new RegisterPage();

		basePage.visit(this.URL);
	}

	@AfterEach
	void tearDown() throws Exception {
		basePage.quitWebDriver();
	}

}

