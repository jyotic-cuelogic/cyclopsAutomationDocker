package CommonFunctions;

import org.openqa.selenium.WebDriver;

import pageObjects.propertyPage;

public class CreateDID {

	
	public static String[] createDID(WebDriver driver) throws Exception
	{
		try
		{
			propertyPage pr = new propertyPage();
			pr.drpdwn_TypeforCreateDID(driver).selectByIndex(1);
			pr.drpdwn_BrandeforCreateDID(driver).selectByIndex(1);
			pr.btn_CreateDID(driver).click();
			String phone = pr.txt_CreateDIDPhoneNumber(driver).getText();
			String url = pr.txt_CreateDIDUrl(driver).getText();
			
			return new String[] {phone,url};
		}
		catch(Exception e)
		{
			System.out.println("createDID failed");
			throw e;
		}
	}
	
}
