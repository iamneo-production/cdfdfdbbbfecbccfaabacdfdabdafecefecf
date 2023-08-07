package ai.iamneo.testing.Testing_Selenium_TestNg;

import org.testng.annotations.Test;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AppTest {

	ChromeOptions chromeOptions = new ChromeOptions();
	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() throws Exception {
	//	System.setProperty("webdriver.chrome.driver", "/home/coder/project/workspace/Testing-with-Selenium-TestNg/chromedriver");
		driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
	}

	@Test
	public void iamNeo() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://iamneo.ai");

	}
	@Test
	public void nextPage() throws InterruptedException {
		
	}
	@Test
	public void backPage() throws InterruptedException {
		

	}
	@Test
	public void currentURL() throws InterruptedException {
		
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
