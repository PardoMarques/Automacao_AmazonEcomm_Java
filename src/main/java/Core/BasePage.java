package Core;
import Utilidades.Constants;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	private WebDriver driver;

	private WebDriverWait wait;

	protected BasePage() {
		WebDriver driver = getDriver();
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.WEBDRIVER_TIMEOUT));
		this.driver = driver;
	}

	protected WebDriver getDriver() {
		return DriverFactory.getDriver();
	}

	protected void clicarNoElemento(WebElement element) {
		esperarElementoSerClicavel(element);
		element.click();
	}

	protected void preencherCampo(WebElement element , String data) {
		if ( data != null) {
			limparCampo(element);
			esperarElementoSerClicavel(element);
			element.sendKeys(data.trim());
		}
	}

	private void selecionarCampoPeloTexo(WebElement element , String data) {
		if ( data != null) {
			esperarElementoSerClicavel(element);
			Select item = new Select(element);
			item.selectByVisibleText(data);
		}
	}

	private void selecionarCampoPeloValor(WebElement element , String data) {
		if ( data != null) {
			esperarElementoSerClicavel(element);
			Select item = new Select(element);
			item.selectByValue(data);
		}
	}

	protected void selecionarCaixa(WebElement element) {
		esperarElementoSerClicavel(element);
		if(!element.isSelected()) {
			element.click();
		}
	}

	protected void desselecionarCaixa(WebElement element) {
		esperarElementoSerClicavel(element);
		if(element.isSelected()) {
			element.click();
		}
	}

	protected void limparCampo(WebElement element ) {
		esperarElementoSerClicavel(element);
		element.clear();
	}

	// ======================
	// RETORNAR TEXTOS
	// ======================

	protected String retornarTexto(WebElement element) {
		esperarElementoSerClicavel(element);
		return element.getText();
	}

	public String retornarUrlAtual() {
		return driver.getCurrentUrl();
	}

	public String retornarTitulo() {
		return driver.getTitle();
	}

	// ======================
	// JAVASCRIPT & ACTIONS
	// ======================

	protected void executeJavaScript(String scriptToExecute) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(scriptToExecute);
	}

	protected void specialClick(WebElement element) {
		esperarElementoSerClicavel(element);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.click().build().perform();
	}

	protected void mouseHover(WebElement element) {
		esperarElementoSerClicavel(element);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.build().perform();
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
				throw new RuntimeException(e);
			}
		}
	}

	// ======================
	// ESPERAS
	// ======================

	protected void esperarElementoSerClicavel(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	protected void esperarElementoSerVisivel(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	protected void esperarElementoConterTexto(WebElement element, String text) {
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}

	protected void esperarElementoNaoSerVisivel(WebElement element) {
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	protected void esperarSegundos(int seconds) {
		try {
			Thread.sleep(seconds * 1000L);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}