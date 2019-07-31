package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://demowebshop.tricentis.com");
		
		String t = dr.getTitle();
		String ev = "Demo Web Shop";
		if(t.equals(ev)) {
			System.out.println("Verified : "+t);
		}
		else {
			System.out.println("Not Matched");
		}
		
		dr.findElement(By.className("ico-login")).click();;
		
		String rt = dr.getTitle();
		String ert = "Demo Web Shop. Login";
		
		if(rt.equals(ert)) {
			System.out.println("Verified : "+rt);
		}else {
			System.out.println("Not Matched");
		}
		
		
		
		dr.findElement(By.id("Email")).sendKeys("ujjwalanand@globallogic.com");
		dr.findElement(By.id("Password")).sendKeys("qwerty12");
		
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	}

}
