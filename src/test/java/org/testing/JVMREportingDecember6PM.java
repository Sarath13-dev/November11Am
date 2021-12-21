package org.testing;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMREportingDecember6PM {

	public static void generateReport(String json) {
		
		File f = new File("C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\Cucumber6PmDecember\\target");
		
		Configuration c = new Configuration(f, "FacebookCucumber6PM");
		
		c.addClassifications("Operating system", "Windows");
		c.addClassifications("Testing type", "Regression");
		c.addClassifications("Testing tecnique", "equivalence partitioning");
		c.addClassifications("login", "Username");
		
		List<String> li = new ArrayList<String>();
		li.add(json);
		
		ReportBuilder r = new ReportBuilder(li, c);
		
		r.generateReports();
		
		
	}
	
}
