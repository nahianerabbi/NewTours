package com.bitm.selenium4thbatch.Test;
import java.util.List;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.bitm.selenium4thbatch.DTO.FlightFinderDto;
import com.bitm.selenium4thbatch.DataProvider.FlightFinderDataProvider;
import com.bitm.selenium4thbatch.Utils.DriverExecutionTest;
import com.bitm.selenium4thbatch.Utils.UrlUtils;
import com.bitm.selenium4thbatch.Utils.XpathUtils;


public class FlightFinderTest {
	
	private WebDriver driver =null;
	
	
	
	
	@Test(priority=1)	
	public void checkFlightFinderPageTitle() throws InterruptedException  {
		
		driver =DriverExecutionTest.driver ;
		WebDriverWait wait=new WebDriverWait(driver, 40);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.FlightFinder.PASSENGERS)));
		Assert.assertEquals(driver.getTitle(), UrlUtils.FLIGHT_FINDER_PAGE_TITLE);
		System.out.println("Flight Finder Page Title Verified !!!");
	
	}
	
	@Test(priority=2, dataProvider="flightfinderdataprovider", dataProviderClass=FlightFinderDataProvider.class)
	public void flightFinderTest(List<FlightFinderDto>flightfinders)throws InterruptedException{
		
		
		
		for (FlightFinderDto flightfinderexcel:flightfinders){
			
			System.out.println("Flight Find Test Execution started --- ");
		
		driver.findElement(By.xpath(XpathUtils.FlightFinder.TRIP_TYPE)).click();
		//driver.findElement(By.xpath(XpathUtils.FlightFinder.PASSENGERS)).sendKeys(flightfinderexcel.getPassengers());
		driver.findElement(By.xpath(XpathUtils.FlightFinder.DEPARTING_FROM)).sendKeys(flightfinderexcel.getDepartingFrom());
		driver.findElement(By.xpath(XpathUtils.FlightFinder.DEPARTING_MONTH)).sendKeys(flightfinderexcel.getDepartingMonth());
		driver.findElement(By.xpath(XpathUtils.FlightFinder.DEPARTING_DATE)).sendKeys(flightfinderexcel.getDepartingDate());
		driver.findElement(By.xpath(XpathUtils.FlightFinder.ARRIVING_IN)).sendKeys(flightfinderexcel.getArrivingIn());
		driver.findElement(By.xpath(XpathUtils.FlightFinder.RETURNING_MONTH)).sendKeys(flightfinderexcel.getReturningMonth());
		driver.findElement(By.xpath(XpathUtils.FlightFinder.RETURNING_DATE)).sendKeys(flightfinderexcel.getReturningDate());
		driver.findElement(By.xpath(XpathUtils.FlightFinder.SERVICE_CLASS_TYPE_FIRST)).click();
		driver.findElement(By.xpath(XpathUtils.FlightFinder.AIRLINES)).sendKeys(flightfinderexcel.getAirline());
		driver.findElement(By.xpath(XpathUtils.FlightFinder.CONTINUE_BTN)).click();
		
		System.out.println("Flight Finder page test varified!!");
		
		
	}
  }
	

}
