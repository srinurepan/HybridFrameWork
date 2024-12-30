package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException {
		
		String path=".\\testData\\openkart.xlsx"; // taking xl file from testData folder
		          //or
//	   String path=(System.getProperty("user.dir")+"\\testData\\openkart.xlsx");	
		
		ExcelUtility xlutil=new ExcelUtility(path); //creating object for ExcelUtils cls
		
		int totalrows=xlutil.getRowCount("Sheet1");
		int totalcols=xlutil.getCellCount("Sheet1",1); //1 mean starts  1st row count
		
		
		String loginData[][]=new String[totalrows][totalcols]; //created for two dimensional array which can store
		
		for(int i=1;i<=totalrows;i++) {  //0 we should not taken bcoz its headerpart in excel[names]            //1 //read data from xl storing in two dimensional array
			
			for(int j=0;j<totalcols;j++) {     //0  // i means is rows  & j means colums
				
		loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);  //1,0 [excel data stored into Two dimensional array]
		
			}
			
	}
		return loginData;  //returning two dimensional array
		
		
	}
	

	
	//if we are more dataproviders use similarly  above type
		
		 // DataProvider 2
	   
	
	    // DataProvider 3
	
	    // DataProvider 4

}
