package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions(); 
			//chromeOptions.addArguments("--headless"); 
			driver = new ChromeDriver(chromeOptions); 
		}
		// driver.manage().window().setSize(new Dimension (1200, 765));
		driver.manage().window().maximize();
		return driver;
	}

	public static void killDriver() {
		if (driver != null) {
			driver.close();
			driver.quit();
			driver = null;
		}
	}
}
