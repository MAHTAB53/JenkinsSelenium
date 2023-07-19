package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HelperPages.CommonUtilities;

public class LoginRSAcademyPage extends CommonUtilities{
	WebDriver driver;

    public LoginRSAcademyPage(WebDriver driver) {
        super(driver);    
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

 

    
    @FindBy(xpath="//a[@class='cart-header-navlink blinkingText']")
    private WebElement linkForLogin;
    
    @FindBy(xpath="//a[@href='https://courses.rahulshettyacademy.com/sign_up']")
    private WebElement register_buttonforLogin;
    
    @FindBy(xpath="//a[@href='/secure/9521/identity/login']")
    private WebElement SignIn_button;
  
    @FindBy(xpath="//input[@name='email']")
    private WebElement emailField_Login;
    
    @FindBy(xpath="//input[@name='password']")
    private WebElement passwordField_Login;
  
    
    @FindBy(xpath="//input[@value='Log in']")
    private WebElement Login_Button;
    

    public void click_LinkforLogin() {
        linkForLogin.click();
    }
    
    public void click_register_buttonforLogin() {
    	register_buttonforLogin.click();
    }
    
    
    public void click_SignIn_button() {
    	SignIn_button.click();
    }
    
    public void EnterValue_emailField_Login(String emailLogin) {
    	emailField_Login.sendKeys(emailLogin);;
    }
    
    public void EnterValue_passwordField_Login(String passwordLogin) {
    	passwordField_Login.sendKeys(passwordLogin);
    }
    
    public void click_Login_Button() {
    	Login_Button.click();
    }

    
}
