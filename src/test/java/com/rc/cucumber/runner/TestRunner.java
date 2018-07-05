package com.rc.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/rc/cucumber/feature",
		glue="com.rc.cucumber.stepdefinition",
		tags= {"@StepArgument"},
				plugin= {"pretty","json:jsonresults/cucumber_json.json","html:html-reports/htmlcucumber_.html"}
		)
public class TestRunner {

}
