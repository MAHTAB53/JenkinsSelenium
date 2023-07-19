package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HelperPages.CommonUtilities;

public class FlightBooking_2_Page extends CommonUtilities{
	WebDriver driver;

	public FlightBooking_2_Page(WebDriver driver) {
		super(driver);	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Flight Booking')]")
	private WebElement Flightbook_2_Button;
	

	@FindBy(xpath="//label[contains(text(),'Round Trip')]")
	private WebElement RoundTrip_Button;
	
	@FindBy(xpath="//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")
	public WebElement Departure;
	
	@FindBy(xpath="//a[contains(text(),'Amritsar (ATQ)')]")
	private WebElement Departure_city;
	
	@FindBy(xpath="//body[1]/form[1]/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[3]/div[1]/div[1]/ul[2]/li[1]/a[1]")
	private WebElement Arrival_city;
	
	
	
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/a[1]")
	private WebElement my_departDate;
	
	@FindBy(xpath="//input[@id='ctl00_mainContent_view_date2']")
	private WebElement returnDate;
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/a[1]")
	private WebElement my_returnDate;
	
	@FindBy(xpath="//input[@id='ctl00_mainContent_btn_FindFlights']")
	private WebElement searchFlight;
	
	public void click_Flightbook_2_Button() {
		Flightbook_2_Button.click();
	}
	public void click_RoundTrip_Button() {
		RoundTrip_Button.click();
	}
	public void click_Departure() {
		Departure.click();
	}
	public void click_DepartureCity() {
		Departure_city.click();
	}
	public void click_ArrivalCity() {
		Arrival_city.click();
	}
	

	public void click_my_departDate() {
		my_departDate.click();
	}
	public void click_returnDate() {
		returnDate.click();
	}
	public void click_my_returnDate() {
		my_returnDate.click();
	}
	public void click_searchFlight() {
		searchFlight.click();
	}
	
}
