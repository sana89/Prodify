package com.prodifidemo.mrrsoft.Prodifi.keywords;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.prodifidemo.mrrsoft.Prodifi.baseScript.PropertiesFile;
import com.prodifidemo.mrrsoft.Prodifi.utilities.ConvertDataType;
import com.prodifidemo.mrrsoft.Prodifi.utilities.ExcelWrite;

public class AssertionInList extends PropertiesFile {
	
	public static void Assert(String step, String data) throws Exception
	{
		System.out.println(1);
		int stepNo = ConvertDataType.getNumber(step);
		System.out.println(stepNo);
		
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//*[(text()='"+data+""+"')]"));
		Boolean result = element.isDisplayed();
		System.out.println(result);
		if(result==true)
		{
//		Thread.sleep(3000);
//		List<WebElement> elementName = driver.findElements(By.xpath("//div[@class='organization-name']"));
			
		// WebElement elementName = driver.findElement(By.xpath("//*[contains(text(),'"+data+"')]"));
		 
		// WebElement res = handleStaleElement("//*[contains(text(),'"+data+"')]");
		 
		// System.out.println(res.getText());
			
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
			
		 
		 
//		     for(WebElement name : elementName)
//		     {
//		    	 System.out.println(name.getText());
//		     }
//		    	 if(name.getText().equalsIgnoreCase("Fgh"))
//		    	
//		 		{
//		 			System.out.println(name.getText());
//		 			ExcelWrite.WriteTheExcel( "Pass", stepNo, 10);
//		 			break;
//		 		}
		 
//		    	 if(actRes.equalsIgnoreCase("Business Analyst"))
//		    	 {
//		    		 actRes = name.getText();
//		    		
//		    		 Assert.assertEquals(testdata1, actRes);
//		    		
//		    		 ExcelWrite.WriteTheExcel(actRes, stepNo, 9);
//		    		 System.out.println(actRes);
//		 			 System.out.println(testdata1);
//		    		 ExcelWrite.WriteTheExcel( "Pass", stepNo, 10);
//		    		 break;
		    		 
//		    		 System.out.println(name.getText());
//		    	 }
		    	 
		    	
		    			 
		    		 
		
//		     else
//		     {
//		    	 System.out.println("Element doesn't exist");
//		     }
		    			    	 
		     
		  //   Assert.assertEquals(testdata1, actRes);
			 
// public static void handleStaleElement() {
//	  int count = 0;
//	  //It will try 4 times to find same element using name.
//	  while (count < 4) {
//	   try {
//	    //If exception generated that means It Is not able to find element then catch block will handle It.
//	    WebElement staledElement = driver.findElement(By.xpath("//*[contains(text(),'"+data+"')]"));
//	    //If exception not generated that means element found and element text get cleared.
//	    staledElement.getText();    
//	   } catch (StaleElementReferenceException e) {
//	    e.toString();
//	    System.out.println("Trying to recover from a stale element :" + e.getMessage());
//	    count = count + 1;
//	   }
//	   count = count + 4;
//	  }
	
	 
		
 
	   
	


