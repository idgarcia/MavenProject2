package com.Maven;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleTitleTest extends BaseClass {
	  String PageTitle;
	  
	 @BeforeClass
	public void setUp() {
	
			System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			String url = "https://www.google.com/";
			driver.get(url);
	}

	 @Test
	    public void test() {
	     
	        PageTitle = driver.getTitle();
	        System.out.println("ActualTitle is "+ PageTitle);
			String Title = driver.getTitle();
			System.out.println(Title);
			Assert.assertEquals(Title, "Google");
	 }
	 @AfterClass
	 public void teardown() {
		  driver.quit();
	 }

}
