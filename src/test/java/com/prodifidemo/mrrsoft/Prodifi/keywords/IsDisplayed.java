package com.prodifidemo.mrrsoft.Prodifi.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.prodifidemo.mrrsoft.Prodifi.baseScript.PropertiesFile;
import com.prodifidemo.mrrsoft.Prodifi.utilities.ConvertDataType;
import com.prodifidemo.mrrsoft.Prodifi.utilities.ExcelWrite;

public class IsDisplayed extends PropertiesFile {
	
	public static void visibleElement(String step, String data) throws Exception
	{
		int stepNo = ConvertDataType.getNumber(step);
		System.out.println(stepNo);
		//WebElement element = PropertiesFile.getLocator(locator);
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//*[contains(text(),'"+data+"')]"));
		Boolean result = element.isDisplayed();
		System.out.println(result);
		
		
		if(result==true)
		{
		String actRes = element.getText();
		System.out.println(actRes);
		ExcelWrite.WriteTheExcel(actRes, stepNo, 9);
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
			ExcelWrite.WriteTheExcel( "Pass", stepNo, 10);
		}
		catch(AssertionError er)
		{
			ExcelWrite.WriteTheExcel( "Fail", stepNo, 10);
		}
		
	}

}
