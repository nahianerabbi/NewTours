package com.bitm.selenium4thbatch.Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.selenium4thbatch.Utils.DriverExecutionTest;
import com.bitm.selenium4thbatch.Utils.UrlUtils;

public class FlightConfirmationTest {
	
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
	public void initiateSelectFlight() throws InterruptedException{
		SelectFlightTest selectflight= new SelectFlightTest();
		selectflight.checkSelectFlightPageTitle();
		selectflight.checkSelectFlight();
	}
	
	@Test(priority = 4)
	public void checkFlightConfirmationTitle() throws InterruptedException {
		driver =DriverExecutionTest.driver ;
	
		Assert.assertEquals(driver.getTitle(), UrlUtils.FLIGHT_CONFIRMATION_PAGE_TITLE);

		
		System.out.println("Flight Confirmation Page Title Verified !!!");
	}

}
