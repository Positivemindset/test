package test;
import com.cucumber.listener.ExtentCucumberFormatter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


@RunWith(Cucumber.class)
@CucumberOptions(

        glue = {"src/test"},
        features = {"."},

        tags = {"@testfeature"},


        plugin = {"com.cucumber.listener.ExtentCucumberFormatter","html:target/cucumber-html-report1","rerun:target/rerunMX1.txt"})
  public class  DefaultRunner {

   
  }



