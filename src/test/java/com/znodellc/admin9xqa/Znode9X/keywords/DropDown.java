package com.znodellc.admin9xqa.Znode9X.keywords;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.znodellc.admin9xqa.Znode9X.baseScript.PropertiesFile;

public class DropDown extends PropertiesFile {
	
	public static void handleDropDown(String locator, String Value) throws Exception
	{
		Thread.sleep(2000);
		WebElement value = PropertiesFile.getLocator(locator);
		
		Select option = new Select(value);
		
		option.selectByVisibleText(Value);
	}

}
