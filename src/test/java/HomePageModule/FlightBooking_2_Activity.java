package HomePageModule;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import HelperPages.CommonTestData;
import HelperPages.TestDataHelper;
import PageObjects.FlightBooking_1_Page;
import PageObjects.FlightBooking_2_Page;
import TestComponents.Base;

public class FlightBooking_2_Activity extends Base{
	@Test
	public void FlightBooking_2() throws Exception {
		testDataHelper = new TestDataHelper();
		CommonTestData commonTestData = ctd.get();
		driver = commonTestData.getDriver();
		FlightBooking_2_Page fbook2page = new FlightBooking_2_Page(driver);
		launchApplication();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String parenthandle = driver.getWindowHandle();
		fbook2page.click_Flightbook_2_Button();
		Set<String> childs = driver.getWindowHandles();
		for(String child : childs)
		{
			if(!child.equals(parenthandle))
			{
				driver.switchTo().window(child);
				fbook2page.click_RoundTrip_Button();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				fbook2page.click_Departure();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				fbook2page.click_DepartureCity();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				fbook2page.click_ArrivalCity();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				fbook2page.click_my_departDate();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				fbook2page.click_returnDate();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				fbook2page.click_my_returnDate();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				fbook2page.click_searchFlight();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				String ActualTitle = driver.getTitle();
	        	String ExpectedTitle = "QAClickJet - Flight Booking for Domestic and International, Cheap Air Tickets";
	        	Assert.assertEquals(ActualTitle, ExpectedTitle);
				driver.close();
			}
		}
		driver.switchTo().window(parenthandle);

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
}

