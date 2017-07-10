package com.znodellc.admin9xqa.Znode9X.keywords;

import org.testng.Assert;

import com.znodellc.admin9xqa.Znode9X.baseScript.PropertiesFile;
import com.znodellc.admin9xqa.Znode9X.utilities.ConvertDataType;
import com.znodellc.admin9xqa.Znode9X.utilities.ExcelWrite;

public class Assertion {
	
	public static void validateSuccesMsg(String step, String locator, String testdata1 ) throws Exception
	{
		int stepNo = ConvertDataType.getNumber(step);
		
		
		System.out.println(stepNo);
		Thread.sleep(3000);
		
		String actRes = PropertiesFile.getLocator(locator).getText();
		ExcelWrite.WriteTheExcel(actRes, stepNo, 8);
		System.out.println(actRes);
		System.out.println(testdata1);
		try
		{
			Assert.assertEquals(testdata1, actRes);
			ExcelWrite.WriteTheExcel( "Pass", stepNo, 9);
		}
		catch(AssertionError er)
		{
			ExcelWrite.WriteTheExcel( "Fail", stepNo, 9);
		}
	}

}
