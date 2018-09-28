package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static Object[][] getExcelData(String filename) throws IOException {
		XSSFWorkbook wbook = new XSSFWorkbook("./data/"+filename+".xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		
		int RowNum = sheet.getLastRowNum();
		System.out.println("lastRowNum=" +RowNum);
		
		int CellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("lastCellNum=" +CellNum);
		
		Object[][] data = new Object[RowNum][CellNum];
		for(int j=1;j<=RowNum;j++)
		{
			XSSFRow row = sheet.getRow(j);
		
		
		for(int i=0;i<CellNum;i++)
		{

			XSSFCell cell = row.getCell(i);
			data[j-1][i]=cell.getStringCellValue();
	}
		
}
		return data;
}
}