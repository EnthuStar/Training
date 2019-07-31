package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		
		
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://demowebshop.tricentis.com");
		
		Excel e = new Excel();
		
		for(int i = 1;i<=2;i++) {
			Creds s = e.read_file(i);
			String t = dr.getTitle();
			String ev = s.getExp();
			
			if(t.equals(ev)) {
				System.out.println("Verified : "+t);
				e.write_file(i, "Pass");
			}
			else {
				System.out.println("Not Matched");
				e.write_file(i, "Failed");
			}
			
			dr.findElement(By.className("ico-login")).click();
			
			dr.findElement(By.id("Email")).sendKeys(s.getUid());
			dr.findElement(By.id("Password")).sendKeys(s.getPass());
			
			dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();	
		
			dr.findElement(By.className("ico-logout")).click();

		
		}
		
	}
}
