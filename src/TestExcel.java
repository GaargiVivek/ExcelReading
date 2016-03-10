import java.util.logging.Logger;


public class TestExcel {
	
	public static void main(String[] args)
	{
		Logger logs = Logger.getLogger("devpinoyLogger");
		
		ExcelReader xls = new ExcelReader("E:\\TestData.xlsx");
		String sheetName="Trainer";
		
		//*********logs.debug("Getting the row count");
		System.out.println("Row Count is "+xls.getRowCount(sheetName));
		
		logs.info("Getting the column count");
		System.out.println("Column Count is "+xls.getColumnCount(sheetName));
		
		logs.info("Get the data from the cell");
		System.out.println(xls.getCellData(sheetName, "username", 3));
		
		logs.info("Entering data in a cell");
		xls.setCellData(sheetName, "username", 4, "Maryana");
	}
}
