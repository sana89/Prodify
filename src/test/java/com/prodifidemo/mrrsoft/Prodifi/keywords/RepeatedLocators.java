package com.prodifidemo.mrrsoft.Prodifi.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.prodifidemo.mrrsoft.Prodifi.baseScript.ManageDrivers;

public class RepeatedLocators extends ManageDrivers{

	public static void clickCheckBox(String data) throws InterruptedException
	{
		
		WebElement element = driver.findElement(By.xpath("//*[contains(text(),'"+data+"')]"));
		
		element.click();
		
		
	}
}
