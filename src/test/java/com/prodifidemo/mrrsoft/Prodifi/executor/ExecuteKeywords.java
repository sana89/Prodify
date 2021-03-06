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
import com.prodifidemo.mrrsoft.Prodifi.keywords.FindInList;
import com.prodifidemo.mrrsoft.Prodifi.keywords.IsDisabled;
import com.prodifidemo.mrrsoft.Prodifi.keywords.IsDisplayed;
import com.prodifidemo.mrrsoft.Prodifi.keywords.Login;
import com.prodifidemo.mrrsoft.Prodifi.keywords.PopUps;
import com.prodifidemo.mrrsoft.Prodifi.keywords.RepeatedLocators;

import com.prodifidemo.mrrsoft.Prodifi.keywords.SendKeys;
import com.prodifidemo.mrrsoft.Prodifi.keywords.Tab;
import com.prodifidemo.mrrsoft.Prodifi.keywords.ToolTipAssertion;

public class ExecuteKeywords {
	
	public static void ExecuteTheKeywords(String testCase, String stepNumber, String testCaseName, String testStep, String keyword, String Locator1, String Locator2,String TestData1,String TestData2,String TestData3,String Status) throws Exception
	{
		System.out.println("Executing step "+"-----"+testCase+"----"+stepNumber +"------"+testCaseName+"------"+testStep+"-----------");
        
		
		switch(keyword)
		{
		
		case "LaunchBrowser":
			ManageDrivers.OpenUrl(TestData2, TestData1);
			break;
			
		case "CloseBrowser":
		    CloseBrowser.closeTheBrowser();
		    break;
			
		case "SendKeys":
		    SendKeys.sendText(Locator1,TestData1);
		    break;
		    
		
		case "Click":
		   Click.clickAction(Locator1);
		    break;	
		    
		   
		case "Assertion":
		    Assertion.validateSuccesMsg(stepNumber, Locator1, TestData1);
		    break;
		    
		case "AssertPageTitle":
			AssertPageTitle.comparePageTitle(stepNumber, TestData1);
		    
		
		case "DropDown":
			DropDown.handleDropDown(Locator1, TestData1);
			break;
			
		case "Action":
			Action.mouseHoverAction(Locator1);
			break;
		  
		case "Calender":
			Calender.selectDate(TestData1, Locator1);
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
			ClearTextBox.deleteTextBox(Locator1);
			break;
			
		case "Login":
			Login.loginToTheApplication();
			
		case "ToolTipAssertion":
			ToolTipAssertion.toolTipMessage(stepNumber, Locator1, Locator2, TestData1);
			break;
			
		case "Tab":
			Tab.pressTab(Locator1);
			break;
			
		case "IsDisabled":
			IsDisabled.fieldIsDisabled(stepNumber, Locator1, TestData1);
			break;
			
		case "FindInList":
			FindInList.verifyListPage(Locator1, TestData1);
			break;
			
		
		
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
