package com.bitm.selenium4thbatch.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.selenium4thbatch.Utils.DriverExecutionTest;
import com.bitm.selenium4thbatch.Utils.UrlUtils;
import com.bitm.selenium4thbatch.Utils.XpathUtils;

public class SelectFlightTest {
	
private WebDriver driver =null;
	
	
	@Test(priority=1)
	public void initiateLogin()throws InterruptedException {
		LoginTest login = new LoginTest();
		login.checkHomePageTitle();
		login.loginTest();
		
	}
	
	@Test(priority=2)
	public void initiateFlightFinder() throws InterruptedException{
		
		FlightFinderTest flightfinder= new FlightFinderTest();
		flightfinder.checkFlightFinderPageTitle();
		flightfinder.checkFlightFinder();
	}
	
@Test(priority=3)
	
	public void checkSelectFlightPageTitle() throws InterruptedException  {
		
		driver =DriverExecutionTest.driver ;
		//driver.get(UrlUtils.SELECT_FLIGHT_URL);
		System.out.println("ok");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getTitle(),UrlUtils.SELECT_FLIGHT_PAGE_TITLE);

		//Assert.assertEquals(driver.getTitle(), UrlTextUtils.LOGIN_PAGE_TITLE);
		System.out.println("Select flight Page Title Verified !!!");
		
		
	}

public void checkSelectFlight ()throws InterruptedException{
	
	driver.findElement(By.xpath(XpathUtils.SelectFlight.DEBSA_361)).click();
	driver.findElement(By.xpath(XpathUtils.SelectFlight.REBSA_361)).click();
	driver.findElement(By.xpath(XpathUtils.SelectFlight.CONTINUE_BTN)).click();
	
	System.out.println("select flight page test varified!!");
}



}
