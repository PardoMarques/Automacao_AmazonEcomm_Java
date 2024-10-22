package StepDefinitions;

import Core.DriverFactory;
import io.cucumber.java.Scenario;
import org.junit.jupiter.api.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
//import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;

public class Hooks {
	private static ExtentSparkReporter sparkReporter;
	private static ExtentReports extent;
	private static ExtentTest extentTest;

	@BeforeAll
	public static void beforeAll() throws IOException {
		extent = new ExtentReports();
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") +"\\test-output\\testReport.html");
		extent.attachReporter(sparkReporter);

		sparkReporter.config().setOfflineMode(true);
		sparkReporter.config().setDocumentTitle("Simple Automation Report");
		sparkReporter.config().setReportName("Test Report");
		sparkReporter.config().setTheme(Theme.STANDARD);
		sparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		sparkReporter.config().setEncoding("UTF-8");
	}

	@AfterAll
	public void TearDownTest (Scenario scenario) {
		System.out.println("Cenário: " + scenario.getName());
		if(scenario.isFailed() == true) {
			extentTest.log(Status.PASS, "Teste aprovado");
		}
		else{
			extentTest.log(Status.FAIL, "Teste reprovado");
		}
		System.out.println("Fechando o navegador");
		DriverFactory.killDriver();
	}
}
