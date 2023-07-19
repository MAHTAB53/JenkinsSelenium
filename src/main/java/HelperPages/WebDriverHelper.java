package HelperPages;

import java.time.Duration;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverHelper {
	public WebDriver driver;  
	public TestDataHelper testDataHelper;
	String BROWSER;
	String host;
	MutableCapabilities dc;
	
		
	public WebDriver getWebDriver() throws Exception {
		testDataHelper = new TestDataHelper();
		BROWSER = testDataHelper.getValue("browser");
		

		if (BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--headless");//29 & 30 lines only sufficient for headless mode
			
			co.addArguments("--remote-allow-origins=*");//when i have new chrome versionand having blank window probelm then use 29 and 31 line code of this.
			driver = new ChromeDriver(co);		

		} else if(BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
		}
		else if (BROWSER.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
      

}
