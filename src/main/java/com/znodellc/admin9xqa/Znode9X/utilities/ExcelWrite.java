package com.znodellc.admin9xqa.Znode9X.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void WriteTheExcel(String data, int row, int cell) throws IOException
	{
		File pro = new File(".//Configuration//config.property");
		FileInputStream fs = new FileInputStream(pro);
		Properties pr = new Properties();
		pr.load(fs);
		String excelFile1 = pr.getProperty("excelToExcute");
		File src=new File(excelFile1);

		 
		   // load file
		       FileInputStream fis=new FileInputStream(src);
		 
		   // Load workbook
		       XSSFWorkbook wb=new XSSFWorkbook(fis);
		   
		   // Load sheet- Here we are loading first sheetonly
		       XSSFSheet sh1= wb.getSheetAt(1);
		       
		       sh1.getRow(row).getCell(cell).setCellValue(data);
		       
		      
		       fis.close();
				
				FileOutputStream outFile =new FileOutputStream(src);
				wb.write(outFile);
				outFile.close();
		       
	}
}
 