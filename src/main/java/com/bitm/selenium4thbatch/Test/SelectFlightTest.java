package com.bitm.selenium4thbatch.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.bitm.selenium4thbatch.Utils.XpathUtils;

public class SelectFlightTest {
	
private WebDriver driver =null;
	
	
	
	
/*@Test(priority=1)
	
	public void checkSelectFlightPageTitle() throws InterruptedException  {
		
		driver =DriverExecutionTest.driver ;		
		Assert.assertEquals(driver.getTitle(),UrlUtils.SELECT_FLIGHT_PAGE_TITLE);
		System.out.println("Select flight Page Title Verified !!!");
		
		
	}*/

public void checkSelectFlight ()throws InterruptedException{
	
	driver.findElement(By.xpath(XpathUtils.SelectFlight.DEBSA_361)).click();
	driver.findElement(By.xpath(XpathUtils.SelectFlight.REBSA_361)).click();
	driver.findElement(By.xpath(XpathUtils.SelectFlight.CONTINUE_BTN)).click();
	
	System.out.println("select flight page test varified!!");
}



}
