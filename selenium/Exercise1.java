package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

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
		
		dr.findElement(By.className("ico-register")).click();;
		
		String rt = dr.getTitle();
		String ert = "Demo Web Shop. Register";
		
		if(rt.equals(ert)) {
			System.out.println("Verified : "+rt);
		}else {
			System.out.println("Not Matched");
		}
		
		List<WebElement> wl = dr.findElements(By.name("Gender"));
		wl.get(0).click();
		
		dr.findElement(By.id("FirstName")).sendKeys("Ujjwal");
		dr.findElement(By.id("LastName")).sendKeys("Anand");
		dr.findElement(By.id("Email")).sendKeys("ujjwalanand@globallogic.com");
		dr.findElement(By.id("Password")).sendKeys("qwerty12");
		dr.findElement(By.id("ConfirmPassword")).sendKeys("qwerty12");
		dr.findElement(By.id("register-button")).click();
		dr.findElement(By.className("ico-logout")).click();

	}

}
