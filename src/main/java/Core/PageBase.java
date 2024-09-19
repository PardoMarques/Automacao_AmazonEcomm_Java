package Core;
import Utilidades.Constants;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

public abstract class PageBase {

		private WebDriver driver;

		private WebDriverWait wait;

		protected PageBase() {
			WebDriver driver = getDriver();
			PageFactory.initElements(driver, this);
			wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.WEBDRIVER_TIMEOUT));
			this.driver = driver;
		}
		
		protected WebDriver getDriver() {
			return DriverFactory.getDriver();
		}

		protected void populateTextField(WebElement element , String data) {
			if ( data != null) {
				clear(element);		
				enterText(element,data);
			}
		}
		
		protected void populateSelectFieldByText(WebElement element , String data) {
			if ( data != null) {		
				selectByText(element,data);		
			}
		}
		
		protected void populateSelectFieldByValue(WebElement element , String data) {
			if ( data != null) {
				selectByValue(element,data);
			}
		}
		
		protected String getText(WebElement element) {
			waitForClickable(element);
			return element.getText();
		}
		
		protected void click(WebElement element) {
			waitForClickable(element);
			element.click();
		}
		
		protected void selectBox(WebElement element) {
			waitForClickable(element);
			if(!element.isSelected()) {
				element.click();
			}
			
		}
		
		protected void unSelectBox(WebElement element) {
			waitForClickable(element);
			if(element.isSelected()) {
				element.click();
			}
			
		}
		
		protected void clear(WebElement element ) {
			waitForClickable(element);
			element.clear();
		}
		
		private void enterText(WebElement element , String data) {
			waitForClickable(element);
			element.sendKeys(data.trim());
		}
		
		private void selectByText(WebElement element , String data) {
			waitForClickable(element);
			Select item = new Select(element);
			item.selectByVisibleText(data);
		}
		
		private void selectByValue(WebElement element , String data) {
			waitForClickable(element);
			Select item = new Select(element);
			item.selectByValue(data);
		}

		protected void executeJavaScript(String scriptToExecute) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(scriptToExecute);
		}

		protected void specialClick(WebElement element) {
			waitForClickable(element);
			Actions actions = new Actions(driver);
			actions.moveToElement(element);
			actions.click().build().perform();
		}

		protected void hover(WebElement element) {
			waitForClickable(element);
			Actions actions = new Actions(driver);
			actions.moveToElement(element);
			actions.build().perform();
		}

		protected void changeWait(int waitTime) {
			driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
		}

		protected void resetWait() {
			driver.manage().timeouts()
					.implicitlyWait(Constants.WEBDRIVER_TIMEOUT, TimeUnit.SECONDS);
		}

		protected void waitForVisible(WebElement element) {
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		
		protected void waitForText(WebElement element, String text) {
			wait.until(ExpectedConditions.textToBePresentInElement(element, text));
		}

		protected void waitForClickable(WebElement element) {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		
		protected void waitForNotVisible(WebElement element) {
			wait.until(ExpectedConditions.invisibilityOf(element));
		}

		protected void acceptAlert() {

			try {
				Alert alert = driver.switchTo().alert();
				alert.accept();

			} catch (Exception e) {
				try {
					Alert alert = driver.switchTo().alert();
					alert.accept();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
		
		protected void sleep(int seconds) {

			try {
				Thread.sleep(seconds * 1000);
			} catch (Exception e) {

			}
		}
}
