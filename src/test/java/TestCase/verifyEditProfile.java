package TestCase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModel.EditProfile;
import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class verifyEditProfile extends BaseClass{

	@Test
public void EditProfile() throws InterruptedException, AWTException {
	

        LoginPageObject lpo= new LoginPageObject(driver);
		
        lpo.EnterUsername().sendKeys(TestCaseData.username);
		
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		lpo.ClickSubmit().click();
		
		Thread.sleep(20000);
	
	
		EditProfile ep = new EditProfile(driver);
		
		Thread.sleep(5000);
		ep.RT().click();
	//	ep.Email().isDisplayed();
		
	//	ep.Role().isDisplayed();
		Thread.sleep(1000);
		ep.Click_Edit_Profile().click();
		
		Thread.sleep(1000);
		
		ep.FirstName().clear();
		
		Thread.sleep(1000);
		ep.FirstName().sendKeys(TestCaseData.FirstName);
		Thread.sleep(2000);
		ep.LastName().clear();
		
		Thread.sleep(5000);
		ep.LastName().sendKeys(TestCaseData.LastName);
		
		ep.Profilephoto().click();
		Thread.sleep(10000);
	    
		Robot Profilephoto= new Robot();
		
		Profilephoto.delay(2000);
		
        
	     // StringSelection s = new StringSelection("C:\\Users\\hp\\OneDrive\\Pictures\\Testing Screenshot.png");
		
		StringSelection s = new StringSelection("C:\\Users\\hp\\OneDrive\\Desktop\\Testing.png");

	      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
	      
	      
	     // graph.keyPress(KeyEvent.VK_ENTER);
	      
	      Profilephoto.keyPress(KeyEvent.VK_CONTROL);
	      
	      Profilephoto.keyPress(KeyEvent.VK_V);
	      
	      
	      Profilephoto.keyRelease(KeyEvent.VK_CONTROL);
	      Profilephoto.keyRelease(KeyEvent.VK_V);
	      

	      
	      Profilephoto.keyPress(KeyEvent.VK_ENTER);
	      //releasing enter
	      Profilephoto.keyRelease(KeyEvent.VK_ENTER);
	   
		
	      Thread.sleep(5000);
		
	      ep.phonenumber().clear();
	      Thread.sleep(5000);

	      ep.phonenumber().sendKeys(TestCaseData.phonenumber);
	      
	      Thread.sleep(5000);
	      ep.customSwitches().click();
	      
	      Thread.sleep(5000);
	      ep.customSwitches().click();
	      
	      
	      Thread.sleep(5000);
		  WebElement a= ep.Translater();

		  Thread.sleep(5000);
	      
	      Select s1= new Select(a);
	      Thread.sleep(5000);
	      s1.selectByVisibleText("Hindi");
	      
	      Thread.sleep(5000);
	      s1.selectByVisibleText("English");
	      Thread.sleep(5000);
	      
	      
	      ep.submit().click();
	
	      
	      Thread.sleep(5000);
	      ep.RT().click();
	     
	      Thread.sleep(1000);
	      ep.ResetPassword().click();
	      Thread.sleep(1000);
	      ep.OldPassword().sendKeys(TestCaseData.OldPassword);
	      
	      
	      Thread.sleep(1000);
	      ep.newPassword().sendKeys(TestCaseData.newPassword);
	      
	      
	      Thread.sleep(1000);
	      ep.ConfirmPassword().sendKeys(TestCaseData.ConfirmPassword);
	      
	      
	      Thread.sleep(5000);
	      ep.RT().click();;
	      
	      ep.ContactUs().click();
	      
	      Thread.sleep(5000);
	      ep.Description().sendKeys(TestCaseData.Description);
	     
	      Thread.sleep(5000);
	      String exp = "info@netrum-tech.com";
	      		 
		   WebElement m = ep.ContactUsEmail();
	      
		   String act= m.getText();
		   
		   ExtentManager.test.createNode("For contact us email address: "+ act);			 

		  // System.out.println("for contact us email address: "+ act);
		   
		   Assert.assertEquals(exp, act);  
		   
		   
		   Thread.sleep(5000);
		   String exp1 = "C 910-911, Noida One Building, Noida Sector 62, Noida - 201309";
    		 
		   WebElement w = ep.Address();
	      
		   String act1= w.getText();
		   
		   ExtentManager.test.createNode("For contact us office address: "+ act1);			 

		   //  System.out.println("for contact us office address: "+ act1);
		   
		   Assert.assertEquals(exp1, act1);  
		   
		   Thread.sleep(8000);
		   ep.submit().click();
		   Thread.sleep(5000);
		   
		   ep.RT().click();
		   Thread.sleep(2000);
		   ep.Logout().click();
		   	   
		   
	
}
	
}



