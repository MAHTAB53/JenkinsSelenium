package PageObjects;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import HelperPages.CommonUtilities;

public class HomePage  extends CommonUtilities {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@class='search-keyword']")
	private WebElement search_Field;
	
	@FindBy(xpath="//button[@class='search-button']")
	private WebElement search_Button;
	
	@FindBy(xpath="//a[@class='increment']")
	private WebElement increment_Button;
	

	
	@FindBy(xpath="//a[@class='decrement']")
	private WebElement decrement_Button;
	
	
	public void SearchBox_value(String search_text) {
		search_Field.sendKeys(search_text);
	}
	public void SearchIcon_click() {
		search_Button.click();;
	}
	public void plus_click() {
		increment_Button.click();
	}

	public void minus_click() {
		decrement_Button.click();
	}
	
	
}
