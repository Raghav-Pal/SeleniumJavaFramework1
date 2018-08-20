package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener, ISuiteListener {

	public void onTestStart(ITestResult result) {
		System.out.println("********* Test started : "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("********* Test is sucessful : "+result.getName());		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("********* Test failed : "+result.getName());		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("********* Test skipped : "+result.getName());		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("********* Tests Completed : "+context.getName());		
		
	}

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		
	}

}
