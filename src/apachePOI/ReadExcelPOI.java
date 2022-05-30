package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 

public class ReadExcelPOI {

	public static void main(String[] args) throws Exception {
		
		File src = new File("/Users/amitmotgi/Desktop/connectedIO.xlsx");
        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 =wb.getSheetAt(0);
		String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println("Data from excel is : " + data1);
	
		// prevent memory leek 
		wb.close();
	}

}
