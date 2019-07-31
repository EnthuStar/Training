package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://www.facebook.com");
		
		dr.findElement(By.id("email")).sendKeys("markstinson007@gmail.com");
		
		dr.findElement(By.id("pass")).sendKeys("h1511132s");
		
		dr.findElement(By.id("loginbutton")).click();
		
		String profilename, title = dr.getTitle();
		profilename = dr.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[1]/div[1]/div/a/span/span")).getText();
		System.out.print(profilename+"\n"+title);
		
		
	}

}
