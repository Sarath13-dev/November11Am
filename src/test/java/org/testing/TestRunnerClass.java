package org.testing;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.junit.Cucumber;
import gherkin.ast.ScenarioOutline;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\Cucumber6PmDecember\\src\\test\\resources\\Features\\FacebookLogin.feature",
		 dryRun= false, monochrome=true,
		 plugin= {"pretty","junit:C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\Cucumber6PmDecember\\target\\sample.json"}
		
		)
public class TestRunnerClass {

	@AfterClass
	public static void report() {
		
		JVMREportingDecember6PM.generateReport("C:\\\\Users\\\\RAM SARATH KUMAR\\\\eclipse-workspace\\\\Cucumber6PmDecember\\\\target\\\\sample.json");
	}
	
	
	

}
