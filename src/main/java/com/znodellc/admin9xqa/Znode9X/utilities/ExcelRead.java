package com.znodellc.admin9xqa.Znode9X.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelRead {
@DataProvider(name="hybridData")
	
	public static Object[][] StepsFeed() throws Exception
	{
	
		       Object[][] object = null; 
		       File pro = new File(".//Configuration//config.property");
				FileInputStream fs = new FileInputStream(pro);
				Properties pr = new Properties();
				pr.load(fs);
				String excelFile1 = pr.getProperty("excelToExcute");
//		       File src=new File(".//TestData//ProductAttributes//ProductAttribute(AddNew)TestData.xlsx");
		       File src=new File(excelFile1);
		 
		   // load file
		       FileInputStream fis=new FileInputStream(src);
		 
		   // Load workbook
		       XSSFWorkbook wb=new XSSFWorkbook(fis);
		   
		   // Load sheet- Here we are loading first sheetonly
		       XSSFSheet sh1= wb.getSheetAt(1);
		       int column= sh1.getRow(1).getLastCellNum();
		     
		       int rowCount = sh1.getLastRowNum()-sh1.getFirstRowNum();
		     	object = new Object[rowCount][column];
		     	for (int i = 0; i < rowCount; i++) 
		     	{
		    		//Loop over all the rows
		    		Row row = sh1.getRow(i+1);
		    		//Create a loop to print cell values in a row
		    		for (int j = 0; j < column; j++) 
		    		{
		    			
		    			//Print excel data in console
		    			object[i][j] = row.getCell(j).toString();
		    			
		    		}
				

		     	}
		     	
		     
				return object;
				
				
	}
	public static Object[][] readExcel(String Sheet) throws Exception
	{
		       Object[][] object = null; 
		       File pro = new File(".//configuration//config.property");
				FileInputStream fs = new FileInputStream(pro);
				Properties pr = new Properties();
				pr.load(fs);
				String excelFile1 = pr.getProperty("excelToExcute");
		       //File src=new File(".//TestData/LoginTestData.xlsx");
		        File src=new File(excelFile1);
		 
		   // load file
		       FileInputStream fis=new FileInputStream(src);
		 
		   // Load workbook
		       XSSFWorkbook wb=new XSSFWorkbook(fis);
		   
		   // Load sheet- Here we are loading first sheetonly
		       XSSFSheet sh1= wb.getSheet(Sheet);
		       int column= sh1.getRow(1).getLastCellNum();


		      
		     
		       int rowCount = sh1.getLastRowNum()-sh1.getFirstRowNum();
		     	object = new Object[rowCount][column];
		     	for (int i = 0; i < rowCount; i++) 
		     	{
		    		//Loop over all the rows
		    		Row row = sh1.getRow(i+1);
		    		//Create a loop to print cell values in a row
		    		for (int j = 0; j < column; j++) 
		    		{
		    			//Print excel data in console
		    			object[i][j] = row.getCell(j).toString();
		    			
		    		}
				

		     	}
				return object;
				
				
	}
	

}

