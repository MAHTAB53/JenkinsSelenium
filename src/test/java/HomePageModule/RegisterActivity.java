package HomePageModule;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelperPages.CommonTestData;
import HelperPages.TestDataHelper;
import PageObjects.RegisterRSAcademyPage;
import TestComponents.Base;

public class RegisterActivity extends Base{
	@Test
	public void registerRsAcademy() throws Exception {
        testDataHelper = new TestDataHelper();
        CommonTestData commonTestData = ctd.get();
        driver = commonTestData.getDriver();
        RegisterRSAcademyPage Registerpage = new RegisterRSAcademyPage(driver);
        launchApplication();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String parenthandle = driver.getWindowHandle();
        Registerpage.click_Link();
        Set<String> handles = driver.getWindowHandles();
        for(String handle : handles)
        {
            if(!handle.equals(parenthandle))
            {
                driver.switchTo().window(handle);
                Registerpage.click_registerButton();
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                Registerpage.click_emailButton();
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                Registerpage.enterValue_userNameField(testDataHelper.getValue("UserName"));
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                Registerpage.enterValue_usereMailField(testDataHelper.getValue("UserEmail"));
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                Registerpage.enterValue_passwordField(testDataHelper.getValue("Password"));
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                Registerpage.click_signupButton();
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
