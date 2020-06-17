package Parameterization_Singleline;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Sai\\eclipse-workspace\\CucumberSelenium\\src\\test\\java\\Parameterization_Singleline\\SingleParamertization.feature",
glue = "Parameterization_Singleline",
dryRun = false,
monochrome = true)

public class TestRunnerParameterization {

}
