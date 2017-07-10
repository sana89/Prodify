package com.znodellc.admin9xqa.Znode9X.executor;

import com.znodellc.admin9xqa.Znode9X.baseScript.ManageDrivers;
import com.znodellc.admin9xqa.Znode9X.keywords.Action;
import com.znodellc.admin9xqa.Znode9X.keywords.AssertPageTitle;
import com.znodellc.admin9xqa.Znode9X.keywords.Assertion;
import com.znodellc.admin9xqa.Znode9X.keywords.Calender;
import com.znodellc.admin9xqa.Znode9X.keywords.ClearTextBox;
import com.znodellc.admin9xqa.Znode9X.keywords.Click;
import com.znodellc.admin9xqa.Znode9X.keywords.CloseBrowser;
import com.znodellc.admin9xqa.Znode9X.keywords.DropDown;
import com.znodellc.admin9xqa.Znode9X.keywords.IsDisplayed;
import com.znodellc.admin9xqa.Znode9X.keywords.PopUps;
import com.znodellc.admin9xqa.Znode9X.keywords.RepeatedLocators;
import com.znodellc.admin9xqa.Znode9X.keywords.SelectOneOfMultipleElements;
import com.znodellc.admin9xqa.Znode9X.keywords.SendKeys;

public class ExecuteKeywords {
	
	public static void ExecuteTheKeywords(String testCase, String stepNumber,String testStep, String keyword, String Locator, String TestData1,String TestData2,String TestData3,String TestData4,String Status) throws Exception
	{
		System.out.println("Executing step "+"-----"+testCase+"----"+stepNumber +"------"+testStep+"-----------");
        
		
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
			
		case "SelectOneOfMultipleElements":
			SelectOneOfMultipleElements.selectLocator();
			break;
			
		case "ClearTextBox":
			ClearTextBox.deleteTextBox(Locator);
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
