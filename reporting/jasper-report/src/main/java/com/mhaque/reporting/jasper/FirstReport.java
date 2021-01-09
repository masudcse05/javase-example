package com.mhaque.reporting.jasper;

import java.awt.Color;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRElement;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class FirstReport {

	public static void main(String[] args) {
		
		try {
			Map<String, Object> parameters = new HashMap<>();
			parameters.put("studentName", "John");
			
			Student student1 = new Student(1L, "Raj", "Joshi", "Happy Street",
					"Delhi");
			
			Student student2 = new Student(2L, "Peter", "Smith", "Any Street",
					"Mumbai");
			
			List<Student> list = new ArrayList<Student>();
			list.add(student1);
			list.add(student2);
			
			JRBeanCollectionDataSource dataSource = 
					new JRBeanCollectionDataSource(list);
			
			InputStream in = FirstReport.class.getResourceAsStream("/FirstReport.jrxml");
			
			JasperReport report = JasperCompileManager.compileReport(in);
			
			JRElement studentNameField = report.getTitle().getElementByKey("name");
			studentNameField.setForecolor(Color.RED);
			
			JasperPrint print = 
					JasperFillManager.fillReport(report, parameters, dataSource);

			JasperExportManager.exportReportToPdfFile(print, "D:\\Jasper-Reports\\FirstReport.pdf");
			JasperExportManager.exportReportToHtmlFile(print,  "D:\\Jasper-Reports\\FirstReport.html");
			
			System.out.println("Report Created...");
			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception while creating report");
		}
	}
}
