package Utilities;



 public class settings
{
   
public static String cyclops_url() throws Exception
   {
	  try
	  {
		String url = Cyclops_staging_url;
		return url;
	  }
	  catch (Exception e)
	  {
		  throw e;
	  }
   }
}
