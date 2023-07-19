package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HelperPages.CommonUtilities;

public class NegativeTestPage2 extends CommonUtilities {
WebDriver driver;
	
	public NegativeTestPage2(WebDriver driver) {
		super(driver);	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="///a[contains(text(),'Top Deals')]")
	private WebElement TopDealss;
	public void click_TopDealss() {
		TopDealss.click();
	}
}
