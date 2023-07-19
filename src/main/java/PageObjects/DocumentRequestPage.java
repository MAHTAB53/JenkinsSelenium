package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HelperPages.CommonUtilities;

public class DocumentRequestPage extends CommonUtilities{
	WebDriver driver;

	public DocumentRequestPage(WebDriver driver) {
		super(driver);	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[contains(text(),'Flight Booking')]")
	private WebElement Flightbook_3_Button;

	@FindBy(xpath="//a[contains(text(),'Free Access to InterviewQues/ResumeAssistance/Mate')]")
	private WebElement AccessLink;
	
	public void click_Flightbook_3_Button() {
		Flightbook_3_Button.click();
	}
	public void click_AccessLink() {
		AccessLink.click();
	}
}
