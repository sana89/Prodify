package com.prodifidemo.mrrsoft.Prodifi.keywords;

import com.prodifidemo.mrrsoft.Prodifi.baseScript.ManageDrivers;
import com.prodifidemo.mrrsoft.Prodifi.baseScript.PropertiesFile;

public class Login {
	
	public static void loginTheApplication() throws Exception
	{
	ManageDrivers.OpenUrl("Chrome","http://172.17.2.182:8081", "testwe@yopmail.com", "123456");
	SendKeys.sendText("Prodifi.rolesLandingPage.username","testwe@yopmail.com");
	SendKeys.sendText("Prodifi.rolesLandingPage.password", "123456");
	Click.clickAction("Prodifi.rolesLandingPage.loginIcon");
	}

}
