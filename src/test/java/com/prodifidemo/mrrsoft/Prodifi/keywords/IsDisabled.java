package com.prodifidemo.mrrsoft.Prodifi.keywords;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.prodifidemo.mrrsoft.Prodifi.baseScript.ManageDrivers;
import com.prodifidemo.mrrsoft.Prodifi.baseScript.PropertiesFile;
import com.prodifidemo.mrrsoft.Prodifi.utilities.ConvertDataType;
import com.prodifidemo.mrrsoft.Prodifi.utilities.ExcelWrite;

public class IsDisabled extends ManageDrivers {
	
	public static void fieldIsDisabled(String step, String locator, String testData1) throws Exception
	{
		
	
		int stepNo = ConvertDataType.getNumber(step);
		
		System.out.println(stepNo);
		//stepNo = stepNo+2;
		
		WebElement element = PropertiesFile.getLocator(locator);
		
		boolean result = element.isEnabled();
		System.out.println(result);
		
			Assert.assertFalse(result);
			
			if(result == false)
			{
				ExcelWrite.WriteTheExcel(testData1+" is disabled", stepNo, 9);
				ExcelWrite.WriteTheExcel( "Pass", stepNo, 10);
			}
			
			else
			{
				ExcelWrite.WriteTheExcel(testData1+" is enabled", stepNo, 9);
				ExcelWrite.WriteTheExcel( "Fail", stepNo, 10);
			}
			
		
			
		
		
		
	}

}
