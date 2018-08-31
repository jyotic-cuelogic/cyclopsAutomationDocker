package CSVRead;

import java.io.FileReader;
import java.util.Random;

import org.openqa.selenium.WebDriver;

import com.opencsv.CSVReader;

import pageObjects.homePage;

//import com.opencsv.CSVReader;

public class CSVReadHotelSearch {

 //Provide CSV file path. It Is In D: Drive.
 String CSV_PATH="src/Utilities/SearchHotel.csv";
 
 public void csvDataRead(WebDriver driver) throws Exception{
  
  CSVReader reader = new CSVReader(new FileReader(CSV_PATH), ',');

  
//  Random random = new Random();
//  int randomInt = random.nextInt(500);
  String [] csvCell;
//  String [] csvRow = null;
  
//  List<String[]> csvFile = reader.readAll();
  
//  System.out.println(csvFile);
  String[] num = reader.readNext();

  if ((csvCell = num) != null ) 
  {   
	  	System.out.println("Its in CSVRead");
	   String address = csvCell[0];
	   String checkin = csvCell[1];
	   String checkout = csvCell[2];
	   homePage.txt_address(driver).click();
	   homePage.txt_address(driver).sendKeys(address);
	   
	   System.out.println(address);
	   System.out.println("next is checkin and checkout field");
	    homePage.checkIn_checkOut(driver).sendKeys(checkin);
	    homePage.checkIn_checkOut(driver).sendKeys(checkout);
	
	  // homePage.drp_state(driver).selectByValue(stateCode);
//	   homePage.txt_zip(driver).sendKeys(postalCode);
	 //  System.out.println(city);
	 //  System.out.println(stateCode);
//	   System.out.println(postalCode);
	   
 }
 }
}