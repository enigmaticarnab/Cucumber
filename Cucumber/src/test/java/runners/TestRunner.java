package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
features = "resources/functionalTests",
glue= {"stepDefinitions"}
)
public class TestRunner {

}
