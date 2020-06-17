package ScenarioOutlineExample;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\Sai\\eclipse-workspace\\CucumberSelenium\\src\\test\\java\\ScenarioOutlineExample\\ScenarioOutlineExample.feature"},
glue = "ScenarioOutlineExample")

public class RunnerClass {
	
}
