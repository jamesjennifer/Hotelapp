package org.baseclasswork;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void generateJvmReport(String jsonpath) {
		
		// Mention the target folder location
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\Jvmreports");

		// Add details to report ---configuration
		Configuration con=new Configuration(f, "Facebook web app");
		
		con.addClassifications("platform name", "windows 10");
		con.addClassifications("Browser name","chrome");
		con.addClassifications("Browser version", "89");
		con.addClassifications("sprint number", "23");
		
		//string to list<string> 
		List<String>list=new ArrayList<String>();
		list.add(jsonpath);
		
		//create object for ReportBuilder class--using which call  genaratereports
		//methods
		ReportBuilder r=new ReportBuilder(list, con);
		r.generateReports();
	}
	
	
	
	
}
