package com.prodifidemo.mrrsoft.Prodifi.executor;

import com.prodifidemo.mrrsoft.Prodifi.utilities.ExcelRead;

public class CheckExecutionMode {
	public static boolean CheckTheExecutionMode(String TestStep) throws Exception
	{
		
		boolean mode = false;
		Object[][] getTestSuite = ExcelRead.readExcel("TestSuite");
		System.out.println();
		
		  for(int i=0; i<getTestSuite.length;i++)
		    {
		    	for(int j=0; j<3;j++)
		        {
		    		
		        	if(getTestSuite[i][j].equals(TestStep))
		        	{
		        		if(getTestSuite[i][j+1].equals("Y"))
		        		{
		        			mode = true;
		        		    break;
		        		}
		        		if(getTestSuite[i][j+1].equals("N"))
		        		{
		        			mode=false;
		        			break;
		        		}
		        			
		        	}
		        }
		    }
		  return mode;
		
	}
}
