package caiomarques.projeto.selenium.tests;

import caiomarques.projeto.selenium.Core.BasePage;
import caiomarques.projeto.selenium.PageObjects.RegisterPage;
import caiomarques.projeto.selenium.PageObjects.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

class BaseTest {
	protected BasePage basePage;
	protected HomePage homePage;
	protected RegisterPage registerPage;
	protected final String URL = "https://advantageonlineshopping.com/#/";

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		this.homePage = new HomePage();
		this.registerPage = new RegisterPage();

		homePage.visit(this.URL);
	}

	@AfterEach
	void tearDown() throws Exception {
		basePage.quitWebDriver();
	}

}

