package com.prodifidemo.mrrsoft.Prodifi.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.prodifidemo.mrrsoft.Prodifi.baseScript.ManageDrivers;
import com.prodifidemo.mrrsoft.Prodifi.baseScript.PropertiesFile;
import com.prodifidemo.mrrsoft.Prodifi.utilities.ConvertDataType;
import com.prodifidemo.mrrsoft.Prodifi.utilities.ExcelWrite;

public class ToolTipAssertion extends ManageDrivers {
	
	
	public static void toolTipMessage(String step, String locator1, String locator2, String testdata1) throws Exception
	{

		//Convert String step into number
		int stepNumber = ConvertDataType.getNumber(step);
		
		int stepNo = stepNumber + 1;
		
		System.out.println(stepNo);
		Thread.sleep(3000);
		
		// Create action class object
		Actions action = new Actions(driver);
		
		// Find the tooltip xpath
		 WebElement tooltip = PropertiesFile.getLocator(locator1);
		 
		// Mouse hover to that text message
		 action.moveToElement(tooltip).perform();
		 
		 //Find the tooltip message xpath
		 WebElement msg =PropertiesFile.getLocator(locator2);
		 
		// Extract text from tooltip
		 String tooltip_msg = msg.getAttribute("data-tooltip");
		 
		 //Write the tooltip message back to excel
		 ExcelWrite.WriteTheExcel(tooltip_msg, stepNo, 9);
			
		 System.out.println(tooltip_msg);
			
		 System.out.println(testdata1);
			
		 try
		 {
			 //Compare expected result and actual result
			 Assert.assertEquals(testdata1, tooltip_msg);
			 
			 //If expected and actual result are same then give the status Pass
			 ExcelWrite.WriteTheExcel( "Pass", stepNo, 10);
			 
		 }
		 catch(AssertionError er)
		 {
			//If expected and actual result are same then give the status Fail
			 ExcelWrite.WriteTheExcel( "Fail", stepNo, 10);
			 
		 }
		
	}

}
