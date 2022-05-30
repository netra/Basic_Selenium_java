package youtubeMukesh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {

	public static void main(String[] args) throws Exception {
		
		File src = new File("/Users/amitmotgi/Desktop/netra.xlsx");
        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 =wb.getSheetAt(0);
		sheet1.getRow(0).createCell(2).setCellValue("pass");
		sheet1.getRow(1).createCell(2).setCellValue("fail");
		sheet1.getRow(3).createCell(2).setCellValue("pass");
		FileOutputStream  fout = new FileOutputStream(src);
		wb.write(fout);
		
		/*String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data from excel is : " + data1);
         */
		// prevent memory leak 
		wb.close();

	}

}
