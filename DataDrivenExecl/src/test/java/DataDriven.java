import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * Identify testcases column by scaning the entire 1st row
		 * once coloum is identified then scan entire testcase coloum to identify purchase testcase row
		 * after you grab purchase testcase to all the data of that row pull all the data and feed into test
		 * 
		 */
		
		
		//File input stream argument
		FileInputStream file =new FileInputStream("E://Selenium file//ExcelDataDriven//GitHub//ExceldataDriven//DataDrivenExecl//DemoData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);  // This work book us use for Excel data driven process
		
		
		int sheets = workbook.getNumberOfSheets();
		for(int i=0; i<sheets; i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("TestData1"))
			{
				XSSFSheet sheet = workbook.getSheetAt(i);
				//Identify testcase coloum by scanning the entire 1st row
				
				Iterator<Row> rows= sheet.iterator();
				Row firstRow = rows.next(); //go to the next row  
				//This is actually the first row
				Iterator<Cell> cell= firstRow.cellIterator();  //
				
				while(cell.hasNext())  //is next cell is present
				{
					Cell CellValue= cell.next();  //grab the cell value
					CellValue.getStringCellValue().equalsIgnoreCase("TestData1"); //compare the cell value with "TestData1"
				}
				
			}
		}
			
		
		
	}

}
