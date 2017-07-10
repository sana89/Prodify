package com.znodellc.admin9xqa.Znode9X.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.znodellc.admin9xqa.Znode9X.baseScript.PropertiesFile;
import com.znodellc.admin9xqa.Znode9X.utilities.ConvertDataType;
import com.znodellc.admin9xqa.Znode9X.utilities.ExcelWrite;

public class IsDisplayed extends PropertiesFile {
	
	public static void visibleElement(String step, String data) throws Exception
	{
		int stepNo = ConvertDataType.getNumber(step);
		System.out.println(stepNo);
		//WebElement element = PropertiesFile.getLocator(locator);
		WebElement element = driver.findElement(By.xpath("//*[contains(text(),'"+data+"')]"));
		Boolean result = element.isDisplayed();
		System.out.println(result);
		
		
		if(result==true)
		{
		String actRes = element.getText();
		System.out.println(actRes);
		ExcelWrite.WriteTheExcel(actRes, stepNo, 8);
		System.out.println(actRes);
		}
		else
		{
			System.out.println("Element is not Visible");
		}
		
		try
		{
			System.out.println(result);
			Assert.assertTrue(result);
			ExcelWrite.WriteTheExcel( "Pass", stepNo, 9);
		}
		catch(AssertionError er)
		{
			ExcelWrite.WriteTheExcel( "Fail", stepNo, 9);
		}
		
	}

}
