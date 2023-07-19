package HomePageModule;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import HelperPages.CommonTestData;
import HelperPages.CommonUtilities;
import HelperPages.TestDataHelper;
import PageObjects.TopDealsPage;
import TestComponents.Base;

public class TopDealsActivity extends Base {
	@Test
	public void topdealspage() throws Exception{
		testDataHelper = new TestDataHelper();
		CommonTestData commontestdata = ctd.get();
		driver =  commontestdata.getDriver();
		TopDealsPage topdealspage = new TopDealsPage(driver);

		launchApplication();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String parenthandle = driver.getWindowHandle();
		topdealspage.click_TopDeals();
		Set<String> childs = driver.getWindowHandles();
		for(String child : childs)
		{
			if(!child.equals(parenthandle))
			{
				driver.switchTo().window(child);
				topdealspage.enterValueSearchfield_TopDeals(testDataHelper.getValue("SearchValue_Topdeals"));
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				Select dropdown= new Select(topdealspage.selectPageSize);
				dropdown.selectByVisibleText("20");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				String ActualTitle = driver.getTitle();
				String ExpectedTitle = "GreenKart - veg and fruits kart";
				Assert.assertEquals(ActualTitle, ExpectedTitle);
				driver.close();
				
			}
		}
		driver.switchTo().window(parenthandle);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

	}

}
