package com.znodellc.admin9xqa.Znode9X.keywords;

import java.util.concurrent.TimeUnit;

import com.znodellc.admin9xqa.Znode9X.baseScript.PropertiesFile;

public class SendKeys extends PropertiesFile{
	
	public static void sendText(String locator, String value) throws Exception
	{
		
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		//driver.findElement(By.xpath(locator)).sendKeys(value);
		PropertiesFile.getLocator(locator).sendKeys(value);
	}

}


