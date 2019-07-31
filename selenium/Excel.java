package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public Creds read_file(int i) {
		Creds p = new Creds();
		try {
			File f = new File("C:\\Users\\ujjwal.anand\\Desktop\\Creds.xlsx");

			FileInputStream fis = new FileInputStream(f);
		
			XSSFWorkbook w = new XSSFWorkbook(f);
			XSSFSheet s = w.getSheetAt(0);
			XSSFRow r = s.getRow(i);
			XSSFCell c = r.getCell(0);
			p.uid = c.getStringCellValue();
			XSSFCell c1 = r.getCell(1);
			p.pass = c1.getStringCellValue();
			XSSFCell c2 = r.getCell(2);
			p.exp = c2.getStringCellValue();
			
			fis.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	
	public void write_file(int i,String g) {
		try {
			File f =new File("C:\\Users\\ujjwal.anand\\Desktop\\Creds.xlsx");
			FileInputStream fis=new FileInputStream(f);
			XSSFWorkbook w=new XSSFWorkbook(fis);
			XSSFSheet s=w.getSheetAt(0);
			XSSFRow r=s.getRow(i);
			XSSFCell c = r.createCell(3);
			FileOutputStream fos=new FileOutputStream(f);
			c.setCellValue(g);
			
			w.write(fos);
			fis.close();
			fos.close();

			}catch (IOException e) {
			e.printStackTrace();
			} 
	}
	
}
