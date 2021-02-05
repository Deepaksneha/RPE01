package seleniumdemo;



import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writeexcel {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\Deepaksneha\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.createSheet("login1");
	Cell cl = sh.createRow(0).createCell(0);
	cl.setCellValue("username");
	sh.getRow(0).createCell(2).setCellValue("password");
	
	FileOutputStream fio = new FileOutputStream("C:\\Users\\Deepaksneha\\Desktop\\New Microsoft Excel Worksheet.xlsx");
	wb.write(fio);
	System.out.println("done");
	wb.close();
	}

}
