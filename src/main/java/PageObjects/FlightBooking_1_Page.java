package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HelperPages.CommonUtilities;

public class FlightBooking_1_Page extends CommonUtilities{
	WebDriver driver;

	public FlightBooking_1_Page(WebDriver driver) {
		super(driver);	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Flight Booking')]")
	private WebElement Flightbook_Button;
	@FindBy(xpath="//input[@placeholder='Type to Select']")
	private WebElement country_Field;
	
	public void click_Flightbook_Button() {
		Flightbook_Button.click();
	}
	public void enter_country_Field(String country) {
		country_Field.sendKeys(country);
	}
}
