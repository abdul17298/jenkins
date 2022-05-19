package org.testrunner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {
	
	public static void genrep(String jsonfile) {
		
		File file = new File("C:\\Users\\HP\\eclipse-workspace\\CucumberJenkins"
				+ "\\src\\test\\resources\\cucumber");
		
		Configuration config = new Configuration(file, "instalogin");
		config.addClassifications("os", "windows");
		config.addClassifications("browser", "chrome");
		
		List<String> jsonfiles = new ArrayList<String>();
		jsonfiles.add(jsonfile);
		
		ReportBuilder bulider = new ReportBuilder(jsonfiles, config);
		
		bulider.generateReports();
		
	}
	
}
