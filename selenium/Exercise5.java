package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise5 {

	public static void main(String[] args) {
		
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
		
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[1]/td/select/option[3]")).click();
		
		dr.findElement(By.name("DoSearch")).click();
		
		dr.findElement(By.linkText("Web Database Development")).click();
		
		String s = dr.findElement(By.name("quantity")).getText();
		System.out.print(s);
		
		dr.findElement(By.name("quantity")).clear();

		dr.findElement(By.name("quantity")).sendKeys(String.valueOf(2));
		
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[2]/input[1]")).click();

		String pr = dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr[2]/td[2]")).getText();

		String qt = dr.findElement(By.name("quantity_1")).getText();
		
		System.out.print(pr + " "+ qt);

		
		
	}

}
