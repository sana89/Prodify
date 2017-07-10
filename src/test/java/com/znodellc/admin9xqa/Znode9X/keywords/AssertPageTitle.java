package com.znodellc.admin9xqa.Znode9X.keywords;

import org.testng.Assert;

import com.znodellc.admin9xqa.Znode9X.baseScript.ManageDrivers;
import com.znodellc.admin9xqa.Znode9X.utilities.ConvertDataType;
import com.znodellc.admin9xqa.Znode9X.utilities.ExcelWrite;

public class AssertPageTitle extends ManageDrivers {
	
	public static void comparePageTitle(String step, String testdata1) throws Exception
	{
		int stepNo = ConvertDataType.getNumber(step);
		String title = driver.getTitle();
		ExcelWrite.WriteTheExcel(title, stepNo, 8);
		
		try
		{
			Assert.assertEquals(testdata1, title);
			ExcelWrite.WriteTheExcel( "Pass", stepNo, 9);
		}
		catch(AssertionError er)
		{
			ExcelWrite.WriteTheExcel( "Fail", stepNo, 9);
		}
	}

}
