package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		
		WebDriver dr = new ChromeDriver();
		
		dr.get("http://examples.codecharge.com/Store/Default.php");
		
		String t = dr.getTitle();
		String ev = "Online Bookstore";
		if(t.equals(ev)) {
			System.out.println("Verified : "+t);
		}
		else {
			System.out.println("Not Matched");
		}
		
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[1]/td/select/option[3]")).click();;
		
		dr.findElement(By.name("DoSearch")).click();
				
		dr.close();
		
	}

}
