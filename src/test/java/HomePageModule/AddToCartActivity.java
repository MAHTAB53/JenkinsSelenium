package HomePageModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import HelperPages.CommonTestData;
import HelperPages.TestDataHelper;
import PageObjects.AddtoCartPage;
import PageObjects.TopDealsPage;
import TestComponents.Base;

public class AddToCartActivity extends Base{
	
	@Test
	public void Addtocart() throws Exception {
	testDataHelper = new TestDataHelper();
	CommonTestData commontestdata = ctd.get();
	driver =  commontestdata.getDriver();
	AddtoCartPage addtocartpage = new AddtoCartPage(driver);

	launchApplication();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	addtocartpage.click_addToCart_Button();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	addtocartpage.click_Cart_Icon();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	addtocartpage.click_proceedCheckout_Button();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	addtocartpage.enterValue_Promocode_Field(testDataHelper.getValue("WrongPromocode"));
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	addtocartpage.click_Apply_Button();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Assert.assertEquals(addtocartpage.invalidCode.getText(), "Invalid code ..!");
	
	Actions act = new Actions(driver);
	act.doubleClick(addtocartpage.Promocode_Field).perform();
	addtocartpage.enterValue_Promocode_Field(testDataHelper.getValue("CorrectPromocode"));
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	addtocartpage.click_Apply_Button();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Assert.assertEquals(addtocartpage.validCode.getText(), "Code applied ..!");
	
}
}