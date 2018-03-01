package CommonFunctions;

import java.lang.annotation.Annotation;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import cucumber.api.java.it.Date;

public class dateSelector {

	String checkedInDate;
	String checkedOutDate;
	
	public String checkInDate() throws Exception
	{
		try
		{
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			LocalDateTime now = LocalDateTime.now().plusDays(10);
			String checkIn = dtf.format(now);
			String[] splited = checkIn.split("\\s+");
			checkedInDate = splited[0];
			System.out.println(checkedInDate);
					
		}
		catch(Exception e)
		{
			System.out.println("checkInDate failed");
			throw e;
		}
		return checkedInDate;
	}
	
	public String checkOutDate() throws Exception
	{
		try
		{
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			LocalDateTime now = LocalDateTime.now().plusDays(11);
			String checkOut = dtf.format(now);
			String[] splited = checkOut.split("\\s+");
			checkedOutDate = splited[0];
			System.out.println(checkedOutDate);
					
		}
		catch(Exception e)
		{
			System.out.println("checkOutDate failed");
			throw e;
		}
		return checkedOutDate;
	}
	
}
