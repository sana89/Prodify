package com.znodellc.admin9xqa.Znode9X.keywords;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.znodellc.admin9xqa.Znode9X.baseScript.PropertiesFile;

public class DropDownWithCheckbox extends PropertiesFile {
	
	public static void handleDropDown(String locator, String text) throws Exception
	{
		Thread.sleep(2000);
		WebElement value = PropertiesFile.getLocator(locator);
		value.click();
//		System.out.println("Executing this step");
		//System.out.println(driver.findElement(By.xpath(".//*[@id='divExtensions']/div/div[2]/div/ul/li[5]/a/label")).getText());
		
       List<WebElement> dropdown = driver.findElements(By.xpath(".//*[@class='checkbox']"));
       System.out.println(Integer.toString(dropdown.size()));
       for(WebElement ext: dropdown)
       {
//    	   System.out.println("1"+ext.getText());
//    	   System.out.println("2"+text);
    	   if(ext.getText().equals(text))
    	   {
    		   System.out.println("sucess"+ext.getText());
    		   ext.click();
    		   break;
    	   }
    		   
       }
       
	}

}
