package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features= {"src/test/resources/AppFeatures/UserManagement.feature"},
        glue= {"stepdefinations", "AppHooks"},
       plugin= {"pretty",
    		   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

        },  		
        tags="@sanityTest"
        )





public class PortalRunner {
	
	

}