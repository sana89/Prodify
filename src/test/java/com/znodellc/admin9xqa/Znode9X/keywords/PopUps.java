package com.znodellc.admin9xqa.Znode9X.keywords;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.znodellc.admin9xqa.Znode9X.baseScript.PropertiesFile;

public class PopUps extends PropertiesFile {
	
//	public static void confirmPopUp(String locator){
		
//		Thread.sleep(3000);
//		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
//		String subWindowHandler = null;
//
//		Set<String> handles = driver.getWindowHandles(); // get all window handles
//		System.out.println("Total handles "+handles.size());
//		
//		Iterator<String> iterator = handles.iterator();
//		while (iterator.hasNext()){
//		    subWindowHandler = iterator.next();
//		
//		driver.switchTo().window(subWindowHandler); // switch to popup window
//		PropertiesFile.getLocator(locator).click();
//
//		// Now you are in the popup window, perform necessary actions here
//	//	WebElement clickableElement = PropertiesFile.getLocator(locator);
//	
//		}
//		driver.switchTo().window(parentWindowHandler);  // switch back to parent window
		
//	System.out.println("text "+driver.findElement(By.xpath(".//*[@id='NoCheckboxSelected']/div/div/div[2]/p")).getText());
//    driver.findElement(By.xpath("(.//*[@id='btn-cancel-popup'])[2]")).click();
//
//	}
	
	public static void acceptPopUps() throws InterruptedException
	{
		    WebDriverWait wait = new WebDriverWait(driver, 2);
		    wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		
		getTextPopUps();
		
		alert.accept();
		
	}
//	
//	public static void dismissPopUps()
//	{
//		Alert alert = driver.switchTo().alert();
//		
//		alert.dismiss();
//	}
//	
	public static void getTextPopUps()
	{
		Alert alert = driver.switchTo().alert();
		
		String alertMessage = alert.getText();
		
		System.out.println(alertMessage);
	}
	
}
