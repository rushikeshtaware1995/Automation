package TestCase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.DashBoard;
import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class VerifyDashboard extends BaseClass{

	@Test
	public void Dashboard() throws InterruptedException {
		

        LoginPageObject lpo= new LoginPageObject(driver);

        lpo.EnterUsername().sendKeys(TestCaseData.username);
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		lpo.ClickSubmit().click();
		Thread.sleep(20000);
		DashBoard dash = new DashBoard(driver);
		String actual_title =driver.getTitle();
	    System.out.println("Current page title is"+" "+actual_title);
	    
       if(actual_title.contains("Dashboard")) {
	    
	     ExtentManager.test.createNode("Expected page title is Dashboard and Actual page title is Dashboard");
	    }
	   
       else {
	     ExtentManager.test.createNode("Expected page title is Dashboard and Actual page title is not Dashboard");
    	
	    }
		
		WebElement logo=driver.findElement(By.xpath("//img[@class='acme macme']"));
		if(logo.isDisplayed()) {	
	     ExtentManager.test.createNode("The logo is present");			
		}
		else {
			
		  ExtentManager.test.createNode("The logo is not present");	
		}
		Thread.sleep(5000);
		dash.Clickdaterange().click();
		Thread.sleep(2000);
		List<WebElement> CalenderDates = driver.findElements(By.xpath("//span[@class='rdrStaticRangeLabel']"));
		
		Thread.sleep(5000);
		
		for(WebElement k:CalenderDates) {
	 	   
	  	if(k.getText().equalsIgnoreCase("Last Month")) {
	  		  
	  	k.click();
	  	k.click();
	  		
	  	break; 
	  	}
		}	
		
	    Thread.sleep(5000);
		String verticalxpath1 = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']";
		List<WebElement> barlist1= driver.findElements(By.xpath(verticalxpath1));
		
		Thread.sleep(5000);
	
		System.out.println("total bars :" + barlist1.size());
		
		Actions act1 = new Actions(driver);
		
		for(WebElement e:barlist1) {
			
		act1.moveToElement(e).perform();
		
		Thread.sleep(100);
			
		}
		Thread.sleep(200);
		dash.critical().click();
		Thread.sleep(200);
		dash.high().click();
		Thread.sleep(200);
		dash.medium().click();
		Thread.sleep(200);
		dash.low().click();
		

	   WebElement oei_mttd=driver.findElement(By.xpath("(//div[@class='card-title h5'])[3]"));
		
	   ExtentManager.test.createNode("Oei mttd value :" +" "+ oei_mttd.getText());
	   Thread.sleep(500);
	   WebElement oei_mttr=driver.findElement(By.xpath("(//div[@class='card-title h5'])[4]"));

	   ExtentManager.test.createNode("Oei mttd value :" +" "+ oei_mttr.getText());		
	   Thread.sleep(500);
	   String a=driver.findElement(By.xpath("(//h4[@data-for='React-tooltip'])[1]")).getText(); 
	   ExtentManager.test.createNode("Collection :"+ a);
	   Thread.sleep(500);
	   String b=driver.findElement(By.xpath("(//h4[@data-for='React-tooltip'])[2]")).getText();  
	   ExtentManager.test.createNode("Detection :"+ b);
	   Thread.sleep(500);
	   String c=driver.findElement(By.xpath("(//h4[@data-for='React-tooltip'])[3]")).getText();  
	   ExtentManager.test.createNode("Triage :"+ c);
	   Thread.sleep(500);
	   String d=driver.findElement(By.xpath("(//h4[@data-for='React-tooltip'])[4]")).getText();  
	   ExtentManager.test.createNode("Remediated :"+d);		
		
	// checking 	
		
	  Thread.sleep(5000);
	   
	  WebElement Alert_By_Confidence = driver.findElement(By.xpath("(//div[@class='card-title h5'])[1]"));  
	  Alert_By_Confidence.isDisplayed();	
	  Thread.sleep(2000);

	  System.out.println(Alert_By_Confidence.isDisplayed());
	    
	 if( Alert_By_Confidence.isDisplayed()) {
		 
		   ExtentManager.test.createNode("Alert By Confidence is present");		 
	 }
	 else {
		 
		   ExtentManager.test.createNode("Alert By Confidence is not present");		 
	 }
	
	 Thread.sleep(1000);
     String actual= driver.getCurrentUrl();
	 
     String expected = "https://demo.dev.netrum-tech.com/dashboard";	 
	
     if(actual.equals(expected) ) {
		 
		   ExtentManager.test.createNode("Dashboard url is same as expected");
	 
	 }
	 else {
		
		   ExtentManager.test.createNode("Dashboard url is not same as expected");		 
	 }
	 
	  Thread.sleep(2000);
      dash.prespective_more().click();
	  String prespective_link_actual= driver.getCurrentUrl();
      String prespective_link_expected = "https://demo.dev.netrum-tech.com/PerspectiveGrid";	 
      if(prespective_link_actual.equals(prespective_link_expected) ) {
		   ExtentManager.test.createNode("Perspective Grid page open succesfully"); 
		 }
	 else {
			   ExtentManager.test.createNode("Perspective Grid page falied");			 
		 }
		
		
	}

	
	
}



