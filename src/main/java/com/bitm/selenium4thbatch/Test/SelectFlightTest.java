package com.bitm.selenium4thbatch.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.selenium4thbatch.Utils.DriverExecutionTest;
import com.bitm.selenium4thbatch.Utils.UrlUtils;
import com.bitm.selenium4thbatch.Utils.XpathUtils;

public class SelectFlightTest {
	
private WebDriver driver =null;
	
	
	
	
@Test(priority=1)	
public void checkSelectFlightPageTitle() throws InterruptedException  {
	
	driver =DriverExecutionTest.driver ;
	WebDriverWait wait=new WebDriverWait(driver, 40);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.SelectFlight.DEBSA_361)));
	Assert.assertEquals(driver.getTitle(), UrlUtils.SELECT_FLIGHT_PAGE_TITLE);
	System.out.println("Select Fligh Page Title Verified !!!");
		
		
	}
@Test(priority=2)
public void checkSelectFlight ()throws InterruptedException{
	
	driver.findElement(By.xpath(XpathUtils.SelectFlight.DEBSA_361)).click();
	driver.findElement(By.xpath(XpathUtils.SelectFlight.REBSA_361)).click();
	driver.findElement(By.xpath(XpathUtils.SelectFlight.CONTINUE_BTN)).click();
	
	System.out.println("select flight page test varified!!");
}



}
