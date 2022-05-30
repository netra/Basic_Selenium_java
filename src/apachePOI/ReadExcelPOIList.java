package apachePOI;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelPOIList {

	public static void main(String[] args) throws Exception {
		File src = new File("/Users/amitmotgi/Desktop/netra.xlsx");
        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 =wb.getSheetAt(0);
		//String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		int rowCount = sheet1.getLastRowNum();
		System.out.println("Total rows is  " +rowCount+1);
	
		for(int i=0; i<=rowCount; i++){
			String data1=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Test data from excel is "+data1);
			
			//with row number
			System.out.println("Test data from row " +i+ " is " +data1);
		}
		// prevent memory leek 
		wb.close();

	}

}
