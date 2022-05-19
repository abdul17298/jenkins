package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\HP\\eclipse-workspace\\"
		+ "CucumberJenkins\\src\\test\\resources\\Feature"
		+ "\\cucumber.feature",glue="org.Stepdef",monochrome=true,plugin= {"pretty","json:C:\\Users\\HP\\eclipse-workspace\\CucumberJenkins"
				+ "\\src\\test\\resources\\Feature\\output.json"})

public class TestRunner {
	@AfterClass
	public static void Genrep() {
		Report.genrep("C:\\Users\\HP\\eclipse-workspace\\CucumberJenkins\\src\\"
				+ "test\\resources\\Feature\\output.json");

	}
	
	

}
