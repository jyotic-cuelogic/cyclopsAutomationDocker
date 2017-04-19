package pageObjects;

import java.lang.annotation.Annotation;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import cucumber.api.java.it.Date;

public class dateSelector {

	String checkedInDate;
	
	public String checkInDate() throws Exception
	{
		try
		{
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			LocalDateTime now = LocalDateTime.now().plusDays(2);
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
	
	
}
