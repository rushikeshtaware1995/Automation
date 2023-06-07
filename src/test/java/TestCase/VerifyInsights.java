package TestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.Insights;
import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class VerifyInsights extends BaseClass{
	
	@Test
    public void insights() throws InterruptedException {
    	
    	

        LoginPageObject lpo= new LoginPageObject(driver);
		
        lpo.EnterUsername().sendKeys(TestCaseData.username);
		
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		lpo.ClickSubmit().click();
		
		Thread.sleep(20000);
		
		Insights ins = new Insights(driver);
		Thread.sleep(2000);
		ins.clickoninsights().click();
		Thread.sleep(2000);
		
		
	//page title	
	    String actual_title =driver.getTitle();
	   // System.out.println("Current page title is"+" "+actual_title);
	    
	    if(actual_title.contains("Insight")) {
	    	
			 ExtentManager.test.createNode("Expected page title is insights and Actual page title is insights");

	       // System.out.println("Expected page title is insights and Actual page title is insights");
	    }
	    
	    else {
	    	
			 ExtentManager.test.createNode("Expected page title is insights and Actual page title is not insights");

	    	// System.out.println("Expected page title is insights and Actual page title is not insights");
	    	
	    }
	
		Thread.sleep(2000);
	    //alertsbyconfidence
//		Thread.sleep(2000);
//    	ins.alertsbyconfidence_chart1().click();
//		Thread.sleep(2000);
//    	ins.alertsbyconfidence_chart2().click();
//		Thread.sleep(2000);
    	ins.chartmenu().click();
		Thread.sleep(2000);
		
	
    	ins.pngimage().click();
		Thread.sleep(2000);
		
		ins.chartmenu().click();
		Thread.sleep(2000);
    	ins.jpegimage().click();
		Thread.sleep(2000);
		
		ins.chartmenu().click();
		Thread.sleep(2000);
    	ins.cvgimage().click();
		Thread.sleep(2000);
		
		ins.chartmenu().click();
		Thread.sleep(2000);
		ins.svgimage().click();
		Thread.sleep(2000);
		
		ins.chartmenu().click();
		Thread.sleep(2000);
    	ins.xlsimage().click();
    	
    	
//alert_type
	    
    	Thread.sleep(2000);
    	ins.alert_type1().click();
    	Thread.sleep(2000);
    	ins.alert_type1().click();
    	Thread.sleep(2000);
    	ins.alert_type2().click();
    	Thread.sleep(2000);
    	ins.alert_type2().click();
    	
    	Thread.sleep(2000);
    	ins.alert_type3().click();
    	Thread.sleep(2000);
    	ins.alert_type3().click();
    	
    	Thread.sleep(2000);
    	ins.alert_type4().click();
    	Thread.sleep(2000);
    	ins.alert_type4().click();
    	
    	Thread.sleep(2000);
    	ins.alert_type5().click();
    	Thread.sleep(2000);
    	ins.alert_type5().click();
    	
    	Thread.sleep(2000);
    	ins.alert_type6().click();
    	Thread.sleep(2000);
    	ins.alert_type6().click();
    	
    	Thread.sleep(1000);
    	ins.alert_type7().click();
    	Thread.sleep(1000);
    	ins.alert_type7().click();
    	
 //   	request_type
    	
		Thread.sleep(2000);
		ins.request_type1().click();
		Thread.sleep(500);
		ins.reset_filters().click();
		Thread.sleep(100);
		ins.request_type2().click();
		Thread.sleep(100);
		ins.reset_filters().click();
		Thread.sleep(100);
		ins.request_type3().click();
		Thread.sleep(100);
		ins.reset_filters().click();
		
		Thread.sleep(1000);
		ins.request_status1().click();
		Thread.sleep(500);
		ins.reset_filters().click();
		Thread.sleep(500);
		ins.request_status2().click();
		Thread.sleep(500);
		ins.reset_filters().click();
		Thread.sleep(500);
		ins.request_status3().click();
		Thread.sleep(500);
		ins.reset_filters().click();
		
	//top10assets
		
		Thread.sleep(100);
		ins.top10assets_a_c_1().click();	
			
		Thread.sleep(100);
		ins.reset_filters().click();	
		Thread.sleep(100);
		ins.top10assets_a_c_2().click();	
		
		Thread.sleep(100);
		ins.reset_filters().click();	
	
		Thread.sleep(100);
		ins.top10assets_a_c_3().click();	
	
		Thread.sleep(100);
		ins.reset_filters().click();	
	
		Thread.sleep(100);
		ins.top10assets_a_c_4().click();	
	
		Thread.sleep(100);
		ins.reset_filters().click();
		Thread.sleep(100);
		ins.top10assets_a_c_5().click();
		Thread.sleep(100);
		ins.reset_filters().click();
		Thread.sleep(100);
		ins.top10assets_a_c_6().click();
		Thread.sleep(100);
		ins.reset_filters().click();	
		Thread.sleep(100);
		ins.top10assets_a_c_7().click();
		Thread.sleep(100);
		ins.reset_filters().click();
		Thread.sleep(100);
		ins.top10assets_a_c_8().click();
		Thread.sleep(100);
		ins.reset_filters().click();	
		Thread.sleep(100);
		ins.top10assets_a_c_9().click();
		Thread.sleep(100);
		
		ins.reset_filters().click();
		Thread.sleep(100);
	
		ins.top10assets_a_c_10().click();
		Thread.sleep(1000);
		ins.top10assets_a_c_1().click();	
	    
	    Thread.sleep(5000);
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	    js.executeScript("window.scrollBy(0,800)", "");
	    
	 
	    
	    
	    Thread.sleep(10000);
		
        ins.details().click();
        Thread.sleep(5000);
        ins.Searchupdate().sendKeys(TestCaseData.ins_search);
        Thread.sleep(5000);
        ins.typehere().sendKeys(TestCaseData.ins_type_here);
        Thread.sleep(5000);
        
	    ins.update_ins().click();
	    Thread.sleep(1000);
    	ins.back_ins().click();
     	
    	Thread.sleep(5000);
	    js.executeScript("window.scrollBy(0,800)", "");

    	Thread.sleep(5000);
    	ins.share_ins().click();
    	
    	Thread.sleep(2000);
    	ins.assign_ins().click();
    	Thread.sleep(2000);
    	ins.assign_to_ins().sendKeys(TestCaseData.assign_to);
    	Thread.sleep(8000);
    	ins.submit_ins().click();
    	Thread.sleep(5000);
    	ins.comment_ins().click();
    	Thread.sleep(2000); 
    	ins.add_comment().sendKeys(TestCaseData.add_comment);
    	Thread.sleep(2000);
    	ins.submit_ins().click();
    	
		 Thread.sleep(5000);
    			 
		 js.executeScript("window.scrollBy(0,-800)", "");
		 Thread.sleep(5000);

		WebElement a= driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[1]"));
		Thread.sleep(2000);
		
        a.click();
		
		Actions analysis = new Actions(driver);
		
        double randomvalue_analysis=  (Math.random() * (5 - 0 + 1) + 0);
        
	    for(int i=0; i<=randomvalue_analysis; i++) {
    		
       
	    analysis.pause(Duration.ofSeconds(1));
	    
	   	analysis.sendKeys(Keys.ARROW_DOWN).moveToElement(a).perform();
	    	}
	
       analysis.sendKeys(Keys.ENTER).build().perform();
    
    	
    Thread.sleep(2000);   
   	WebElement b= driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[2]"));
	Thread.sleep(2000);
	
    b.click();
	
	Actions analysis1 = new Actions(driver);
	
    double randomvalue_analysis1=  (Math.random() * (5 - 0 + 1) + 0);
    
    for(int i=0; i<=randomvalue_analysis1; i++) {
		
   
    analysis1.pause(Duration.ofSeconds(1));
    
   	analysis1.sendKeys(Keys.ARROW_DOWN).moveToElement(b).perform();
    	}

    analysis1.sendKeys(Keys.ENTER).build().perform();

	
    	
    Thread.sleep(2000);   
   	WebElement c= driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[3]"));
	Thread.sleep(2000);
	
    c.click();
	
	Actions analysis2 = new Actions(driver);
	
    double randomvalue_analysis2=  (Math.random() * (5 - 0 + 1) + 0);
    
    for(int i=0; i<=randomvalue_analysis2; i++) {
		
   
    analysis2.pause(Duration.ofSeconds(1));
    
   	analysis2.sendKeys(Keys.ARROW_DOWN).moveToElement(c).perform();
    	}

    analysis2.sendKeys(Keys.ENTER).build().perform();	
       
    	
    Thread.sleep(2000);   
   	WebElement d= driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[4]"));
	Thread.sleep(2000);
	
    d.click();
	
	Actions analysis3 = new Actions(driver);
	
    double randomvalue_analysis3=  (Math.random() * (5 - 0 + 1) + 0);
    
    for(int i=0; i<=randomvalue_analysis3; i++) {
		
   
    analysis3.pause(Duration.ofSeconds(1));
    
   	analysis3.sendKeys(Keys.ARROW_DOWN).moveToElement(d).perform();
    	}

    analysis3.sendKeys(Keys.ENTER).build().perform();	

    	
    	
    	


		
		
		

    
    
    
     
    	
    
    
    
    
    
    
    
    				
    
    												
    												
    												
    												
	
	}
	

	

	
	
	
	
	
	
//	Thread.sleep(5000);	
//	driver.findElement(By.linkText("Insights")).click();	
//	Thread.sleep(5000);	
//	driver.findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect'])[1]")).click();
//	Thread.sleep(2000);	
//	driver.findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect'])[2]")).click();
//		
//	Thread.sleep(5000);	
//	driver.findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-exporting-group']//*[name()='path'])[1]")).click();
//	Thread.sleep(2000);	
//	driver.findElement(By.xpath("//li[normalize-space()='Download PNG image']")).click();
	
	//li[normalize-space()='Download JPEG image']
	//li[normalize-space()='Download SVG vector image']
		
	//li[normalize-space()='Download CSV']	
	
	//li[normalize-space()='Download XLS']
	
	//li[normalize-space()='Download XLS']	
	
	
	
	
	
	
	

}
