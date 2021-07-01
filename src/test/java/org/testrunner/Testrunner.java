package org.testrunner;

import org.baseclasswork.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.stepdefinition",dryRun=false,monochrome=true,strict=true,

plugin= {"pretty",
"html:src\\test\\resources\\Reports",		
"json:src\\test\\resources\\Reports\\output.json",
"junit:src\\test\\resources\\Reports\\fb.xml",
"rerun:src\\test\\resources\\Failure\\failedscenarios.txt"
})



public class Testrunner {
	@AfterClass
	public static void jvmReportGeneration() {
		
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\output.json");

	}
}




