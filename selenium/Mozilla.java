package selenium;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Mozilla {
	public static void main(String[] z) {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		
		dr.get("https://www.ericmmartin.com/code/jquery/checkbox.html");
		
		WebElement d = dr.findElement(By.id("test-1"));
		WebElement d2 = dr.findElement(By.id("test-2"));
		
		boolean cs = d.isSelected();
		if(cs==true) {
			d.click();
		}else {
			d2.click();
		}
		
		
		
		
	}
	
}
