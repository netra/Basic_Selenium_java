package youtubeMukesh;

import java.io.File;
//import java.io.IOException;

import jxl.Workbook;
//import jxl.read.biff.BiffException;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		 
		File src = new File("/Users/amitmotgi/Desktop/connectedIO_inventory_list.xls");
		System.out.println("Excel Located");
		
		Workbook wb = Workbook.getWorkbook(src);
		System.out.println("Workbook loaded");
		String data00 = wb.getSheet(0).getCell(1,1).getContents();
        System.out.println("Data is : " + data00);

	}

}
