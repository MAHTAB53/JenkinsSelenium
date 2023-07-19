package HomePageModule;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelperPages.CommonTestData;
import HelperPages.TestDataHelper;
import PageObjects.LoginRSAcademyPage;
import PageObjects.RegisterRSAcademyPage;
import TestComponents.Base;

public class LoginActivity  extends Base{
	
	@Test
	public void loginRsAcademy() throws Exception {
		testDataHelper = new TestDataHelper();
		CommonTestData commonTestData = ctd.get();
		driver = commonTestData.getDriver();
		LoginRSAcademyPage loginpage = new LoginRSAcademyPage(driver);
		launchApplication();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String parenthandle = driver.getWindowHandle();
		loginpage.click_LinkforLogin();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Set<String> childs = driver.getWindowHandles();
		for(String child : childs)
		{
			if(!child.equals(parenthandle))
			{
				driver.switchTo().window(child);
				loginpage.click_register_buttonforLogin();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				loginpage.click_SignIn_button();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				loginpage.EnterValue_emailField_Login(testDataHelper.getValue("UserEmail"));
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				loginpage.EnterValue_passwordField_Login(testDataHelper.getValue("Password"));
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				loginpage.click_Login_Button();
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

