package day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_io2 {

	/**
	 * @param args
	 */public static boolean Prime(double s)
		{
			int k=0;
			for(int j=2;j<=s/2;j++)
			{
				if(s%j==0)
					k=1;
			}
			if(k==1)
				return false;
			else
				return true;
		}
			
		
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int j=0,k=0,l=0;
			File f= new File("C:\\Users\\bhaskar.shukla\\Desktop\\1.xlsx");
			FileInputStream fis= new FileInputStream(f);
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheet("Numbers");
			for(int i=0;i<9;i++)
			{
				XSSFRow row=sh.getRow(i);
				XSSFCell cell=row.getCell(0);
				
				int s=(int)(readexcel(cell));
			if(Prime(s))
			{
				XSSFSheet sh1=wb.getSheet("Prime");
				XSSFRow row1=sh1.createRow(j);
				XSSFCell cell1=row1.createCell(0);
				FileOutputStream fos= new FileOutputStream(f);
				cell1.setCellValue(s);
				wb.write(fos);
				j++;
			}
			else if(s%2==0)
			{
				XSSFSheet sh1=wb.getSheet("Even");
				XSSFRow row1=sh1.createRow(k);
				XSSFCell cell1=row1.createCell(0);
				FileOutputStream fos= new FileOutputStream(f);
				cell1.setCellValue(s);
				wb.write(fos);
				k++;
			}
			else
			{
				XSSFSheet sh1=wb.getSheet("Odd");
				XSSFRow row1=sh1.createRow(l);
				XSSFCell cell1=row1.createCell(0);
				FileOutputStream fos= new FileOutputStream(f);
				cell1.setCellValue(s);
				wb.write(fos);
				l++;
			}
		}
		}
			
			
		catch(IOException e)
		{
			e.printStackTrace();
		}


		}



	private static double readexcel(XSSFCell cell) {
		double x;
		x=cell.getNumericCellValue();
		return x;
	}
}


