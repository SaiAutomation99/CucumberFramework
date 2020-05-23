package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\Sai\\eclipse-workspace\\CucumberSelenium\\src\\test\\resources\\com\\feature\\Tags.feature"}
,glue = {"com.stepdefinition"},tags = {"@Regression"})


//"@smoke,@sanity"   or condition
//"@smoke","@sanity"   and condition

public class TestRunner1 {
	

	
}
