package com.znodellc.admin9xqa.Znode9X.baseScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class ManageDrivers {
public static WebDriver driver;
	
	public static WebDriver OpenUrl(String browser,String url, String username, String password) throws Exception
	{
//		File pro = new File(".//configuration//config.property");
//		FileInputStream fs = new FileInputStream(pro);
//		Properties pr = new Properties();
//		pr.load(fs);
//		String username =pr.getProperty("username");
//		String password =pr.getProperty("password");
//		String url =pr.getProperty("url");
		
		
		
		if (browser.equalsIgnoreCase("Chrome"))
		{
			driver =LaunchChrome(url);
		}
		if (browser=="FireFox")
		{
			driver = LaunchFirefox(url,username,password);
		}
		if (browser=="IE")
		{
			driver = LaunchIE(url,username,password);
		}
		
		
		
		
		
		
		return driver;
		
	}

	public static WebDriver LaunchIE(String url,String username, String password) {
		
		
		
		
		return null;
	}

	private static WebDriver LaunchFirefox(String url,String username, String password) {
		WebDriver driver = new FirefoxDriver();
		driver.get(username+":"+password+"@"+url);
		driver.manage().window().maximize();
		return driver;
	}

	private static WebDriver LaunchChrome(String url) {
		
		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.out.println("opening url  "+"https://"+username+":"+password+"@"+url);
		driver.get(url);
//		driver.findElement(By.id("Username")).sendKeys(username);
//		driver.findElement(By.id("btnPassword")).sendKeys(password);
//		driver.findElement(By.xpath("//button[@class='btn-text login-btn']")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		return driver;
	}

	
	public static WebDriver GetDriver()
	{
		return driver;
	}
	
	public void implicitWait(int timeInSec){
		System.out.println("Waiting for page to load...");
		try{
			driver.manage().timeouts().implicitlyWait(timeInSec, TimeUnit.SECONDS);
			System.out.println("Page is loaded");
		}
		catch(Throwable error){
			System.out.println("Timeout for Page Load Request to complete after "+ timeInSec+ " seconds");
			Assert.assertTrue(false, "Timeout for page load request after "+timeInSec+" second");
		}
	}
}
