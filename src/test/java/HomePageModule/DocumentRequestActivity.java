package HomePageModule;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelperPages.CommonTestData;
import HelperPages.TestDataHelper;
import PageObjects.DocumentRequestPage;
import PageObjects.FlightBooking_2_Page;
import TestComponents.Base;

public class DocumentRequestActivity extends Base {
	@Test
	public void DocumentRequest() throws Exception {
		testDataHelper = new TestDataHelper();
		CommonTestData commonTestData = ctd.get();
		driver = commonTestData.getDriver();
		DocumentRequestPage requestpage = new DocumentRequestPage(driver);
		launchApplication();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String parenthandle = driver.getWindowHandle();
		requestpage.click_Flightbook_3_Button();
		Set<String> childs = driver.getWindowHandles();
		for(String child : childs)
		{
			if(!child.equals(parenthandle))
			{
				driver.switchTo().window(child);
				requestpage.click_AccessLink();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				String actualTitle = driver.getTitle();
				String expectedTitle = "Rahul Shetty Academy" ;
				Assert.assertEquals(actualTitle, expectedTitle);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				String ActualTitle = driver.getTitle();
	        	String ExpectedTitle = "Rahul Shetty Academy";
	        	Assert.assertEquals(ActualTitle, ExpectedTitle);
				driver.close();
			}
		}
		driver.switchTo().window(parenthandle);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}
