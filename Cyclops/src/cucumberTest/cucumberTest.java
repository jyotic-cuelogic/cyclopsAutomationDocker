package cucumberTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class cucumberTest {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new PhantomJSDriver();
		driver.get("https://{phalanx_stg_url}.com");
		driver.findElement(By.id("user_email")).sendKeys("{test_email}");
		driver.findElement(By.id("user_password")).sendKeys("{test_password}");
		driver.findElement(By.name("commit")).click();
		System.out.println(driver.findElement(By.className("portlet-title")).getText());
		driver.quit();
	}

}
