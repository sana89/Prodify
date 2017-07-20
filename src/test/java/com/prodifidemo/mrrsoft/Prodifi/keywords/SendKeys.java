package com.prodifidemo.mrrsoft.Prodifi.keywords;

import java.util.concurrent.TimeUnit;

import com.prodifidemo.mrrsoft.Prodifi.baseScript.PropertiesFile;

public class SendKeys extends PropertiesFile{
	
	public static void sendText(String locator, String value) throws Exception
	{
		
		System.out.println(value);
		System.out.println(locator);
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath(locator)).sendKeys(value);
		PropertiesFile.getLocator(locator).sendKeys(value);
		System.out.println("Entered text :"+value);
	}

}


