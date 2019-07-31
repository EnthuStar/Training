package day5;
import java.io.*;

import org.apache.poi.xssf.usermodel.*;

public class excel_io1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File f= new File("C:\\Users\\bhaskar.shukla\\Desktop\\2.xlsx");
			FileInputStream fis= new FileInputStream(f);
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheet("Sheet1");
			XSSFRow row=sh.getRow(0);
			XSSFCell cell=row.createCell(1);
			/*String s=cell.getStringCellValue();
			System.out.println("Data ="+s);
			*/
			FileOutputStream fos= new FileOutputStream(f);
			cell.setCellValue("GloblLogic");
			wb.write(fos);
			
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}

