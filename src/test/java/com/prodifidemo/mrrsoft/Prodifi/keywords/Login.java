package com.prodifidemo.mrrsoft.Prodifi.keywords;

import com.prodifidemo.mrrsoft.Prodifi.baseScript.ManageDrivers;
import com.prodifidemo.mrrsoft.Prodifi.baseScript.PropertiesFile;

public class Login {
	
	public static void loginToTheApplication() throws Exception
	{
	ManageDrivers.OpenUrl("Chrome","http://prodifitest.mrrsoft.com:8081");
	SendKeys.sendText("Prodifi.rolesLandingPage.username","testwe@yopmail.com");
	SendKeys.sendText("Prodifi.rolesLandingPage.password", "123456");
	Click.clickAction("Prodifi.rolesLandingPage.loginIcon");
	}

}
