package com.prodifidemo.mrrsoft.Prodifi.keywords;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.prodifidemo.mrrsoft.Prodifi.baseScript.PropertiesFile;

public class Action extends PropertiesFile {
	
	public static void mouseHoverAction(String locator) throws Exception
	{
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		WebElement element = PropertiesFile.getLocator(locator);
		action.moveToElement(element).click().build().perform();
		Thread.sleep(5000);
	}

}
