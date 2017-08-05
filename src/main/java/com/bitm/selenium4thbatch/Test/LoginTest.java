package com.bitm.selenium4thbatch.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.selenium4thbatch.DTO.LoginDto;
import com.bitm.selenium4thbatch.DataProvider.LoginDataProvider;
import com.bitm.selenium4thbatch.Utils.DriverExecutionTest;
import com.bitm.selenium4thbatch.Utils.UrlUtils;
import com.bitm.selenium4thbatch.Utils.XpathUtils;

public class LoginTest {

	private WebDriver driver = null;

	@Test(priority = 1)
	public void checkHomePageTitle() throws InterruptedException {
		driver =DriverExecutionTest.driver ;
		driver.get(UrlUtils.BASE_URL);
		Assert.assertEquals(driver.getTitle(), UrlUtils.LOGIN_PAGE_TITLE);

		//Assert.assertEquals(driver.getTitle(), UrlTextUtils.LOGIN_PAGE_TITLE);
		System.out.println("Home Page Title Verified !!!");
	}
	
	@Test(priority = 2, dataProvider="logindataprovider", dataProviderClass=LoginDataProvider.class)
	public void loginTest(List<LoginDto>logins) throws InterruptedException{
		//driver= ExecuteDriver.driver;
		
		
		for (LoginDto loginexcel:logins){
		//driver.get(UrlTextUtils.BASE_URL);
		driver.findElement(By.xpath(XpathUtils.Login.Login_USER_NAME)).sendKeys(loginexcel.getUsername());
		driver.findElement(By.xpath(XpathUtils.Login.login_PASSWORD)).sendKeys(loginexcel.getPassword());
		driver.findElement(By.xpath(XpathUtils.Login.BTN_SIGNIN)).submit();
		System.out.println("Logged In Successfully !!");
		}
	}

	/*private void navigate(String url) {
		// TODO Auto-generated method stub
		driver.navigate().to(url);
		driver.navigate().refresh();
	}*/

}
