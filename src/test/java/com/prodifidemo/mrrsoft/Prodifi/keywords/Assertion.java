package com.prodifidemo.mrrsoft.Prodifi.keywords;

import org.testng.Assert;

import com.prodifidemo.mrrsoft.Prodifi.baseScript.PropertiesFile;
import com.prodifidemo.mrrsoft.Prodifi.utilities.ConvertDataType;
import com.prodifidemo.mrrsoft.Prodifi.utilities.ExcelWrite;

public class Assertion {
	
	public static void validateSuccesMsg(String step, String locator, String testdata1 ) throws Exception
	{
		int stepNo = ConvertDataType.getNumber(step);
		
		
		System.out.println(stepNo);
		Thread.sleep(3000);
		
		String actRes = PropertiesFile.getLocator(locator).getText();
		ExcelWrite.WriteTheExcel(actRes, stepNo, 9);
		System.out.println(actRes);
		System.out.println(testdata1);
		try
		{
			Assert.assertEquals(testdata1, actRes);
			ExcelWrite.WriteTheExcel( "Pass", stepNo, 10);
		}
		catch(AssertionError er)
		{
			ExcelWrite.WriteTheExcel( "Fail", stepNo, 10);
		}
	}

}
