package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/Features",
		glue = { "StepDef"},
		plugin= { "pretty", 
				"html:target/cucumber-Report.html", "json:target/report.json" , "junit:target/Cucumber.xml" },
		//Generates different reports in pretty format
		tags= "@Flipkart_Search",
		monochrome = true
		)
public class TestNGclass extends AbstractTestNGCucumberTests{

	
}
