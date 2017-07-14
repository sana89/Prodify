package com.prodifidemo.mrrsoft.Prodifi.executor;

import com.prodifidemo.mrrsoft.Prodifi.baseScript.ManageDrivers;
import com.prodifidemo.mrrsoft.Prodifi.keywords.Action;
import com.prodifidemo.mrrsoft.Prodifi.keywords.AssertPageTitle;
import com.prodifidemo.mrrsoft.Prodifi.keywords.Assertion;
import com.prodifidemo.mrrsoft.Prodifi.keywords.AssertionInList;
import com.prodifidemo.mrrsoft.Prodifi.keywords.Calender;
import com.prodifidemo.mrrsoft.Prodifi.keywords.ClearTextBox;
import com.prodifidemo.mrrsoft.Prodifi.keywords.Click;
import com.prodifidemo.mrrsoft.Prodifi.keywords.CloseBrowser;
import com.prodifidemo.mrrsoft.Prodifi.keywords.DropDown;
import com.prodifidemo.mrrsoft.Prodifi.keywords.IsDisplayed;
import com.prodifidemo.mrrsoft.Prodifi.keywords.Login;
import com.prodifidemo.mrrsoft.Prodifi.keywords.PopUps;
import com.prodifidemo.mrrsoft.Prodifi.keywords.RepeatedLocators;

import com.prodifidemo.mrrsoft.Prodifi.keywords.SendKeys;

public class ExecuteKeywords {
	
	public static void ExecuteTheKeywords(String testCase, String stepNumber, String testCaseName, String testStep, String keyword, String Locator, String TestData1,String TestData2,String TestData3,String TestData4,String Status) throws Exception
	{
		System.out.println("Executing step "+"-----"+testCase+"----"+stepNumber +"------"+testCaseName+"------"+testStep+"-----------");
        
		
		switch(keyword)
		{
		
		case "LaunchBrowser":
			ManageDrivers.OpenUrl(TestData2, TestData1, TestData3, TestData4);
			break;
			
		case "CloseBrowser":
		    CloseBrowser.closeTheBrowser();
		    break;
			
		case "SendKeys":
		    SendKeys.sendText(Locator,TestData1);
		    break;
		    
		
		case "Click":
		   Click.clickAction(Locator);
		    break;	
		    
		   
		case "Assertion":
		    Assertion.validateSuccesMsg(stepNumber, Locator, TestData1);
		    break;
		    
		case "AssertPageTitle":
			AssertPageTitle.comparePageTitle(stepNumber, TestData1);
		    
		
		case "DropDown":
			DropDown.handleDropDown(Locator, TestData1);
			break;
			
		case "Action":
			Action.mouseHoverAction(Locator);
			break;
		  
		case "Calender":
			Calender.selectDate(TestData1, Locator);
			break;
		
		case "PopUps":
			PopUps.acceptPopUps();
			break;
			
		case "IsDisplayed":
			IsDisplayed.visibleElement(stepNumber, TestData1);
			break;
			
		case "RepeatedLocators":
			RepeatedLocators.clickCheckBox(TestData1);
			break;
			
		case "AssertionInList":
			AssertionInList.Assert(stepNumber, TestData1);
			break;
			
		case "ClearTextBox":
			ClearTextBox.deleteTextBox(Locator);
			break;
			
		case "Login":
			Login.loginToTheApplication();
			
		
		
		    /*
		    
		case "GetText":
		    getText.getTheText(Locator,stepNumber);
		    break;
		    
		case "TakeScreenshot":
		    TakeScreenshot.TakeScrSht(testCase+" "+TestData1);
		    break;
		    
		    
		case "AddPartLine":
			AddLine.AddTheLine(TestData1,TestData2,TestData3);
		    break;
		    
		case "Drag":
			drag.dragit();
		    break;
		    
		case "GetTheMauc":
		    getMauc.gettheMAUC(stepNumber, TestData1, TestData2,TestData4);
		    break;
		    
		case "Wait":
		   Keywords.wait.waitForTime(TestData1);
		    break;
		    
		case "GetFinTransAmt":
			 getFinTransAmt.getFinTransAmount(stepNumber, TestData1, TestData2, TestData3, TestData4, "17");
			    break;
		    */
		    default:
		    	System.out.println("Invalid step");
		    	
		    	
			
		    	
	
		}
	}

}
