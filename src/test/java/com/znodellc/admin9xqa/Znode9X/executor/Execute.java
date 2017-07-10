package com.znodellc.admin9xqa.Znode9X.executor;

import org.testng.annotations.Test;

import com.znodellc.admin9xqa.Znode9X.utilities.ExcelRead;



public class Execute extends ExcelRead {
	
	@Test
	(dataProvider="hybridData")
	public void getSteps(String testCase, String stepNumber,String testStep, String keyword, String Locator, String TestData1,String TestData2,String TestData3,String TestData4, String Status) throws Exception
	{

    
	 boolean runMode =CheckExecutionMode.CheckTheExecutionMode(testCase);
	 
	 if(runMode == true)
		 ExecuteKeywords.ExecuteTheKeywords(testCase, stepNumber, testStep, keyword, Locator, TestData1, TestData2, TestData3, TestData4, Status);
	 else
		 System.out.println("Not running the step");
		

		
	}
}
	
