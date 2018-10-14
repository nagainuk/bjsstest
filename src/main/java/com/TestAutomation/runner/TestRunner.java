package com.TestAutomation.runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="D:/SeleniumPrograms/BJSSTest/src/main/java/com/TestAutomation/feature/Happypath.feature",
		glue={"com/TestAutomation/stepdefinations"},
				
		monochrome=true,
		strict=true,
		dryRun=false
		)
	

public class TestRunner
{

}


