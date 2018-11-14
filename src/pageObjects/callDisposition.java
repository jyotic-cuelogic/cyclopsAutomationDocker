package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class callDisposition extends Page {


	public callDisposition(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private static WebElement element = null;
	static Select select = null;

	public static WebElement fcd_text() throws Exception {
		try {
			element = driver.findElement(
					By.xpath("//p[contains(text(),'Please dispose your previous call before taking your new call')]"));
			System.out.println("FCD text found");
		} catch (Exception e) {
			System.out.println("FCD text not found");
			throw e;
		}
		return element;
	}

	public static Select call_dispose_slider() throws Exception {
		try {
			element = driver.findElement(By.id("fusion_call_disposition_status"));
			select = new Select(element);

			System.out.println("Call Disposition Slider found");
		} catch (Exception e) {
			System.out.println("Call Disposition Slider not found");
			throw e;
		}
		return select;
	}

	/*
	 * public static WebElement call_dispose_option(WebDriver d) throws Exception {
	 * try { element = d.findElement(By.xpath(
	 * "//*[@id='call_call_disposition_id']/optgroup[1]/option[1]"));
	 * System.out.println("Call Disposition Slider option found"); } catch
	 * (Exception e) {
	 * System.out.println("Call Disposition Slider option not found"); throw e; }
	 * return element; }
	 */

	public static WebElement apply_button() throws Exception {
		try {
			
			element = driver.findElement(By.id("fusion_call_disposition_submit"));
			System.out.println("Call disposition button found");
		} catch (Exception e) {
			System.out.println("Call disposition button not found");
			throw e;
		}
		return element;
	}
}
