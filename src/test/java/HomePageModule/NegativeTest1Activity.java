package HomePageModule;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelperPages.CommonTestData;
import HelperPages.TestDataHelper;
import PageObjects.AddtoCartPage;
import PageObjects.NegativeTestPage1;
import TestComponents.Base;

public class NegativeTest1Activity extends Base{
	@Test
	public void NegativeTest1Activity() throws Exception {
		testDataHelper = new TestDataHelper();
		CommonTestData commontestdata = ctd.get();
		driver =  commontestdata.getDriver();
		NegativeTestPage1 negativeTest = new NegativeTestPage1(driver);

		launchApplication();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		negativeTest.click_flightbookin();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "GreenKart - veg and fruits kart";
		Assert.assertEquals(ActualTitle, ExpectedTitle);

	}
}
