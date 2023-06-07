package TestCase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.Analysis_SecurityPulse;
import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;


	public class VerifyAnalysis_SecurityPulse extends BaseClass{
		
		@Test
		
		public void SecurityPulse() throws InterruptedException, AWTException {

			
			 LoginPageObject lpo= new LoginPageObject(driver);
				
		        lpo.EnterUsername().sendKeys(TestCaseData.username4);
				
				lpo.EnterPassword().sendKeys(TestCaseData.password4);
				lpo.ClickSubmit().click();
				
				Thread.sleep(20000);
			
			
				 Analysis_SecurityPulse APS = new 	 Analysis_SecurityPulse(driver);
			
				 APS.Analysis().click();
				 Thread.sleep(5000);
			     APS.Security_Pulse().click();
			     
			     Thread.sleep(5000);
			     APS.Add().click();
			
			     Thread.sleep(5000);
			     APS.Enter_Page_Title().sendKeys(TestCaseData.Enter_Page_Title);
			
			     Thread.sleep(5000);
			     APS.CRITICALITY().click();
			
			     Thread.sleep(5000);
			     APS.CRITICALITY_High().click();
			     
			     
			     Thread.sleep(5000);
			     APS.Enter_Main_Section_Title().sendKeys(TestCaseData.Enter_Main_Section_Title);
			     
			     
			     //graph
			     APS.upload_graph().click();
					
					
				 Robot graph= new Robot();
				 graph.delay(2000);
					
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
					
				   Thread.sleep(5000);
				   APS.Enter_Information().sendKeys(TestCaseData.Enter_Information);
					     
				   Thread.sleep(5000);
				   APS.recommendation().sendKeys(TestCaseData.recommendation);
					     
				   Thread.sleep(5000);
				   APS.enter_link_title().sendKeys(TestCaseData.enter_link_title);
					     
				   Thread.sleep(5000);
				   APS.enter_link_url().sendKeys(TestCaseData.enter_link_url);
					
				   Thread.sleep(5000);
				   APS.Security_Pulse_assets().sendKeys(TestCaseData.Security_Pulse_assets);
					     
				   Thread.sleep(5000);
				   APS.Security_Pulse_entity().sendKeys(TestCaseData.Security_Pulse_entity);
				   Thread.sleep(5000);
//				   APS.Security_Pulse_incidents().sendKeys(TestCaseData.Security_Pulse_incidents);
//					     
//				   Thread.sleep(5000);
//		           Actions obj =new Actions(driver);
//					
//		           Thread.sleep(8000);	
//		           obj.moveToElement(APS.Security_Pulse_incidents_click());	
//					
//		          Thread.sleep(5000);	
//		          obj.click().build().perform();		
			     
			     Thread.sleep(5000);
			     APS.Preview().click();
			     
			     Thread.sleep(8000);
			     APS.Security_Pulse_publish().click();
			     
			     
			     
			     
		}
		
}
