package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		
		
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://www.w3schools.com/html/html_tables.asp");
		
		for(int i = 2;i<=4;i++) {
			for(int j = 1;j<=3;j++) {
				String s = "//*[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]";
				System.out.print(dr.findElement(By.xpath(s)).getText()+"         ");
				
			}
			System.out.println();
		}
		dr.close();
	}

}
