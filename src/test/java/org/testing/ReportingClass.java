package org.testing;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClass {

	public static void generateReport(String json) {
		
		File f = new File("C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\Cucumber6PmDecember\\target");
		
		Configuration con = new Configuration(f, "Facebook report");
		
		con.addClassifications("mobile", "testing");
		
		List<String> li = new ArrayList<String>();
		
		li.add(json);
		
		ReportBuilder builder = new ReportBuilder(li, con);
		
		
		builder.generateReports();
		
		
		
		
	}
	
	
}
