package caiomarques.projeto.selenium;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
	private WebDriver driver;

	@Test
    public void helloSelenium() {
		//https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers/
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://advantageonlineshopping.com/#/");
		
		String currentUrl = driver.getCurrentUrl();
		String expected = "https://advantageonlineshopping.com/#/";
		
		Assertions.assertEquals(expected, currentUrl);
		
		driver.quit();
    }
	
	
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

}
