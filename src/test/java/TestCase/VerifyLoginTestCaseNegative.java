package TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjectNegative;
import Resources.BaseClass;
import Resources.TestCaseData;
	
	public class VerifyLoginTestCaseNegative extends BaseClass {
		
		@Test
		
		public void LoginTestCaseNegative() throws InterruptedException {
			
			
			
			LoginPageObjectNegative lpon= new LoginPageObjectNegative(driver);
			
			lpon.EnterUsername().sendKeys(TestCaseData.username3);
			lpon.EnterPassword().sendKeys(TestCaseData.password3);
			lpon.ClickSubmit().click();
			
			Thread.sleep(5000);
			String expectedString= TestCaseData.expectedString;
			
			String actual= driver.findElement(By.xpath("//span[@class='text-danger']")).getText();
			
//			CommonUtilities.handleAssertions(actual,expectedString);
			
			
			
		    SoftAssert assertion= new SoftAssert();
			
			assertion.assertEquals(actual, expectedString);
			
			 System.out.println("Error message is: "+ actual);
			assertion.assertAll();
			
			Thread.sleep(5000);

			lpon.ForgetPassword().click();
			
			Thread.sleep(5000);

			lpon.EnterEmail_forgetpassword().sendKeys(TestCaseData.EnterEmail_forgetpassword);
			
			Thread.sleep(5000);

			lpon.ClickSubmit().click();
			
			Thread.sleep(5000);
	         String expectedString1= TestCaseData.Email_sent;
			
			String actua2= driver.findElement(By.xpath("//div[@class='text-success']")).getText();
			
//			CommonUtilities.handleAssertions(actual2,expectedString1);
			
			
			
		    SoftAssert assertion1= new SoftAssert();
			
			assertion1.assertEquals(actua2, expectedString1);
			
			 System.out.println("Error message is: "+ actua2);
			assertion1.assertAll();
			
			
			Thread.sleep(2000);
			lpon.ClickSubmit().click();
}
	}
