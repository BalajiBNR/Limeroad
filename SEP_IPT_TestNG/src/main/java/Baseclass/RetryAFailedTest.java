package Baseclass;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAFailedTest implements IRetryAnalyzer{

	int count = 1;
	int max = 3;
	@Override
	public boolean retry(ITestResult result) {
		if(count<=max) {
			System.out.println("Retry"+count+"-----"+result.getMethod().getMethodName());
			count++;
			return true;
		}
		return false;
	}
	
	

}
