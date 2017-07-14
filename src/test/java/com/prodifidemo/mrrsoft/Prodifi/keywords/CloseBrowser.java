package com.prodifidemo.mrrsoft.Prodifi.keywords;

import com.prodifidemo.mrrsoft.Prodifi.baseScript.ManageDrivers;

public class CloseBrowser extends ManageDrivers {
	
	public static void closeTheBrowser()
	{
	   driver.quit();
	}

}
