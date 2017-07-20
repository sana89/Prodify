package com.prodifidemo.mrrsoft.Prodifi.keywords;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.prodifidemo.mrrsoft.Prodifi.baseScript.ManageDrivers;
import com.prodifidemo.mrrsoft.Prodifi.baseScript.PropertiesFile;

public class FindInList extends ManageDrivers {

	
	public static void verifyListPage(String locator1, String testData) throws Exception
	{
		List<WebElement> roles = driver.findElements(By.xpath("//*[@class='organization-name']"));
	    int count =1;
	    int x = 0;
	    
	    for(WebElement rolesName : roles)
	    {
	    	if(rolesName.getText().equals(testData))
	    	{
	    		x=count;
	    		System.out.println(rolesName.getText());
	    	}
	    	else
	    		count++;
	    }
	    System.out.println("count is "+x);
	    Thread.sleep(2000);
	    
	   driver.findElement(By.xpath("(//*[@class='organization-name'])"+"["+x+"]"+"/following::button[1]"));
	}
}
