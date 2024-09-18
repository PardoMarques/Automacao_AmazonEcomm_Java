package caiomarques.projeto.selenium.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import caiomarques.projeto.selenium.pages.RegisterPage;

class RegisterTest extends BaseTest {
	private RegisterPage registerPage;
	private final String URL = "https://advantageonlineshopping.com/#/";

	@BeforeEach
	void setUp() throws Exception {
		this.registerPage = new RegisterPage();
		this.registerPage.visit(this.URL);
	}

	@AfterEach
	void tearDown() throws Exception {
		this.registerPage.quitWebDriver();
	}

	@Test
	void test() {
		//when
		this.registerPage.insertEmailToRegister();
		
		//then
		String expected = "exemplo@email.com";
		String actual = this.registerPage.getEmailNewAccount();
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void test2() {
		//when
		this.registerPage.fillOutForm();
		
		//then
		String expected = "Welcome to your account. Here you can manage all of your personal information and orders.";
		String actual = this.registerPage.getWelcomeMessage();
		Assertions.assertEquals(expected, actual);
		
		String actualUrl = this.registerPage.getCurrentUrl();
		Assertions.assertFalse(this.URL.equals(actualUrl));
	}

}
