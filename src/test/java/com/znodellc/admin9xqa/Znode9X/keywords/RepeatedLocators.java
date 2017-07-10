package com.znodellc.admin9xqa.Znode9X.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.znodellc.admin9xqa.Znode9X.baseScript.ManageDrivers;

public class RepeatedLocators extends ManageDrivers{

	public static void clickCheckBox(String data) throws InterruptedException
	{
		
		WebElement element = driver.findElement(By.xpath("//*[contains(text(),'"+data+"')]"));
		
		element.click();
		
		
	}
}
