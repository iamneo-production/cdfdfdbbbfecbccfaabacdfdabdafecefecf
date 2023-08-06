package com.examly.springapp;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test; 
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.net.URL;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


@SpringBootTest(classes = SpringappApplication.class)
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class SpringApplicationTests {
	WebDriver driver=null;
	ChromeOptions options = new ChromeOptions();
	driver = new R
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
