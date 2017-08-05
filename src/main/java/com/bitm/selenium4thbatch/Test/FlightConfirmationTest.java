package com.bitm.selenium4thbatch.Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.selenium4thbatch.Utils.DriverExecutionTest;
import com.bitm.selenium4thbatch.Utils.UrlUtils;

public class FlightConfirmationTest {
	
private WebDriver driver =null;
	
	

	
	@Test(priority = 1)
	public void checkFlightConfirmationTitle() throws InterruptedException {
		driver =DriverExecutionTest.driver ;
	
		Assert.assertEquals(driver.getTitle(), UrlUtils.FLIGHT_CONFIRMATION_PAGE_TITLE);

		
		System.out.println("Flight Confirmation Page Title Verified !!!");
	}

}
