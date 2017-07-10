package com.znodellc.admin9xqa.Znode9X.keywords;

import java.util.concurrent.TimeUnit;

import com.znodellc.admin9xqa.Znode9X.baseScript.PropertiesFile;

public class Click extends PropertiesFile {
	public static void clickAction(String locator) throws Exception
	{
		Thread.sleep(3000);
		System.out.println("locator in click method:"+locator);
		
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//i[@class='z-nav-menu']")).click();
		PropertiesFile.getLocator(locator).click();
	
		
		
	}
}
