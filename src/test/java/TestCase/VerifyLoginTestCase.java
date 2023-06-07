package TestCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class VerifyLoginTestCase extends BaseClass {
	
	@Test
	
	public void  LoginTestCase() throws IOException, InterruptedException {
		
		
		
		LoginPageObject lpo= new LoginPageObject(driver);
		
	
		 WebElement Logo = driver.findElement(By.xpath("//img[2]"));  
		 Thread.sleep(2000);
		 if( Logo.isDisplayed()) {
			
			 ExtentManager.test.createNode("Expected result Logo is visible and Actual result  Logo is visible");
			
			System.out.println("Expected result Logo should be visible and Actual result Logo is visible");	 
		 }
		 else {
			 ExtentManager.test.createNode("Expected result Logo should be visible and Actual result Logo is not visible");

			 System.out.println("Expected result Logo is visible and Actual result  Logo is not visible"); 	 
		 }

		lpo.EnterUsername().sendKeys(TestCaseData.username);
		
		lpo.EnterPassword().sendKeys(TestCaseData.password);
	
		lpo.ClickSubmit().click();
		
		Thread.sleep(2000);
	
		String expected= "Verifyotp";
	
		String actual= driver.getTitle();

		
		Assert.assertEquals(actual, expected);
		
		
//	if(s.contains("https://demo.dev.netrum-tech.com/Verifyotp")) {
//	
//		 ExtentManager.test.createNode("Expected result user should be able to login and Actual result user is able to login");	
//		
//	}
//		
//	if(s.contains("https://demo.dev.netrum-tech.com/")) {
//		
//		 ExtentManager.test.createNode("Expected result user should be able to login and Actual result user is not able to login");	
//
//	}
//		
//	}	
	
	

	
	
		
//		@Test
//		 public void LoginTestCase() {
//		ExtentManager.test.createNode("Expectd Result is user should login and Actual Result is user is able to login ");
//		 Assert.assertFalse(false);
//		  
//	     ExtentManager.test.createNode("Expectd Result and Actual Result ");
//		  Assert.assertTrue(true);
//		  ExtentManager.test.createNode("Expectd Result and Actual Result ");
//		  Assert.assertTrue(true);
//		
		

	}
}

