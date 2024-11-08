package com.generic;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	
@CucumberOptions(
plugin = {"json:target/cucumber.json"},
features = {"./src/main/resources/LoginTest.feature"},
glue = {"com.regression"},
tags = {"@Smoke"},
dryRun = false,
strict  = true,
monochrome = true
)	
public class Runner extends AbstractTestNGCucumberTests {
}
