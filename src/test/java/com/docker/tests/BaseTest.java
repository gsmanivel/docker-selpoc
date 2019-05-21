package com.docker.tests;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	protected WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void setUp(ITestContext ctxt) throws MalformedURLException {
		// System.setProperty("webdriver.chrome.driver",".\\src\\test\\resources\\drivers\\chromedriver.exe");
		// driver = new ChromeDriver();

		String host = "localhost";
		DesiredCapabilities dc;
		
		if (System.getProperty("BROWSER") == null && System.getProperty("BROWSER").equalsIgnoreCase("chrome")) {
			dc = DesiredCapabilities.chrome();
		} else {
			dc = DesiredCapabilities.chrome();

		}

		if (System.getProperty("HUB_HOST") != null) {
			host = System.getProperty("HUB_HOST");
		}

		// String testName = ctxt.getCurrentXmlTest().getName();

		String completeUrl = "http://" + host + ":4444/wd/hub";
		// dc.setCapability("name", testName);
		this.driver = new RemoteWebDriver(new URL(completeUrl), dc);
	}

}
