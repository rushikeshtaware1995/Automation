package TestCase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.Analysis_Perspective;
import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;

public class VerifyAnalysis_Perspective extends BaseClass{
	
	
	@Test
	public void Perspective() throws InterruptedException, AWTException {
		
		
		 LoginPageObject lpo= new LoginPageObject(driver);
			
	        lpo.EnterUsername().sendKeys(TestCaseData.username4);
			
			lpo.EnterPassword().sendKeys(TestCaseData.password4);
			lpo.ClickSubmit().click();
			Thread.sleep(10000);
			Analysis_Perspective AP = new Analysis_Perspective(driver);
			Thread.sleep(10000);
			AP.clickonAnalysis().click();
			Thread.sleep(10000);
			AP.clickonPerspective().click();
			Thread.sleep(5000);
//			WebElement a= AP.perspective_type_dropdown();
//			
//			Thread.sleep(10000);
//			
//			a.click();
//			
//			Actions analysis = new Actions(driver);
//			
//	        double randomvalue_analysis=  (Math.random() * (5 - 0 + 1) + 0);
//	        
//		    for(int i=0; i<=randomvalue_analysis; i++) {
//	    		
//	        
//		    analysis.pause(Duration.ofSeconds(1));
//		    
//		   	analysis.sendKeys(Keys.ARROW_DOWN).moveToElement(a).perform();
//		    	}
//		
//	        analysis.sendKeys(Keys.ENTER).build().perform();
//		    
//			
//			
//			
//	        Thread.sleep(5000);
//	        WebElement b= AP.action_taken_dropdown();
//			
//			Thread.sleep(10000);
//			
//			b.click();
//			
//			Actions analysis1 = new Actions(driver);
//			
//	        double randomvalue_analysis1=  (Math.random() * (5 - 0 + 1) + 0);
//	        
//		    for(int i=0; i<=randomvalue_analysis1; i++) {
//	    		
//	        
//		    analysis1.pause(Duration.ofSeconds(1));
//		    
//		   	analysis1.sendKeys(Keys.ARROW_DOWN).moveToElement(b).perform();
//		    	}
//		
//	        analysis1.sendKeys(Keys.ENTER).build().perform();
//		    
//		
//	        Thread.sleep(5000);
//	        WebElement c=AP.status_dropdown();
//			
//			Thread.sleep(10000);
//			
//			c.click();
//			
//			Actions analysis2 = new Actions(driver);
//			
//	        double randomvalue_analysis2=  (Math.random() * (5 - 0 + 1) + 0);
//	        
//		    for(int i=0; i<=randomvalue_analysis2; i++) {
//	    		
//	        
//		    analysis2.pause(Duration.ofSeconds(1));
//		    
//		   	analysis2.sendKeys(Keys.ARROW_DOWN).moveToElement(c).perform();
//		    	}
//		
//	        analysis2.sendKeys(Keys.ENTER).build().perform();
    	
	        Thread.sleep(10000);
			AP.clickonAdd().click();
			Thread.sleep(10000);
			AP.PERSPECTIVETYPE().click();
			Thread.sleep(5000);
			AP.Incident().click();
			Thread.sleep(5000);
			AP.Incident().click();
			Thread.sleep(5000);
			AP.Pattern().click();
			Thread.sleep(5000);
			AP.in_parentincident().sendKeys(TestCaseData.in_parentincident);
     	    Thread.sleep(5000);
            Actions obj =new Actions(driver);
            Thread.sleep(10000);	
            obj.moveToElement(AP.clickonIncidents());				
            Thread.sleep(8000);	
            obj.click().build().perform();		
		// Thread.sleep(10000);
		   Thread.sleep(5000);
		   WebElement d=AP.actedupon();	
		   Thread.sleep(10000);
		   d.click();  	
		   Actions analysis3 = new Actions(driver);	
		   double randomvalue_analysis3=  (Math.random() * (5 - 0 + 1) + 0);     
		   for(int i=0; i<=randomvalue_analysis3; i++) {		
		   analysis3.pause(Duration.ofSeconds(1));    
		   analysis3.sendKeys(Keys.ARROW_DOWN).moveToElement(d).perform();
			   	}
		   analysis3.sendKeys(Keys.ENTER).build().perform();   	
		   Thread.sleep(5000);
		   WebElement e=AP.INCIDENT_STATUS();			
		   Thread.sleep(10000);			
		   e.click();			
		   Actions analysis4 = new Actions(driver);			
		   double randomvalue_analysis4=  (Math.random() * (5 - 0 + 1) + 0);	        
		   for(int i=0; i<=randomvalue_analysis4; i++) {	    		
		   analysis4.pause(Duration.ofSeconds(1));		    
		   analysis4.sendKeys(Keys.ARROW_DOWN).moveToElement(e).perform();
		   analysis4.sendKeys(Keys.ENTER).build().perform();
//			AP.actedupon().click();
//			
//			
//			Thread.sleep(5000);
//			AP.Under_investigation().click();
//			
//			Thread.sleep(5000);
//			
//			AP.INCIDENT_STATUS().click();
//			
//			
//			Thread.sleep(5000);
//			
//			AP.Confirmed().click();
//			
		   Thread.sleep(5000);
		   AP.perspective_title().sendKeys(TestCaseData.perspective_title);
									
		   Thread.sleep(5000);
		   // tp upload graph
		   AP.upload_graph().click();
		   Robot graph= new Robot();
		   graph.delay(5000);
		     // StringSelection s = new StringSelection("C:\\Users\\hp\\OneDrive\\Pictures\\Testing Screenshot.png");
			
		   StringSelection s = new StringSelection("C:\\Users\\hp\\OneDrive\\Desktop\\Testing.png");
           Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		      
		   // graph.keyPress(KeyEvent.VK_ENTER);
		      
		   graph.keyPress(KeyEvent.VK_CONTROL);
		   graph.keyPress(KeyEvent.VK_V);
           graph.keyRelease(KeyEvent.VK_CONTROL);
		   graph.keyRelease(KeyEvent.VK_V); 
		   graph.keyPress(KeyEvent.VK_ENTER);
		   //releasing enter
		   graph.keyRelease(KeyEvent.VK_ENTER);
			
//			Robot graph= new Robot();
//			
//			graph.delay(5000);
//			
//	        
//		     // StringSelection s = new StringSelection("C:\\Users\\hp\\OneDrive\\Pictures\\Testing Screenshot.png");
//			
//			StringSelection s = new StringSelection("‪E:\\New folder\\Desktop\\upload graph.png");
//			graph.delay(5000);
//		      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
//		      
//		      graph.delay(5000);
//		      graph.keyPress(KeyEvent.VK_ENTER);
//		      
//		      graph.keyPress(KeyEvent.VK_CONTROL);
//		      
//		      graph.keyPress(KeyEvent.VK_V);
//		      
//		      
//		      graph.keyRelease(KeyEvent.VK_CONTROL);
//		      graph.keyRelease(KeyEvent.VK_V);
//		      
//
//		      
//		      graph.keyPress(KeyEvent.VK_ENTER);
//		      //releasing enter
//		      graph.keyRelease(KeyEvent.VK_ENTER);
//			
			
			
		  	Thread.sleep(5000);
			AP.graphtitle().sendKeys(TestCaseData.graphtitle);
			Thread.sleep(10000);
		//	AP.uploadgraph().click();
			AP.Perspective_info().sendKeys(TestCaseData.Perspective_info);	
			Thread.sleep(5000);
			AP.recommendations_info().sendKeys(TestCaseData.recommendations_info);
			Thread.sleep(5000);
			AP.tags_assets().sendKeys(TestCaseData.tags_assets);
			Thread.sleep(5000);
			AP.tags_entity().sendKeys(TestCaseData.tags_entity);
			
					
	//add scroll dowm		
			Thread.sleep(10000);
			
			AP.save().click();
			Thread.sleep(2000);
			AP.Preview().click();			
			Thread.sleep(5000);
			AP.publish().click();
			
			
			
			
		
			
			
			
			
		
	}
	
	}		
}



