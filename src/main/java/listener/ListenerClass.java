package listener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Resources.BaseClass;
import extentManager.ExtentManager;

public class ListenerClass extends ExtentManager implements ITestListener {

	

		@Override
		public void onTestStart(ITestResult result) {
			test = extent.createTest(result.getName());
			
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			if (result.getStatus() == ITestResult.SUCCESS) {
				  test.log(Status.PASS, "Pass Test case is: " + result.getName());
				   
		}
		}

			@Override
			public void onTestFailure(ITestResult result) {
				// TODO Auto-generated method stub
				if (result.getStatus() == ITestResult.FAILURE) {
					   test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
					   test.log(Status.FAIL,
					     MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));

					   String pathString = BaseClass.screenShot(BaseClass.driver, result.getName());
					   try {
					    test.addScreenCaptureFromPath(pathString);
					   } catch (IOException e) {
						    // TODO Auto-generated catch block
						    e.printStackTrace();
						   }
						  }
						 }
			

		@Override
		public void onTestSkipped(ITestResult result) {
			if (result.getStatus() == ITestResult.SKIP) {
		    test.log(Status.SKIP, "Skipped Test case is: " + result.getName());	   
				  }
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
		}

		@Override
		public void onTestFailedWithTimeout(ITestResult result) {
		
		}
		@Override
		public void onStart(ITestContext context) {
			
		}
		@Override
		public void onFinish(ITestContext context) {
			
		}
		
		
		
		
}
