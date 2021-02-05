package seleniumdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readexcel {

	public static void main(String[] args) throws Exception   {
		FileInputStream fis = new FileInputStream("C:\\Users\\Deepaksneha\\Desktop\\selenium\\selenium.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rowcount = sh.getPhysicalNumberOfRows();
		
		Row firstRow= sh.getRow(0);
		for (int row = 0; row < rowcount; row++) {
			for (int col = 0; col < firstRow.getLastCellNum(); col++) {
				Cell ch= sh.getRow(row).getCell(col);
				System.out.print(ch+"     ");
			}
			System.out.println();
		}

	}

}
