package TestCase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.OEIpageobject;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class VerifyOEI extends BaseClass {
	@Test
	
	public void OEI() throws InterruptedException {
		
	LoginPageObject lpo= new LoginPageObject(driver);	
		
	lpo.EnterUsername().sendKeys(TestCaseData.username);
		
	lpo.EnterPassword().sendKeys(TestCaseData.password);
		
	lpo.ClickSubmit().click();
	
	Thread.sleep(10000);
	OEIpageobject oei = new OEIpageobject(driver);
	Thread.sleep(5000);

	oei.clickoei().click();
	Thread.sleep(10000);   
	
	
	Thread.sleep(1000);
    String actual= driver.getCurrentUrl();
	 
    String expected = "https://demo.dev.netrum-tech.com/oei";	 
	
    if(actual.equals(expected) ) {
		 
		 ExtentManager.test.createNode("OEI url is same as expected");
	
		 // System.out.println("OEI url is same as expected");
		 
	 }
	 else {
		
		 ExtentManager.test.createNode("OEI url is not same as expected");

		// System.out.println("OEI url is not same as expected"); 
		 
	 }
	
	
	
	
	WebElement funnel=driver.findElement(By.xpath("//div[@class='col-lg-4']"));
	
	if(funnel.isDisplayed()) {
		System.out.println("Expected result funnel is present actual result result funnel is  present");	
		
		 Thread.sleep(5000);
		   String a=driver.findElement(By.xpath("(//h4[@data-for='React-tooltip'])[1]")).getText(); 
		   ExtentManager.test.createNode("Collection :"+ a);

		  // System.out.println("Collection :"+ a);
		   Thread.sleep(500);
		   String b=driver.findElement(By.xpath("(//h4[@data-for='React-tooltip'])[2]")).getText();  
		   ExtentManager.test.createNode("Detection :"+ b);

		  // System.out.println("Detection :"+ b);
		   Thread.sleep(500);
		   String c=driver.findElement(By.xpath("(//h4[@data-for='React-tooltip'])[3]")).getText();  
		   ExtentManager.test.createNode("Triage :"+ c);

		  // System.out.println("Triage :"+ c);
		   Thread.sleep(500);
		   String d=driver.findElement(By.xpath("(//h4[@data-for='React-tooltip'])[4]")).getText();  
		   ExtentManager.test.createNode("Remediated :"+d);

		  // System.out.println("Remediated :"+d);	
	}
	else {
		 ExtentManager.test.createNode("Expected result funnel is present actual result result funnel is not present");

		//System.out.println("Expected result funnel is present actual result result funnel is not present");		
	}
	
	    WebElement chart=driver.findElement(By.xpath("(//div[@class='col-lg-12'])[2]"));

	    if(chart.isDisplayed()) {
			 ExtentManager.test.createNode("OEI chart is displayed");
		}
		else {
			 ExtentManager.test.createNode("OEI chart is not displayed");

		}
		

																		
		Thread.sleep(5000);
		String verticalxpath = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='path']";
		List<WebElement> barlist= driver.findElements(By.xpath(verticalxpath));
		
		Thread.sleep(5000);
			System.out.println("total bars :" + barlist.size());
			
			Actions act = new Actions(driver);
			
			for(WebElement e:barlist) {
				
				
			act.moveToElement(e).perform();
				
			}
			
			Thread.sleep(5000);
			String verticalxpath1 = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']";
			List<WebElement> barlist1= driver.findElements(By.xpath(verticalxpath1));
			
			Thread.sleep(5000);
				System.out.println("total bars :" + barlist1.size());
				
				Actions act1 = new Actions(driver);
				
				for(WebElement f:barlist1) {
					
					
				act1.moveToElement(f).perform();
					
				}	
			
			
	
    oei.mtd().click();
	
	oei.mtn().click();
	
	oei.mtr().click();
	
	oei.irr().click();
	
	oei.fpr().click();
	
	oei.number_of_alerts_1().click();
	
	oei.number_of_alerts_2().click();	
	
	
	
			oei.chartmenu().click();
			Thread.sleep(2000);
			
		
			oei.pngimage().click();
			Thread.sleep(2000);
			
			oei.chartmenu().click();
			Thread.sleep(2000);
			oei.jpegimage().click();
			Thread.sleep(2000);
			
			oei.chartmenu().click();
			Thread.sleep(2000);
			oei.cvgimage().click();
			Thread.sleep(2000);
			
			oei.chartmenu().click();
			Thread.sleep(2000);
			oei.svgimage().click();
			Thread.sleep(2000);
			
			oei.chartmenu().click();
			Thread.sleep(2000);
			oei.xlsimage().click();
	
	
			WebElement geo_location= driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[1]"));
			Thread.sleep(2000);
			
			geo_location.click();
			
			Actions analysis = new Actions(driver);
			
	        double randomvalue_analysis=  (Math.random() * (5 - 0 + 1) + 0);
		    for(int i=0; i<=randomvalue_analysis; i++) {
		    analysis.pause(Duration.ofSeconds(1));
		    analysis.sendKeys(Keys.ARROW_DOWN).moveToElement(geo_location).perform();
		    	}
		
	       analysis.sendKeys(Keys.ENTER).build().perform();
	       Thread.sleep(2000);   
	   	   WebElement function= driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[2]"));
		   Thread.sleep(2000);
		   function.click();
		   Actions analysis1 = new Actions(driver);
	       double randomvalue_analysis1=  (Math.random() * (5 - 0 + 1) + 0);
	       for(int i=0; i<=randomvalue_analysis1; i++) {
	       analysis1.pause(Duration.ofSeconds(1));
	       analysis1.sendKeys(Keys.ARROW_DOWN).moveToElement(function).perform();
	    	}

	       analysis1.sendKeys(Keys.ENTER).build().perform();
	       Thread.sleep(2000);   
	       WebElement process= driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[3]"));
		   Thread.sleep(2000);
		   process.click();
		   Actions analysis2 = new Actions(driver);
	       double randomvalue_analysis2=  (Math.random() * (5 - 0 + 1) + 0);
	       for(int i=0; i<=randomvalue_analysis2; i++) {
	       analysis2.pause(Duration.ofSeconds(1));
	   	   analysis2.sendKeys(Keys.ARROW_DOWN).moveToElement(process).perform();
	    	}

	       analysis2.sendKeys(Keys.ENTER).build().perform();	
	       
	       Thread.sleep(2000);   
	   	   WebElement asset= driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[4]"));
		   Thread.sleep(2000);
		   asset.click();
		
		   Actions analysis3 = new Actions(driver);
		   double randomvalue_analysis3=  (Math.random() * (5 - 0 + 1) + 0);
	       for(int i=0; i<=randomvalue_analysis3; i++) {
	       analysis3.pause(Duration.ofSeconds(1));
	   	   analysis3.sendKeys(Keys.ARROW_DOWN).moveToElement(asset).perform();
	    	}
           analysis3.sendKeys(Keys.ENTER).build().perform();	

	    	
	 
	
	
	
	
	
	
	
	
	
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	
//	Thread.sleep(5000);
//	String verticalxpath = "(//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group'])[3]//*[name()='rect']";
//	List<WebElement> barlist= driver.findElements(By.xpath(verticalxpath));
//	
//	Thread.sleep(5000);
//	Thread.sleep(5000);
//		System.out.println("total bars :" + barlist.size());
//		
//		Actions act = new Actions(driver);
//		
//		for(WebElement e:barlist) {
//			
//			
//		act.moveToElement(e).perform();
//		
//		Thread.sleep(500);
//			
//		}
		 
	 
			 
//	WebElement a= driver.findElement(By.xpath("(//div[@class=' css-anxf4j'])[1]"));
//	Thread.sleep(2000);
//	
//   a.click();
//	
//	Actions analysis = new Actions(driver);
//	
//   double randomvalue_analysis=  (Math.random() * (5 - 0 + 1) + 0);
//   
//   for(int i=0; i<=randomvalue_analysis; i++) {
//		
//  
//   analysis.pause(Duration.ofSeconds(1));
//   
//  	analysis.sendKeys(Keys.ARROW_DOWN).moveToElement(a).perform();
//   	}
//
//   analysis.sendKeys(Keys.ENTER).build().perform();
//
//	
//   Thread.sleep(2000);   
//	WebElement b= driver.findElement(By.xpath("(//div[@class=' css-anxf4j'])[2]"));
//   Thread.sleep(2000);
//
//   b.click();
//
//   Actions analysis1 = new Actions(driver);
//
//  double randomvalue_analysis1=  (Math.random() * (5 - 0 + 1) + 0);
//
//  for(int i=0; i<=randomvalue_analysis1; i++) {
//	
//
//   analysis1.pause(Duration.ofSeconds(1));
//
//	analysis1.sendKeys(Keys.ARROW_DOWN).moveToElement(b).perform();
//	}
//
//  analysis1.sendKeys(Keys.ENTER).build().perform();
//
//
//	
//   Thread.sleep(2000);   
//	WebElement c= driver.findElement(By.xpath("(//div[@class=' css-anxf4j'])[3]"));
//  Thread.sleep(2000);
//
//  c.click();
//
//  Actions analysis2 = new Actions(driver);
//
//  double randomvalue_analysis2=  (Math.random() * (5 - 0 + 1) + 0);
//
//  for(int i=0; i<=randomvalue_analysis2; i++) {
//	
//
// analysis2.pause(Duration.ofSeconds(1));
//
//	analysis2.sendKeys(Keys.ARROW_DOWN).moveToElement(c).perform();
//	}
//
//analysis2.sendKeys(Keys.ENTER).build().perform();	
//  
//	
//Thread.sleep(2000);   
//	WebElement d= driver.findElement(By.xpath("(//div[@class=' css-anxf4j'])[4]"));
//Thread.sleep(2000);
//
//d.click();
//
//Actions analysis3 = new Actions(driver);
//
//double randomvalue_analysis3=  (Math.random() * (5 - 0 + 1) + 0);
//
//for(int i=0; i<=randomvalue_analysis3; i++) {
//	
//
//analysis3.pause(Duration.ofSeconds(1));
//
//	analysis3.sendKeys(Keys.ARROW_DOWN).moveToElement(d).perform();
//	}
//
//analysis3.sendKeys(Keys.ENTER).build().perform();	

	
	
	// to download graph 
	
//	ins.chartmenu().click();
//	Thread.sleep(2000);
//	
//
//	ins.pngimage().click();
//	Thread.sleep(2000);
//	
//	ins.chartmenu().click();
//	Thread.sleep(2000);
//	ins.jpegimage().click();
//	Thread.sleep(2000);
//	
//	ins.chartmenu().click();
//	Thread.sleep(2000);
//	ins.cvgimage().click();
//	Thread.sleep(2000);
//	
//	ins.chartmenu().click();
//	Thread.sleep(2000);
//	ins.svgimage().click();
//	Thread.sleep(2000);
//	
//	ins.chartmenu().click();
//	Thread.sleep(2000);
//	ins.xlsimage().click();
	


	
	
//	Thread.sleep(5000);
//	String verticalxpath1 = "(//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group'])[4]//*[name()='rect']";
//	List<WebElement> barlist1= driver.findElements(By.xpath(verticalxpath1));
//	
//	Thread.sleep(5000);
//
//	System.out.println("total bars :" + barlist1.size());
//	
//	Actions act1 = new Actions(driver);
//	
//	for(WebElement e:barlist1) {
//		
//		
//	act1.moveToElement(e).perform();
//	
//	Thread.sleep(500);
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Thread.sleep(20000);
//	//tickets	
//	oei.clickoei().click();
//	Thread.sleep(2000);	
//		
//	oei.clickTickets().click();
//	
//    Thread.sleep(5000);
//    
//    
//    oei.daterange().click();
//    Thread.sleep(2000);
//    oei.lastmonth().click();
//    
//    
//  
//    
//    //by default Priority
//    Thread.sleep(5000);
//    oei.Category().click();
//	
//    Thread.sleep(2000);
//    oei.Status().click();
//    Thread.sleep(2000);
//    
//    
//    
//    
//    
//    
//    Thread.sleep(2000);
//    oei.Status().click();
//    Thread.sleep(2000);
//    
//    oei.Reopened().click();
//    Thread.sleep(2000);
//    oei.Reopened().click(); 
//    Thread.sleep(2000);
//    oei.FirstResponseTime().click();
//    Thread.sleep(2000);
//    
//    oei.FirstResponseTime().click();
//    Thread.sleep(2000);
//    oei.ResolutionTime().click();
//    Thread.sleep(2000);
//    oei.ResolutionTime().click();
//    Thread.sleep(2000);
//    oei.FalsePositives().click();
//    
//    
//    Thread.sleep(10000);
//    
//    WebElement a= oei.Category1();
//	
//	Thread.sleep(10000);
//	
//	a.click();
//	
//	Actions oei1 = new Actions(driver);
//	
//    double randomvalue_oei=  (Math.random() * (5 - 0 + 1) + 0);
//    
//    for(int i=0; i<=randomvalue_oei; i++) {
//		
//    
//    oei1.pause(Duration.ofSeconds(1));
//
//    oei1.sendKeys(Keys.ARROW_DOWN).moveToElement(a).perform();
//    	}
//    oei1.sendKeys(Keys.ENTER).build().perform();
//     
//    
//    Thread.sleep(10000);
//    WebElement b= oei.priority();
//	
//    Thread.sleep(10000);
//	
//	b.click();
//	
//	Actions oei2 = new Actions(driver);
//	
//    double randomvalue_oei1=  (Math.random() * (5 - 0 + 1) + 0);
//   
//    for(int i=0; i<=randomvalue_oei1; i++) {
//		
//   
//    oei2.pause(Duration.ofSeconds(1));
//
//    oei2.sendKeys(Keys.ARROW_DOWN).moveToElement(b).perform();
//   	}
//    oei2.sendKeys(Keys.ENTER).build().perform();
//    
//    
//    Thread.sleep(10000);
//    WebElement c= oei.Status1();
//	
// 	Thread.sleep(10000);
// 	
// 	c.click();
// 	
// 	Actions oei3 = new Actions(driver);
// 	
//    double randomvalue_oei2=  (Math.random() * (5 - 0 + 1) + 0);
//    
//    for(int i=0; i<=randomvalue_oei2; i++) {
// 		
//    
//    oei3.pause(Duration.ofSeconds(1));
//
//    oei3.sendKeys(Keys.ARROW_DOWN).moveToElement(c).perform();
//    	}
//    oei3.sendKeys(Keys.ENTER).build().perform(); 
//    
//    
//    Thread.sleep(10000);
//    WebElement d= oei.Reopened1();
//	
//  	Thread.sleep(10000);
//  	
//  	d.click();
//  	
//  	Actions oei4 = new Actions(driver);
//  	
//    double randomvalue_oei3=  (Math.random() * (5 - 0 + 1) + 0);
//     
//    for(int i=0; i<=randomvalue_oei3; i++) {
//  		
//     
//    oei4.pause(Duration.ofSeconds(1));
//
//    oei4.sendKeys(Keys.ARROW_DOWN).moveToElement(d).perform();
//     	}
//    oei4.sendKeys(Keys.ENTER).build().perform();
    
    
//    Thread.sleep(5000); 
//    oei.searchbar().sendKeys(TestCaseData.search); 
//
//    Thread.sleep(5000);
//    oei.incident1().click();
//    Thread.sleep(2000);
    
    
    
//    oei.Assignbutton().click();
//	Thread.sleep(2000);
//	oei.Assign().sendKeys(TestCaseData.Assign);
//	Thread.sleep(2000);
//	oei.submit1().click();
//	Thread.sleep(5000);
//    
//	oei.share().click();
//
//	oei.details().click();
//	Thread.sleep(3000);
//	oei.back().click();
//    
//   
//    
//    
//    oei.Searchupdate().sendKeys(TestCaseData.Searchupdate);
//    Thread.sleep(2000);
//	oei.typehere().sendKeys(TestCaseData.typehere);
//	Thread.sleep(2000);
//	oei.Update().click();
//    Thread.sleep(4000);
//	  
//	oei.back().click();
//	  
//    Thread.sleep(3000);
//    
//	oei.comment().click();
//	Thread.sleep(3000);
//	oei.commenttype().sendKeys(TestCaseData.commenttype);
//	Thread.sleep(5000);
//	oei.commentsubmit().click();
    
//	oei.Assignbutton().click();
//	Thread.sleep(2000);
//	oei.Assign().sendKeys(TestCaseData.Assign);
//	Thread.sleep(2000);
//	oei.submit1().click();
//	Thread.sleep(5000);
	    
//	oei.share().click();
//	    
//	Thread.sleep(5000);
//	oei.details().click();
//	Thread.sleep(3000);
//	oei.back().click();
//	Thread.sleep(3000);
//	oei.comment().click();
//	Thread.sleep(3000);
//	oei.commenttype().sendKeys(TestCaseData.commenttype);
//	Thread.sleep(5000);
//	oei.commentsubmit().click();
    
//    Thread.sleep(4000);
//	oei.next().click();
//	Thread.sleep(2000);
//	oei.next().click();
//	Thread.sleep(2000);
//	oei.next().click();
//	Thread.sleep(2000);
//    oei.next().click();
//	Thread.sleep(2000);
//    oei.previous().click();
//	Thread.sleep(2000);
//	oei.previous().click();
//	Thread.sleep(2000);
//	oei.previous().click();
//	Thread.sleep(2000);
//	oei.previous().click();
//	Thread.sleep(2000);
//    oei.back().click();
	    
	
	
	
    
    
    
    
    
		
	      
	      
	      
	      
	      
	      
	
	      
    	
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	



