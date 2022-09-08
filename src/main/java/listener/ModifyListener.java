package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ModifyListener implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("********************************Test case finish successfully*******************************************");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("**********************************Test Case Started Here*********************************************");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("***************************************Test case Failed*********************************************************");
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Test case passed Successfully");
		
	}


	

}
