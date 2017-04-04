package CSVRead;

import java.io.FileReader;
import java.util.Random;

import org.openqa.selenium.WebDriver;

import pageObjects.homePage;

import com.opencsv.CSVReader;

public class CSVReadHotelSearch {

 //Provide CSV file path. It Is In D: Drive.
 String CSV_PATH="C:\\Users\\sandra\\Documents\\Eclipse\\Cucumber-Workspace\\Cyclops\\src\\Utilities\\SearchHotel.csv";
 
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
	   String address = csvCell[0];
	   String city = csvCell[1];
	   String stateCode = csvCell[2];
	   String postalCode = csvCell[3];
	   homePage.txt_address(driver).sendKeys(address);
	   homePage.txt_city(driver).sendKeys(city);
	   homePage.drp_state(driver).selectByValue(stateCode);
	   homePage.txt_zip(driver).sendKeys(postalCode);
	   System.out.println(address);
	   System.out.println(city);
	   System.out.println(stateCode);
	   System.out.println(postalCode);
	   
 }
 }
}