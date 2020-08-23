package ExcelReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingDemo {
	
	static File file = null;
	
	static FileInputStream fis = null;
	
	static XSSFWorkbook workbook = null;
	
	static XSSFSheet sheet = null;

	public static void main(String[] args) throws IOException {


		 file = new File("C:\\Users\\akhilesg\\Desktop\\Syllbus\\TestData.xlsx");
		
		 fis = new FileInputStream(file);
		
		 workbook = new XSSFWorkbook(fis);
		
		 sheet = workbook.getSheet("LoginData");
		
		int totalRows = sheet.getLastRowNum();
		
		for(int i=1;i<=totalRows;i++){
		
		XSSFRow row = sheet.getRow(i);
		
		for(int j=0;j<2;j++){
		
		XSSFCell cell = row.getCell(j);
		
		System.out.print(cell.getStringCellValue()+"    ");
		}
		
		System.out.println();
		}

	}
	
	public void addSheetIntoWorkbook(){
		
		
		
	}
	
   public void updateValueWorkbook(){
	   
	   
		
	}
   
   public int totalRowCount(){
	   
	   int totalRows = sheet.getLastRowNum();
	   
	   return totalRows;
	   
   }
   
   public void totalColumnCount(){
	   
   }

}
