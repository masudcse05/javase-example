package com.mhaque.reporting.jasper;


import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;

public class SubReportWithDataSource {

	public static void main(String[] args) {
		try {

			InputStream in = FirstReport.class.getResourceAsStream("/StudentWithSub.jrxml");
			Subject subject1 = new Subject("Java", 80);
			Subject subject2 = new Subject("MySQL", 70);
			Subject subject3 = new Subject("PHP", 50);
			Subject subject4 = new Subject("MongoDB", 40);
			Subject subject5 = new Subject("C++", 60);
			
			List<Subject> list = new ArrayList<Subject>();
			list.add(subject1);
			list.add(subject2);
			list.add(subject3);
			list.add(subject4);
			list.add(subject5);
			
			JRBeanCollectionDataSource dataSource = 
					new JRBeanCollectionDataSource(list);
			
			JRBeanCollectionDataSource chartDataSource = 
					new JRBeanCollectionDataSource(list);
			
			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("studentName", "John");
			parameters.put("tableData", dataSource);
			parameters.put("subReport", getSubReport());
			parameters.put("subDataSource", getSubDataSource());
			parameters.put("subParameters", getSubParameters());
			JasperReport report = JasperCompileManager.compileReport(in);
			
			JasperPrint print = 
					JasperFillManager.fillReport(report, parameters, chartDataSource);
			
			JasperExportManager.exportReportToPdfFile(print, "D:\\Jasper-Reports\\studentWithSub.pdf");
			
			System.out.println("Report Created...");
			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception while creating report");
		}
	}
	
	public static JasperReport getSubReport () {

		InputStream in = FirstReport.class.getResourceAsStream("/FirstReport.jrxml");
		
		JasperReport report;
		try {
			report = JasperCompileManager.compileReport(in);
			return report;
		} catch (JRException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static JRBeanCollectionDataSource getSubDataSource () {
		Student student1 = new Student(1L, "Raj", "Joshi", "Happy Street",
				"Delhi");
		
		Student student2 = new Student(2L, "Peter", "Smith", "Any Street",
				"Mumbai");
		
		List<Student> list = new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		
		JRBeanCollectionDataSource dataSource = 
				new JRBeanCollectionDataSource(list);
		
		return dataSource;
	}
	
	public static Map<String, Object> getSubParameters(){
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("studentName", "Manha");
		return parameters;
	}
}
