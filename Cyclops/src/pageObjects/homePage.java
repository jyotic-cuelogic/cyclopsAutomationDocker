package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	private static WebDriver driver = null;
		
	public static WebElement agent_id()
	{
		try
		{
			WebElement element = driver.findElement(By.id("search-hotels"));
			System.out.println("Search Hotel button found");
			System.out.println(element.getText());
			return element;
			
		}
		catch(Exception e)
		{
			System.out.println("Search Hotel button not found");
			throw e;
		}
	}
	
}
