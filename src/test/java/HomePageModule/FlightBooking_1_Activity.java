package HomePageModule;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelperPages.CommonTestData;
import HelperPages.TestDataHelper;
import PageObjects.FlightBooking_1_Page;
import PageObjects.LoginRSAcademyPage;
import TestComponents.Base;

public class FlightBooking_1_Activity extends Base{
	@Test
	public void FlightBooking_1() throws Exception {
		testDataHelper = new TestDataHelper();
		CommonTestData commonTestData = ctd.get();
		driver = commonTestData.getDriver();
		FlightBooking_1_Page fbook1page = new FlightBooking_1_Page(driver);
		launchApplication();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String parenthandle = driver.getWindowHandle();
		fbook1page.click_Flightbook_Button();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Set<String> childs = driver.getWindowHandles();
		for(String child : childs)
		{
			if(!child.equals(parenthandle))
			{
				driver.switchTo().window(child);
				fbook1page.enter_country_Field(testDataHelper.getValue("country"));
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				String ActualTitle = driver.getTitle();
	        	String ExpectedTitle = "QAClickJet - Flight Booking for Domestic and International, Cheap Air Tickets";
	        	Assert.assertEquals(ActualTitle, ExpectedTitle);
				driver.close();
			}
		}
		driver.switchTo().window(parenthandle);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}
