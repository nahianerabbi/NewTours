package com.bitm.selenium4thbatch.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.bitm.selenium4thbatch.DTO.BookFlightDto;
import com.bitm.selenium4thbatch.DataProvider.BookFlightDataProvider;
import com.bitm.selenium4thbatch.Utils.DriverExecutionTest;
import com.bitm.selenium4thbatch.Utils.UrlUtils;
import com.bitm.selenium4thbatch.Utils.XpathUtils;

public class BookFlightTest {
	
private WebDriver driver =null;


	

 @Test(priority=1)	
	public void checkBookFlightPageTitle() throws InterruptedException  {
		
		driver =DriverExecutionTest.driver ;
		WebDriverWait wait=new WebDriverWait(driver, 40);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.BookFlight.FIRST_NAME)));
		Assert.assertEquals(driver.getTitle(), UrlUtils.BOOK_FLIGHT_PAGE_TITLE);
		System.out.println(" Book Flight Page Title Verified !!!");

}

	
	@Test(priority=2,dataProvider="bookflightdataprovider", dataProviderClass=BookFlightDataProvider.class)
	public void bookFlightTest(List<BookFlightDto>bookflights)throws InterruptedException{
		
		for (BookFlightDto bookflightexcel: bookflights){
		
		driver.findElement(By.xpath(XpathUtils.BookFlight.FIRST_NAME)).sendKeys(bookflightexcel.getFirstName());
		driver.findElement(By.xpath(XpathUtils.BookFlight.LAST_NAME)).sendKeys(bookflightexcel.getLastName());
		driver.findElement(By.xpath(XpathUtils.BookFlight.MEAL)).sendKeys(bookflightexcel.getMeal());
		
		driver.findElement(By.xpath(XpathUtils.BookFlight.CARD_TYPE)).sendKeys(bookflightexcel.getCardType());
		driver.findElement(By.xpath(XpathUtils.BookFlight.CARD_NUMBER)).sendKeys(bookflightexcel.getCardNumber());
		driver.findElement(By.xpath(XpathUtils.BookFlight.CARD_EXPIRATION_MONTH)).sendKeys(bookflightexcel.getCardExpirationMonth());
		driver.findElement(By.xpath(XpathUtils.BookFlight.CARD_EXPIRATION_YEAR)).sendKeys(bookflightexcel.getCardExpirationDate());
		driver.findElement(By.xpath(XpathUtils.BookFlight.CARD_FIRSTNAME)).sendKeys(bookflightexcel.getCardFirstName());
		driver.findElement(By.xpath(XpathUtils.BookFlight.CARD_MIDDLENAME)).sendKeys(bookflightexcel.getCardMiddleName());
		driver.findElement(By.xpath(XpathUtils.BookFlight.CARD_LASTNAME)).sendKeys(bookflightexcel.getCardLastName());
		
		driver.findElement(By.xpath(XpathUtils.BookFlight.BILLING_ADDRESSLINE_1)).sendKeys(bookflightexcel.getBillingAddressLine1());
		driver.findElement(By.xpath(XpathUtils.BookFlight.BILLING_ADDRESSLINE_2)).sendKeys(bookflightexcel.getBillingAddressLine2());
		driver.findElement(By.xpath(XpathUtils.BookFlight.BILLING_ADDRESS_CITY)).sendKeys(bookflightexcel.getBillingCity());
		driver.findElement(By.xpath(XpathUtils.BookFlight.BILLING_ADDRESS_STATE_PROVIENCE)).sendKeys(bookflightexcel.getBillingState());
		driver.findElement(By.xpath(XpathUtils.BookFlight.BILLING_ADDRESS_POSTAL_CODE)).sendKeys(bookflightexcel.getBillingPostalCode());
		driver.findElement(By.xpath(XpathUtils.BookFlight.BILLING_ADDRESS_COUNTRY)).sendKeys(bookflightexcel.getBillingCountry());
		
		driver.findElement(By.xpath(XpathUtils.BookFlight.SAME_AS_BILLING_ADDRESS)).click();
		
		driver.findElement(By.xpath(XpathUtils.BookFlight.SUBMIT_BTN)).click();
		
		System.out.println("Book flight page test verified!!");
	}

}
}