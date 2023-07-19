//package TestComponents;
//
//
//import org.testng.IRetryAnalyzer;
//import org.testng.ITestResult;
//
//public class RetryAnalyzer implements IRetryAnalyzer{
//  int count=0;
//  int maxTry =Integer.parseInt(System.getProperty("maxRetryCount"));
//	@Override
//	public boolean retry(ITestResult result) {
//		if(count<maxTry) {
//			count++;
//			return true;
//		}
//		return false;
//	}
//
//}