package com.bitm.selenium4thbatch.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.selenium4thbatch.Utils.DriverExecutionTest;
import com.bitm.selenium4thbatch.Utils.UrlUtils;
import com.bitm.selenium4thbatch.Utils.XpathUtils;

public class FlightFinderTest {
	
	private WebDriver driver =null;
	
	
	@Test(priority=1)
	public void initiateLogin()throws InterruptedException {
		LoginTest login = new LoginTest();
		login.checkHomePageTitle();
		login.loginTest();
		
	}
	
	
	@Test(priority=2)
	
	public void checkFlightFinderPageTitle() throws InterruptedException  {
		
		driver =DriverExecutionTest.driver ;
		//driver.get(UrlUtils.FLIGTH_FINDER_URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getTitle(), UrlUtils.FLIGHT_FINDER_PAGE_TITLE);

		//Assert.assertEquals(driver.getTitle(), UrlTextUtils.LOGIN_PAGE_TITLE);
		System.out.println("Flight Finder Page Title Verified !!!");
	
		
		

	
	}
	
	@Test(priority=3)
	public void checkFlightFinder()throws InterruptedException{
		
		driver.findElement(By.xpath(XpathUtils.FlightFinder.TRIP_TYPE)).click();
		driver.findElement(By.xpath(XpathUtils.FlightFinder.PASSENGERS)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.FlightFinder.DEPARTING_FROM)).sendKeys("London");
		driver.findElement(By.xpath(XpathUtils.FlightFinder.DEPARTING_MONTH)).sendKeys("October");
		driver.findElement(By.xpath(XpathUtils.FlightFinder.DEPARTING_DATE)).sendKeys("10");
		driver.findElement(By.xpath(XpathUtils.FlightFinder.ARRIVING_IN)).sendKeys("New York");
		driver.findElement(By.xpath(XpathUtils.FlightFinder.RETURNING_MONTH)).sendKeys("November");
		driver.findElement(By.xpath(XpathUtils.FlightFinder.RETURNING_DATE)).sendKeys("10");
		driver.findElement(By.xpath(XpathUtils.FlightFinder.SERVICE_CLASS_TYPE_FIRST)).click();
		driver.findElement(By.xpath(XpathUtils.FlightFinder.AIRLINES)).sendKeys("Unified Airlines");
		driver.findElement(By.xpath(XpathUtils.FlightFinder.CONTINUE_BTN)).click();
		
		System.out.println("Flight Finder page test varified!!");
		
		
	}
	

}
