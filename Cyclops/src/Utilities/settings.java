package Utilities;
import java.util.HashMap;
import java.util.Map;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

 public class settings
{
   private WebDriver driver = null;
   
public static String cyclops_url() throws Exception
   {
	  try
	  {
		String url = "https://sales-stg.travelpass.com/?vocalcomid=101078@nat.ipitimi.net&did=1234567890&indexid=6453654736&ani=7453754777" ;
		return url;
	  }
	  catch (Exception e)
	  {
		  throw e;
	  }
   }
}