package com.examly.springapp;


import java.net.URL;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


public class SpringApplicationTests {
	WebDriver driver=null;
	ChromeOptions options = new ChromeOptions();
	driver = new RemoteWebDriver(new URL("http://localhost:4444"),options);
	@Test
    public void test_case1() throws Exception {
		
		driver.manage().window().maximize();

        // Navigate to "http://iamneo.ai"
        driver.get("http://iamneo.ai");

        // Navigate to the Facebook page "https://www.facebook.com"
        driver.navigate().to("https://www.facebook.com");

        // Navigate back to the iamneo.ai website
        driver.navigate().back();

        // Print the URL of the current page
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Navigate forward
        driver.navigate().forward();

        // Reload the page
        driver.navigate().refresh();

        // Close the browser
        driver.quit();

    }
	
	
	//Get All Task
	@Test
    public void test_case2() throws Exception {
		
	 	
    }
	
	//Get A Task By ID
	@Test
	public void test_case3() throws Exception {
		
	}
	
	//Delete A Task
	@Test
	public void test_case4() throws Exception {
		
			
	}


}
