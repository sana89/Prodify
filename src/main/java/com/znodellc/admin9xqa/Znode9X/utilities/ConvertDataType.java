package com.znodellc.admin9xqa.Znode9X.utilities;

public class ConvertDataType {
	
	public static int getNumber(String Stepnumber)
	{
	
	char[] y =Stepnumber.toCharArray();
	 
	 String x ="";
	  
	  for(int i=0;i<y.length;i++)
	  {
		  if(y[i]!='.')
		  
			  x=x+y[i];
			  
		  else break;
		  
			    
	  }
	 
	  
	  
	  int b =Integer.parseInt(x);
	  
	return b;
	}


}
