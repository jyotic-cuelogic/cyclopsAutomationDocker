package driverInitialize;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class driverInitialize {

	/*public WebDriver driverInit()
	{
		WebDriver driver;
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setJavascriptEnabled(true);
		caps.setCapability("cssSelectorsEnabled", false);
		caps.setCapability("applicationCacheEnabled", true);
		caps.setCapability("acceptSslCerts",true);
//		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"C:\\Users\\sandra\\Documents\\Eclipse\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin"); 
		driver = new PhantomJSDriver(caps);
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().getCookies();
		return driver;
	}*/
	
	
	public WebDriver driverInit()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-popup-blocking");
		DesiredCapabilities caps = new DesiredCapabilities().chrome();
		caps.setJavascriptEnabled(true);
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		caps.setCapability("cssSelectorsEnabled", false);
		caps.setCapability("applicationCacheEnabled", true);
		caps.setCapability("acceptSslCerts",true);
		caps.setCapability("disable-popup-blocking", true);
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(caps);			
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().getCookies();
		return driver;
	}
	
}
