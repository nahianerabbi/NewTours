package com.bitm.selenium4thbatch.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.bitm.selenium4thbatch.Utils.XpathUtils;

public class BookFlightTest {
	
private WebDriver driver =null;
	

	

	
	@Test(priority=4)
	public void bookFlight() throws InterruptedException{
		
		driver.findElement(By.xpath(XpathUtils.BookFlight.FIRST_NAME)).sendKeys("nahian");
		driver.findElement(By.xpath(XpathUtils.BookFlight.LAST_NAME)).sendKeys("rabbi");
		driver.findElement(By.xpath(XpathUtils.BookFlight.MEAL)).sendKeys("Muslim");
		
		driver.findElement(By.xpath(XpathUtils.BookFlight.CARD_TYPE)).sendKeys("Visa");
		driver.findElement(By.xpath(XpathUtils.BookFlight.CARD_NUMBER)).sendKeys("123456");
		driver.findElement(By.xpath(XpathUtils.BookFlight.CARD_EXPIRATION_MONTH)).sendKeys("05");
		driver.findElement(By.xpath(XpathUtils.BookFlight.CARD_EXPIRATION_YEAR)).sendKeys("2005");
		driver.findElement(By.xpath(XpathUtils.BookFlight.CARD_FIRSTNAME)).sendKeys("nahian");
		driver.findElement(By.xpath(XpathUtils.BookFlight.CARD_MIDDLENAME)).sendKeys("E");
		driver.findElement(By.xpath(XpathUtils.BookFlight.CARD_LASTNAME)).sendKeys("rabbi");
		
		driver.findElement(By.xpath(XpathUtils.BookFlight.BILLING_ADDRESSLINE_1)).sendKeys("Mirpur");
		driver.findElement(By.xpath(XpathUtils.BookFlight.BILLING_ADDRESSLINE_2)).sendKeys("dhaka");
		driver.findElement(By.xpath(XpathUtils.BookFlight.BILLING_ADDRESS_CITY)).sendKeys("Dhaka");
		driver.findElement(By.xpath(XpathUtils.BookFlight.BILLING_ADDRESS_STATE_PROVIENCE)).sendKeys("Dhaka");
		driver.findElement(By.xpath(XpathUtils.BookFlight.BILLING_ADDRESS_POSTAL_CODE)).sendKeys("1216");
		driver.findElement(By.xpath(XpathUtils.BookFlight.BILLING_ADDRESS_COUNTRY)).sendKeys("BANGLADESH");
		
		driver.findElement(By.xpath(XpathUtils.BookFlight.SAME_AS_BILLING_ADDRESS)).click();
		
		driver.findElement(By.xpath(XpathUtils.BookFlight.SUBMIT_BTN)).click();
		
		System.out.println("Book flight page test verified!!");
	}

}
