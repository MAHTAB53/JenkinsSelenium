package HomePageModule;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelperPages.CommonTestData;
import HelperPages.TestDataHelper;
import PageObjects.NegativeTestPage1;
import PageObjects.NegativeTestPage2;
import TestComponents.Base;

public class NegativeTest2Activity extends Base{
	@Test
	public void NegativeTestActivity() throws Exception {
		testDataHelper = new TestDataHelper();
		CommonTestData commontestdata = ctd.get();
		driver =  commontestdata.getDriver();
		NegativeTestPage2 negativeTest2 = new NegativeTestPage2(driver);

		launchApplication();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		negativeTest2.click_TopDealss();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "GreenKart - veg and fruits kart";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}

}
