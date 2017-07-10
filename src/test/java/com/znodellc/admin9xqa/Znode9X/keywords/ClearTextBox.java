package com.znodellc.admin9xqa.Znode9X.keywords;

import java.util.concurrent.TimeUnit;

import com.znodellc.admin9xqa.Znode9X.baseScript.PropertiesFile;

public class ClearTextBox extends PropertiesFile {
	
	public static void deleteTextBox(String locator) throws Exception
	{
        System.out.println("locator in clear method:"+locator);
		
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//i[@class='z-nav-menu']")).click();
		getLocator(locator).clear();
	}

}
