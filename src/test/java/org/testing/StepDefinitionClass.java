package org.testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.bouncycastle.est.EnrollmentResponse;
import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionClass extends BaseClass {

@Given("User should be launch in Facebook page")
public static void user_should_be_launch_in_Facebook_page() {
	launchBrowser("https://www.facebook.com/");
    
}

@When("User enters the username  and password")
public void user_enters_the_username_and_password(DataTable datatable) {
   List<Map<String, String>> asMaps = datatable.asMaps();
   FacebookLoginPage a = new FacebookLoginPage();
   entertText(a.getUsername(), asMaps.get(0).get("username"));
   entertText(a.getPassword(), asMaps.get(2).get("password"));
   
}

@When("User clicks on login button")
public void user_clicks_on_login_button() {
	FacebookLoginPage a = new FacebookLoginPage();
	a.getLogin().click();
   
}

@Then("User checks that logeed into home page or not")
public void user_checks_that_logeed_into_home_page_or_not() {
  System.out.println("test");
}


	
	
	}
	

