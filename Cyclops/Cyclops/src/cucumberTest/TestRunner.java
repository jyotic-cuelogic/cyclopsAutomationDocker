package cucumberTest;
 


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"step_definition"}
//		, format = {"pretty", "html:target/Destination"}
		, format = { "pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json"}
		, tags = { "~@ignore" }
		
		)
 
public class TestRunner {
	public static void main(String[] args)
	{
	
	}
}