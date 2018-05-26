package generalFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFunctions extends Database_Connect{
	public static String Querypath = System.getProperty("user.dir")+"\\src\\test\\resources\\QueryReader.xlsx";
	public static String JsonPath=System.getProperty("user.dir")+"\\src\\test\\resources\\JsonValidator.xlsx";
	public static String QueryWriter = System.getProperty("user.dir")+"\\src\\test\\resources\\QueryWriiter.xlsx";
    public static String JsonWriter = System.getProperty("user.dir")+"\\src\\test\\resources\\JsonWritter.xlsx";
//	File JsonWriter1=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\JsonWritter.xlsx");
	public static FileInputStream fis;
	public static XSSFWorkbook workbook=new XSSFWorkbook();
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;

	public String getJsonValidator(String sheetName,String colName, String rowName) throws Exception {
		fis = new FileInputStream(JsonPath);
		workbook = new XSSFWorkbook(fis);
		try {
			int index = workbook.getSheetIndex(sheetName);
			sheet = workbook.getSheetAt(index);
			XSSFRow row = sheet.getRow(0);
			int rownum=-1;
			int number = sheet.getLastRowNum();
			for(int j=0;j<=number;j++)
			{
				XSSFRow row1=sheet.getRow(j);
				for(int k=0;k<row1.getLastCellNum();k++)
				{
					if(row1.getCell(k).getStringCellValue().trim().equals(rowName))
						break;   
				}
				rownum=j; 
			}
			int colnum =-1;
			for(int i=0;i<row.getLastCellNum();i++)
			{
				if(row.getCell(i).getStringCellValue().trim().equals(colName)) {
					colnum=i;
					break;   
				}
			}
			row = sheet.getRow(rownum);
			XSSFCell cell=row.getCell(colnum);
			String query = String.valueOf(cell.getStringCellValue());
			fis.close();
			return query;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public int getRowCount(String sheetName) {
		try {
			int index = workbook.getSheetIndex(sheetName);
			if (index == -1) {
				return 0;
			} else {
				sheet = workbook.getSheetAt(index);
				int number = sheet.getLastRowNum() + 1;
				return number;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}


	public int getColumnCount(String sheetName) {
		try {
			int index = workbook.getSheetIndex(sheetName);
			if (index == -1) {
				return 0;
			} else {
				sheet = workbook.getSheet(sheetName);
				row = sheet.getRow(0);
				return row.getLastCellNum();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public String getQueryReader(String sheetName,String colName, String testcaseName) throws Exception {
		String query=new String();
		System.out.println();
		fis = new FileInputStream(Querypath);
		XSSFWorkbook  workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		XSSFRow row; 
		XSSFCell cell;
		try
		{
			Iterator rows = sheet.rowIterator();
			while (rows.hasNext())
			{
				row=(XSSFRow) rows.next();
				Iterator cells = row.cellIterator();
				while (cells.hasNext())
				{
					cell=(XSSFCell) cells.next();

					if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
					{
						if(cell.getStringCellValue().equals(testcaseName)) {
							cell=(XSSFCell) cells.next();
							query = String.valueOf(cell.getStringCellValue());
							System.out.print(cell.getStringCellValue()+" ");
							break;
						}
					}
					else if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
					{
						System.out.print(cell.getNumericCellValue()+" ");
					}
					else
					{

					}
				}
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
			fis.close();
		}
		return query;
	}

	/*
	 * Method to write the DB values into excel
	 */
	XSSFSheet worksheet =null;

	public boolean writeDBColumnValuesinExcel(String[] ColumnNames,List<String> DBValues,String testCaseName) throws Exception { 
		boolean flag=false;
		FileOutputStream fileOut = new FileOutputStream(QueryWriter);
		XSSFWorkbook workbook1 = new XSSFWorkbook();
		 worksheet = workbook1.createSheet(testCaseName);
	//	XSSFSheet worksheet = workbook1.addS
		
		int size=ColumnNames.length;
		XSSFRow row1 = worksheet.createRow(0);
		XSSFRow row2 = worksheet.createRow(1);
		try {
			//iterating r number of rows
			for (int i=0;i <size; i++ )
			{
				XSSFCell cell = row1.createCell(i);
				cell.setCellValue(ColumnNames[i]);
				cell = row2.createCell(i);
				cell.setCellValue(DBValues.get(i));
				flag=true;
			}
			workbook1.write(fileOut);
			fileOut.flush();
			fileOut.close();
		}catch(Exception e) {
			System.out.println("Unable to write the values into Excel"+e);
			flag=false;
		}
		return flag;
	}

	/*
	 * Method to write the DB values into excel
	 */

	public boolean writeJSONColumnValuesinExcel(String[] ColumnNames,List<String> DBValues,String ScenarioName) throws Exception { 
		boolean flag=false;
		FileOutputStream fileOut = new FileOutputStream(JsonWriter);
		XSSFWorkbook workbook1 = new XSSFWorkbook();
		XSSFSheet worksheet = workbook1.createSheet(ScenarioName);
		int size=ColumnNames.length;
		XSSFRow row1 = worksheet.createRow(0);
		XSSFRow row2 = worksheet.createRow(1);
		try {
			//iterating r number of rows
			for (int i=0;i <size; i++ )
			{
				XSSFCell cell = row1.createCell(i);
				cell.setCellValue(ColumnNames[i]);
				cell = row2.createCell(i);
				cell.setCellValue(DBValues.get(i));
				flag=true;
			}
			workbook1.write(fileOut);
			fileOut.flush();
			fileOut.close();
		}catch(Exception e) {
			System.out.println("Unable to write the values into Excel"+e);
			flag=false;
		}
		return flag;
	}
	/*
	 * Method to Compare two values from two different sheets 
	 */
	public boolean CompareValuefromSheet() throws Exception{
		boolean flag=false;
		try {
			FileInputStream excellFile1 = new FileInputStream(new File(QueryWriter));
			FileInputStream excellFile2 = new FileInputStream(new File(JsonWriter));
		//	FileInputStream excellFile2 = new FileInputStream(JsonWriter1);
			// Create Workbook instance holding reference to .xlsx file
			XSSFWorkbook workbook1 = new XSSFWorkbook(excellFile1);
			XSSFWorkbook workbook2 = new XSSFWorkbook(excellFile2);
			// Get first/desired sheet from the workbook
			XSSFSheet sheet1 = workbook1.getSheet("OutputDBValues");
			XSSFSheet sheet2 = workbook2.getSheet("OutputJsonValues");
			// Compare sheets
			if(compareTwoSheets(sheet1, sheet2)) {
				System.out.println("\n\nThe two excel sheets are Equal");
				flag=true;
			} else {
				System.out.println("\n\nThe two excel sheets are Not Equal");
				flag=false;
			}
			//close files
			excellFile1.close();
			excellFile2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}


	/*
	 *  Compare Two Sheets
	 */

	public static boolean compareTwoSheets(XSSFSheet sheet1, XSSFSheet sheet2) {
		int firstRow1 = sheet1.getFirstRowNum();
		int lastRow1 = sheet1.getLastRowNum();
		boolean equalSheets = true;
		for(int i=firstRow1; i <= lastRow1; i++) {
			System.out.println("\n\nComparing Row "+i);
			XSSFRow row1 = sheet1.getRow(i);
			XSSFRow row2 = sheet2.getRow(i);
			if(!compareTwoRows(row1, row2)) {
				equalSheets = false;
				System.out.println("Row "+i+" - Not Equal");
				break;
			} else {
				System.out.println("Row "+i+" - Equal");
			}
		}
		return equalSheets;
	}

	/*
	 * Compare Two Rows
	 */
	public static boolean compareTwoRows(XSSFRow row1, XSSFRow row2) {
		if((row1 == null) && (row2 == null)) {
			return true;
		} else if((row1 == null) || (row2 == null)) {
			return false;
		}
		int firstCell1 = row1.getFirstCellNum();
		int lastCell1 = row1.getLastCellNum();
		boolean equalRows = true;
		// Compare all cells in a row
		for(int i=firstCell1; i <= lastCell1; i++) {
			XSSFCell cell1 = row1.getCell(i);
			XSSFCell cell2 = row2.getCell(i);
			if(!compareTwoCells(cell1, cell2)) {
				equalRows = false;
				System.err.println("       Cell "+i+" - Not Equal");
				break;
			} else {
				System.out.println("       Cell "+i+" - Equal");
			}
		}
		return equalRows;
	}

	/*
	 * Compare Two Cells
	 */
	public static boolean compareTwoCells(XSSFCell cell1, XSSFCell cell2) {
		if((cell1 == null) && (cell2 == null)) {
			return true;
		} else if((cell1 == null) || (cell2 == null)) {
			return false;
		}
		boolean equalCells = false;
		int type1 = cell1.getCellType();
		int type2 = cell2.getCellType();
		if (type1 == type2) {
			if (!cell1.getCellStyle().equals(cell2.getCellStyle())) {
				// Compare cells based on its type
				switch (cell1.getCellType()) {
				case HSSFCell.CELL_TYPE_FORMULA:
					if (cell1.getCellFormula().equals(cell2.getCellFormula())) {
						equalCells = true;
					}
					break;
				case HSSFCell.CELL_TYPE_NUMERIC:
					if (cell1.getNumericCellValue() == cell2.getNumericCellValue()) {
						equalCells = true;
					}
					break;
				case HSSFCell.CELL_TYPE_STRING:
					if (cell1.getStringCellValue().equals(cell2.getStringCellValue())) {
						equalCells = true;
					}
					break;
				case HSSFCell.CELL_TYPE_BLANK:
					if (cell2.getCellType() == HSSFCell.CELL_TYPE_BLANK) {
						equalCells = true;
					}
					break;
				case HSSFCell.CELL_TYPE_BOOLEAN:
					if (cell1.getBooleanCellValue() == cell2.getBooleanCellValue()) {
						equalCells = true;
					}
					break;
				case HSSFCell.CELL_TYPE_ERROR:
					if (cell1.getErrorCellValue() == cell2.getErrorCellValue()) {
						equalCells = true;
					}
					break;
				default:
					if (cell1.getStringCellValue().equals(
							cell2.getStringCellValue())) {
						equalCells = true;
					}
					break;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
		return equalCells;
	}
}
