package com.bitm.selenium4thbatch.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class DriverExecutionTest {

	static {
		
		System.setProperty("webdriver.gecko.driver", "D:/local drive E/selenium/geckodriver.exe");
	}
	
	public static WebDriver driver = new FirefoxDriver();
	
	@Test
	public void testexecution(){
		System.out.println("Driver executed");
	}
	
	private DriverExecutionTest ()
	{
		
	}
}
