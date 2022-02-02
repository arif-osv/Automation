package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Blackchain"},
		glue = {"stepdefinitions", "parallel"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			//	, "timeline:test-output-thread/"

				 "html:target/cucumber-reports/cucumber.html",
	                "json:target/cucumber-reports/cucumber.json"
				
				
		}
		
		)

public class MyTestRunner  {

}
 