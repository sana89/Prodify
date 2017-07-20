package com.prodifidemo.mrrsoft.Prodifi.executor;

import org.testng.annotations.Test;

import com.prodifidemo.mrrsoft.Prodifi.utilities.ExcelRead;



public class Execute extends ExcelRead {
	
	@Test
	(dataProvider="hybridData")
	public void getSteps(String testCase, String stepNumber,String testCaseName, String testStep, String keyword, String Locator1, String Locator2,String TestData1,String TestData2,String TestData3, String Status) throws Exception
	{

    
	 boolean runMode =CheckExecutionMode.CheckTheExecutionMode(testCase);
	 
	 if(runMode == true)
		 ExecuteKeywords.ExecuteTheKeywords(testCase, stepNumber, testCaseName, testStep, keyword, Locator1, Locator2, TestData1, TestData2, TestData3, Status);
	 else
		 System.out.println("Not running the step");
		

		
	}
}
	
