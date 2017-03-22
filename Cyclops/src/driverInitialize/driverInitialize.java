package driverInitialize;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class driverInitialize {

	public WebDriver driverInit()
	{
		WebDriver driver;
		driver = new PhantomJSDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}
}
