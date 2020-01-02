package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testing {
public static String chromeDriverPath = "/usr/bin/chromedriver";



@Given("^open url$")
public void open_url() throws Throwable {
 
	System.setProperty("webdriver.chrome.driver", chromeDriverPath);
	WebDriver driver = new ChromeDriver();
	driver.get("www.google.com");
	System.out.println (driver.getTitle());
} 

@When("^click on something$")
public void click_on_something() throws Throwable {
	System.out.println ("IN WHEN");
}

@Then("^something happens$")
public void something_happens() throws Throwable {
	System.out.println ("IN THEN ");

}
	
}
