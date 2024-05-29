package stepDefinition;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class) 
@CucumberOptions (features="src/test/resources/Features", glue={"stepDefinition"} , plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} , publish = true) 
//@CucumberOptions (features="src/test/resources/Features", glue={"stepDefinition"} , plugin = {"pretty" , "html:target/cucumber-html-report", "json:target/cucumber.json", "junit:target/cucumber.xml", "rerun:target/rerun.txt"} , publish = true) 

public class Runner {

}
