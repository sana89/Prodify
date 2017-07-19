package com.prodifidemo.mrrsoft.Prodifi.keywords;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.prodifidemo.mrrsoft.Prodifi.baseScript.PropertiesFile;

public class Tab {
	
	public static void pressTab(String locator) throws Exception
	{
		WebElement webElement = PropertiesFile.getLocator(locator);
		webElement.sendKeys(Keys.TAB);
	}

}
