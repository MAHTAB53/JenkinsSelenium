package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HelperPages.CommonUtilities;

public class TopDealsPage extends CommonUtilities{
WebDriver driver;
	
	public TopDealsPage(WebDriver driver) {
		super(driver);	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='#/offers']")
	private WebElement TopDeals_Button;
	
	@FindBy(xpath="//input[@id='search-field']")
	private WebElement search_field;
	
	@FindBy(xpath="//select[@id='page-menu']")
	public WebElement selectPageSize;
	
	public void click_TopDeals() {
		TopDeals_Button.click();;
	}
	public void enterValueSearchfield_TopDeals(String Value) {
		search_field.sendKeys(Value);
	}
	
	
	
}
