package com.znodellc.admin9xqa.Znode9X.keywords;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.znodellc.admin9xqa.Znode9X.baseScript.PropertiesFile;

public class Calender extends PropertiesFile {
	
	public static void selectDate(String inputDate, String locator) throws Exception
	{
//		 Date d = new Date(inputDate);
//		 SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM/dd/yyyy");
//		 String date = dateFormat.format(d);
		WebElement cal = PropertiesFile.getLocator(locator);
		cal.click();
		
		 
		 String[] split = inputDate.split(" ");
		 
		 String month = split[1]+" "+split[2];
		 String Date1 = split[0];
		 
		 
		 for(int i=0;i<=30;i++)
		 {
			 WebElement monthElem = driver.findElement(By.xpath("(.//*[@class='datepicker-switch'])[1]"));
			 if(monthElem.getText().contains(month))
			 {
				 System.out.println("Month found "+month);
			     List<WebElement> dateElem = driver.findElements(By.xpath(".//*[@id='ProductAttribute']/div[6]/div[1]/table/tbody/tr/td"));
			     for(WebElement dElem : dateElem)
			     {
			  
			    	 if(dElem.getText().equals(Date1))
			    	 {
			    		
			    		 dElem.click();
			    		
			    		 break;
			    	 }
			    	 
			     }
				 
				 break;
				 
			 }
			 else
			 {
				System.out.println("Not found " +month);
				 driver.findElement(By.xpath("(.//*[@class='next'])[1]")).click();
			 }
			 
		 }
	
		 
//		 while(true){
//			 try
//			 {
//				 driver.findElement(By.xpath("//*[contains(text(),'"+month+"')]")).isDisplayed();
//				 String firstPart = ".//*[@id='ProductAttribute']";
//				 String secondPart = "']/div";
//				 String[] splitDate = inputDate.split("/");
//				 String finalPart = firstPart+splitDate[0]+"_"+splitDate[2]+secondPart;
//				 driver.findElement(By.xpath(finalPart)).click();
//				 break;
//				 
//			 }
//			 catch(Exception e)
//			 {
//				 driver.findElement(By.xpath("//th[@class='next']"));
//			 }
		 
	}

}
