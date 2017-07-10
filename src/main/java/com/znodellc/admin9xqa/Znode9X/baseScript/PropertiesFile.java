package com.znodellc.admin9xqa.Znode9X.baseScript;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PropertiesFile extends ManageDrivers{

	public static Properties Repository = new Properties();
	public static File file;
	public static FileInputStream fileInputStream;
	
	public static void loadPropertiesFile() throws Exception
	{
//		file = new File(System.getProperty("user.dir")+".//pageLibrary/loginPage.properties");
//		fileInputStream = new FileInputStream(file);
//		Repository.load(fileInputStream);
//		
//		file = new File(System.getProperty("user.dir")+".//pageLibrary/PIM/ProductAttributes/Attributes/addNew.properties");
//		fileInputStream = new FileInputStream(file);
//		Repository.load(fileInputStream);
//		
//		file = new File(System.getProperty("user.dir")+".//pageLibrary/PIM/ProductAttributes/Attributes/listPage.properties");
//		fileInputStream = new FileInputStream(file);
//		Repository.load(fileInputStream);
		
//		file = new File(System.getProperty("user.dir")+".//pageLibrary/PIM/ProductAttributes/AttributeGroups/addNew.properties");
//		fileInputStream = new FileInputStream(file);
//		Repository.load(fileInputStream);
		
//		file = new File(System.getProperty("user.dir")+".//pageLibrary//PIM//ProductAttributes//AttributeGroups//listPage.properties");
//		fileInputStream = new FileInputStream(file);
//		Repository.load(fileInputStream);
		
		file = new File(System.getProperty("user.dir")+".//pageLibrary//PIM//ProductAttributes//AttributeFamilies//addNew.properties");
		fileInputStream = new FileInputStream(file);
		Repository.load(fileInputStream);
	}
	
	public static WebElement getLocator(String locator1) throws Exception
	{
		loadPropertiesFile();
		String locator=Repository.getProperty(locator1);
		String locatorType = locator.split("_")[0];
		String locatorValue = locator.split("_")[1];
		
		if(locatorType.toLowerCase().equals("id"))
		{
			return driver.findElement(By.id(locatorValue));
		}
		else if (locatorType.toLowerCase().equals("name"))
		{
			return driver.findElement(By.name(locatorValue));
		}
		else if (locatorType.toLowerCase().equals("classname"))
		{
			return driver.findElement(By.className(locatorValue));
		}
		else if (locatorType.toLowerCase().equals("tagname"))
		{
			return driver.findElement(By.tagName(locatorValue));
		}
		else if (locatorType.toLowerCase().equals("linktext"))
		{
			return driver.findElement(By.linkText(locatorValue));
		}
		else if (locatorType.toLowerCase().equals("partiallinktext"))
		{
			return driver.findElement(By.partialLinkText(locatorValue));
		}
		else if (locatorType.toLowerCase().equals("cssselector"))
		{
			return driver.findElement(By.cssSelector(locatorValue));
		}
		else if (locatorType.toLowerCase().equals("xpath"))
		{
			return driver.findElement(By.xpath(locatorValue));
		}
		else
		{
			throw new Exception("Unknown locator type '" + locatorType + "'" );
		}
	}
	
//	public WebElement getWebElement(String locator) throws Exception
//	{
//		return getLocator(Repository.getProperty(locator));
//	}
}
