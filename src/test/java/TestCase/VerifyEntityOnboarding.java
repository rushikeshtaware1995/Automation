package TestCase;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.EntityOnboarding;
import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;

public class VerifyEntityOnboarding extends BaseClass{

	
	@Test
	
	  public void EntityOnboarding() throws InterruptedException {
		
		
      
      LoginPageObject lpo= new LoginPageObject(driver);
		
      lpo.EnterUsername().sendKeys(TestCaseData.username);
		
	  lpo.EnterPassword().sendKeys(TestCaseData.password);
	  lpo.ClickSubmit().click();
		
	  Thread.sleep(10000);	
		
		
		
	  EntityOnboarding eo = new EntityOnboarding(driver);
		
	  Thread.sleep(5000);
	  eo.Admin().click();
	  Thread.sleep(15000);
	  eo.entity_onboarding().click();		
//	  Thread.sleep(30000);
//	  WebElement country= eo.country();
//	  Thread.sleep(5000);
//	  country.click();
//	  Actions a = new Actions(driver);
//	  double randomvalue_country =  (Math.random() * (20 - 0 + 1) + 0);
//      for(int i=0; i<=randomvalue_country; i++) {
//  	  		
//      a.pause(Duration.ofSeconds(1));
//
//      a.sendKeys(Keys.ARROW_DOWN).moveToElement(country).perform();
//      }
//	  a.sendKeys(Keys.ENTER).build().perform();
//
//	  
//	 Thread.sleep(5000);
//	 WebElement state= eo.state();
//     state.click();
//	 Actions a1 = new Actions(driver);
//	 double randomvalue_state =  (Math.random() * (5 - 0 + 1) + 0);
//     for(int i=0; i<=randomvalue_state; i++) {
// 	 a1.pause(Duration.ofSeconds(1));
//
//     a1.sendKeys(Keys.ARROW_DOWN).moveToElement(state).perform();
//     }
//	 a1.sendKeys(Keys.ENTER).build().perform();
//	        
//	  
//    Thread.sleep(5000);
//	WebElement city= eo.city();
//    city.click();
//    Actions a2 = new Actions(driver);
//    double randomvalue_city =  (Math.random() * (5 - 0 + 1) + 0);
//    for(int i=0; i<=randomvalue_city; i++) {
//    a2.pause(Duration.ofSeconds(1));
//    a2.sendKeys(Keys.ARROW_DOWN).moveToElement(city).perform();      
//    }
//    a2.sendKeys(Keys.ENTER).build().perform();
//	        
//    Thread.sleep(2000);
//	eo.Location().sendKeys(TestCaseData.Location); 
//	Thread.sleep(2000);
//	eo.add_location().click();
//	Thread.sleep(5000);
//	eo.save().click();
//	Thread.sleep(15000);  
//	eo.next().click(); 
	  Thread.sleep(25000);
	 eo.next().click();
	Thread.sleep(25000);
	    
	 
     WebElement predefine_functions = driver.findElement(By.xpath("//*[name()='svg'][@stroke='currentColor']"));
	 Thread.sleep(5000);
	 double randomvalue=  (Math.random() * (5 - 0 + 1) + 0);
	 for(int i=0; i<=randomvalue;i++) {	
	 Thread.sleep(1000);	
	 predefine_functions.click();
	}
	  
	 Thread.sleep(10000);		

	 eo.functions().click();
	 Thread.sleep(15000);	
	
	driver.findElement(By.xpath("(//*[name()='svg'][@stroke='currentColor'])[23]")).click();
	 
	 
	 // eo.predefine_process().click();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
//	 eo.fun_process_next().click();
//	 Thread.sleep(10000);	
//	
//	 eo.FUNCTION_PROCESS_HIERARCHY().click();
//	 Thread.sleep(5000);
//
//	 eo.FUNCTION_PROCESS_HIERARCHY1().click();
//	 Thread.sleep(5000);
//	 eo.company_name_location().click();
//	 Thread.sleep(5000);
//	 eo.asset_category().click();
//	 Thread.sleep(5000);
//     eo.asset_sub_category().click();
//	 Thread.sleep(5000);
//	 eo.asset_type().click();
//	 Thread.sleep(5000);
//	 eo.asset_sub_type().click();
//	 Thread.sleep(5000);
//	 eo.Asset_name().sendKeys(TestCaseData.Asset_name); 
//	 Thread.sleep(8000); 
//	 WebElement a3= driver.findElement(By.xpath("//div[@class=' css-akdhb2-Input']"));
//	 Thread.sleep(2000);
//	
//     a3.click();
//	 Actions analysis = new Actions(driver);
//	 double randomvalue_analysis=  (Math.random() * (5 - 0 + 1) + 0);
//   
//     for(int i=0; i<=randomvalue_analysis; i++) {
//     analysis.pause(Duration.ofSeconds(1));
//   
//  	 analysis.sendKeys(Keys.ARROW_DOWN).moveToElement(a3).perform();
//   	 }
//
//     analysis.sendKeys(Keys.ENTER).build().perform();
//	
//	 Thread.sleep(2000);
//	 eo.Asset_add().click();
//	 Thread.sleep(2000);
//	 eo.Asset_save().click();
//	 Thread.sleep(10000);
//	 eo.Asset_next().click();
//	 Thread.sleep(10000);
//	 eo.Asset_submit().click();
	
	
	
	
	
	
	
	
	
	
	
	
//	//WebElement country= driver.findElement(By.xpath("//div[@class='row row-cols-12']"));
//	
//	Thread.sleep(5000);
//	
//	//double randomvalue=  (Math.random() * (5 - 0 + 1) + 0);
//	
//	Random r = new Random();
//	int randomValue = r.nextInt(listings.size()); 
//	
//	
//	Thread.sleep(5000);	
//	listings.get(randomValue).click(); //Clicking on the random item in the list.

	
	 
    
	 
	 
	 
	 
	  
	  
//	  Thread.sleep(10000);  
	    
//	  eo.save().click();
//	  Thread.sleep(1000);
//		
//	  Thread.sleep(30000);
//	  eo.Next().click();
//	  Thread.sleep(20000);
//	  
	  
//	  Thread.sleep(10000);
//	  
//	  eo.predefine_functions().click();
//	  Thread.sleep(2000);
//	  eo.functions().click();
//	  Thread.sleep(2000);
//	  eo.predefine_process().click();
//	  Thread.sleep(2000);
//	  eo.save().click();
//	 
//	  Thread.sleep(2000);
//	  eo.next().click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
//	  List<WebElement> barlist1= driver.findElements(By.xpath("//div[@class='my-3 col-md-7']//div[1]//div[1]//div[2]//*[name()='svg']"));
//		Thread.sleep(2000);
//		
//		 double randomvalue_analysis1=  (Math.random() * (5 - 0 + 1) + 0);
//		Actions act = new Actions(driver);
//		
//		 for(int i=0; i<=randomvalue_analysis1; i++) {
//			
//			
//		
//			
//		}
//		
//		act.click().perform();
//		
		
		
		
		
		
//	    b.click();
//		
//		Actions analysis1 = new Actions(driver);
//		
//	    double randomvalue_analysis1=  (Math.random() * (5 - 0 + 1) + 0);
//	    
//	    for(int i=0; i<=randomvalue_analysis1; i++) {
//			
//	   
//	    analysis1.pause(Duration.ofSeconds(1));
//	    
//	   	analysis1.sendKeys(Keys.ARROW_DOWN).moveToElement(b).perform();
//	    	}
//	    analysis1.click().perform();
//	    
//	    analysis1.sendKeys(Keys.ENTER).click().perform();
	  
	  
	  
	  
	  
	  
//	  List <WebElement> listings1 = driver.findElements(By.xpath("//*[name()='svg'][@stroke='currentColor']"));
//		
//		//WebElement country= driver.findElement(By.xpath("//div[@class='row row-cols-12']"));
//		
//		Thread.sleep(5000);
//		
//		double randomvalue1=  (Math.random() * (5 - 0 + 1) + 0);
//		
//		Random r1 = new Random();
//		int randomValue1 = r1.nextInt(listings1.size()); 
//		
//		for(int i=0; i<=randomvalue1;i++) {
//			
//			Thread.sleep(3000);	
//		
			
			//	listings1.get((int) randomValue1.click();	
			
	}
	  
	  
	  
//		eo.Enter_Custom_Function().sendKeys(TestCaseData.Enter_Custom_Function);  
//		  
//		 Thread.sleep(2000);
//		 
//		 eo.CF_add_button().click();
//		
//		 Thread.sleep(2000);
//		 eo.QA_Test().click();
//		
//		 Thread.sleep(2000);
//		 
//		 eo.QA_Test1_click().click();
	  
	  
	  
	  
	  
//	  eo.Finance_click().click();
//	  Thread.sleep(5000);
//	  eo.PD_Communications().click();
//	  Thread.sleep(5000);
//	  eo.PD_Communications_click().click();
//	  eo.PD_Accounting().click();
//	  Thread.sleep(10000);
//	  eo.PD_Idea_Formation().click();
//	  Thread.sleep(5000);
//	  
//	  eo.PD_Idea_Formation().click();
//	  Thread.sleep(2000);
//	  eo.PD_Idea_Formation().click();
	
	  
	 // eo.PD_Message_Encoding().click();
	  
//	  Thread.sleep(5000);
//      eo.PD_idea_Formation_2().click();
	  
//	  Thread.sleep(5000);
//	  eo.PD_idea_Formation_3().click();
	 
//	 eo.Enter_Custom_Function().sendKeys(TestCaseData.Enter_Custom_Function);  
//	  
//	 Thread.sleep(2000);
//	 
//	 eo.CF_add_button().click();
//	
//	 Thread.sleep(2000);
//	 eo.QA_Test().click();
//	
//	 Thread.sleep(2000);
//	 
//	 eo.QA_Test1_click().click();
//	 
//	 Thread.sleep(2000);
//	
//	 eo.Enter_Custom_Processes().sendKeys(TestCaseData.Enter_Custom_Processes);
//	
//	 Thread.sleep(2000);
//	 eo.CP_add_button().click();
//	
//	 Thread.sleep(2000);
//	 eo.CP_click().click();
//	 Thread.sleep(2000);
//	 eo.Next().click();
//	 
//	 Thread.sleep(2000);
//	 eo.PD_Communications_click().click();
//	 
//	 Thread.sleep(2000);
//	 eo.Functions_Processes_hierarchy().click();
//	 
//	 Thread.sleep(2000);
//	 eo.company_address().click();
//	 
//	 Thread.sleep(2000);
//	 eo.Asset_Category().click();
//	 
//	 Thread.sleep(2000);
//	 eo.Asset_sub_Category().click();
//	 
//	 Thread.sleep(2000);
//	 eo.Asset_type().click();
//	 
//	 Thread.sleep(2000);
//	 eo.Asset_sub_type().click();
//	 
//	 Thread.sleep(2000);
//	 eo.Asset_name().sendKeys(TestCaseData.Asset_name); 
//	 
//	 Thread.sleep(2000);
//	 eo.Asset_tags().click();
//	
//	 Thread.sleep(2000);
//	 eo.Asset_tags_fdertg().click();
//	 
//	 
//	 Thread.sleep(2000);
//	 eo.Next().click();
//	 
//	 Thread.sleep(2000);
//	 eo.Submit().click();
	 
	 
	 
	 
	 
	 
	 
	 
//	 eo.QA_Test().click(); 
	 
	 
//	 Thread.sleep(2000);
//	  eo.QA_Test().click();
//	  
//	  Thread.sleep(1000);
//	  eo.add_button().click();
//	  Thread.sleep(1000);
//	  eo.QA_Test_add().click();
//	  Thread.sleep(5000);
//	  eo.QA_Test_click().click();	
		
		
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	



