package com.znodellc.admin9xqa.Znode9X.keywords;

import com.znodellc.admin9xqa.Znode9X.baseScript.ManageDrivers;

public class CloseBrowser extends ManageDrivers {
	
	public static void closeTheBrowser()
	{
	   driver.quit();
	}

}
