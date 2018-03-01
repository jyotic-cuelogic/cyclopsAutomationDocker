package Utilities;

public class settings {

	String url;
	
	public String cyclops_url() throws Exception
	{
		try
		{
			url = "https://sales-stg.travelpass.com/?vocalcomid=123456@nat.ipitimi.net&indexid=TMP_20151218_123612&DID=9879879870&ANI=UNKNOWN";
		}
		catch(Exception e)
		{
			System.out.println("cyclops_url failed");
			throw e;
		}
		return url;
	}
}
