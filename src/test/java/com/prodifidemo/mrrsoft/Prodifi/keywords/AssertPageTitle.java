package com.prodifidemo.mrrsoft.Prodifi.keywords;

import org.testng.Assert;

import com.prodifidemo.mrrsoft.Prodifi.baseScript.ManageDrivers;
import com.prodifidemo.mrrsoft.Prodifi.utilities.ConvertDataType;
import com.prodifidemo.mrrsoft.Prodifi.utilities.ExcelWrite;

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
