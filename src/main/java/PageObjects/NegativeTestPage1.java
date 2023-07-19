package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HelperPages.CommonUtilities;

public class NegativeTestPage1 extends CommonUtilities{
WebDriver driver;
	
	public NegativeTestPage1(WebDriver driver) {
		super(driver);	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="///a[contains(text(),'Flight')]")
	private WebElement flightbookin;
	public void click_flightbookin() {
		flightbookin.click();
	}
	
}
