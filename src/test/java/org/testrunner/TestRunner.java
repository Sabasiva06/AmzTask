package org.testrunner;

import org.functional.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources" }, glue = {
		"org.stepdef" }, dryRun = false, monochrome = true, plugin = { "pretty",
				"json:C:\\Users\\vels\\eclipse-workspace\\AmazonTask\\target\\Amazon.json",
				"html:C:\\Users\\vels\\eclipse-workspace\\AmazonTask\\target" })

public class TestRunner {

	@AfterClass
	public static void reportGeneration() {
		JVMReport.generateJVMReport("C:\\\\Users\\\\vels\\\\eclipse-workspace\\\\AmazonTask\\\\target\\Amazon.json");

	}
}
