package demo;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class readdata {
	@DataProvider
	public static String[][] demo() throws Exception {
	String[][] str;
	FileInputStream fis = new FileInputStream("C:\\Users\\Deepaksneha\\Desktop\\selenium\\selenium.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("Sheet1");
	int rowcount = sh.getPhysicalNumberOfRows();
    Row FirstRow = sh.getRow(0);
    str= new String[rowcount][FirstRow.getLastCellNum()];
    for(int i = 0;i<=rowcount; i++) {
    	for(int j = 0;j<FirstRow.getLastCellNum();j++) {
    		str[i][j]=sh.getRow(i).getCell(j).toString();
    		
    	}
    }
    return str;
    
}
	@Test(dataProvider="demo")
	public void tc (String user,String pass) {
		Reporter.log(user+"  "+pass,true);
	}
}
