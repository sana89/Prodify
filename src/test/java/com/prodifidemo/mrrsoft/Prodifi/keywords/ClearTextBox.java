package com.prodifidemo.mrrsoft.Prodifi.keywords;

import java.util.concurrent.TimeUnit;

import com.prodifidemo.mrrsoft.Prodifi.baseScript.PropertiesFile;

public class ClearTextBox extends PropertiesFile {
	
	public static void deleteTextBox(String locator) throws Exception
	{
        System.out.println("locator in clear method:"+locator);
		
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//i[@class='z-nav-menu']")).click();
		getLocator(locator).clear();
	}

}
