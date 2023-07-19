package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HelperPages.CommonUtilities;

public class AddtoCartPage extends CommonUtilities{

	WebDriver driver;

	public AddtoCartPage(WebDriver driver) {
		super(driver);	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")
	private WebElement addToCart_Button;
	
	@FindBy(xpath="//img[@alt='Cart']")
	private WebElement Cart_Icon;
	
	@FindBy(xpath="//button[contains(text(),'PROCEED TO CHECKOUT')]")
	private WebElement proceedCheckout_Button;
	
	@FindBy(xpath="//input[@class='promoCode']")
	public WebElement Promocode_Field;
	
	@FindBy(xpath="//button[@class='promoBtn']")
	private WebElement Apply_button;
	
	@FindBy(xpath="//span[contains(text(),'Invalid code ..!')]")
	public WebElement invalidCode;
	
	@FindBy(xpath="//span[contains(text(),'Code applied ..!')]")
	public WebElement validCode;
	
	public void click_addToCart_Button() {
		addToCart_Button.click();
	}
	
	public void click_Cart_Icon() {
		Cart_Icon.click();
	}
	public void click_proceedCheckout_Button() {
		proceedCheckout_Button.click();
	}
	
	public void enterValue_Promocode_Field(String Promocode) {
		Promocode_Field.sendKeys(Promocode);;
	}
	public void click_Promocode_Field() {
		Promocode_Field.click();
	}
	public void click_Apply_Button() {
		Apply_button.click();
	}
	
	//Code applied ..!
}
