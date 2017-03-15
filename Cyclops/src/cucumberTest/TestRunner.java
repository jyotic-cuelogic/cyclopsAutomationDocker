package cucumberTest;
 


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"step_definition"}
		, format = {"pretty", "html:target/Destination"}
		
		)
 
public class TestRunner {
	public static void main(String[] args)
	{
	
	}
}