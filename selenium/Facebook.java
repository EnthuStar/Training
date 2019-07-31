package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://www.facebook.com");
		
		dr.findElement(By.id("email")).sendKeys("markstinson007@gmail.com");
		
		//or
		
		WebElement we = dr.findElement(By.id("email"));
		//we.sendKeys("Markstinson007@gmail.com");
		
		WebElement wee = dr.findElement(By.id("day"));
		Select sel1 = new Select(wee);
		
		sel1.selectByVisibleText("20");
		
		dr.findElement(By.linkText("Forgotten account?")).click();
		
		dr.findElement(By.cssSelector("input#identify_email")).sendKeys("ghfhfghfgh");
		
		dr.findElement(By.xpath("//input[@id='u_0_2']")).click();
		//dr.findElement(By.cssSelector("input[value=\"Search\"]")).click();
		
		dr.findElement(By.xpath("//i[@class=\"fb_logo img sp_XWJdzZnoeA1 sx_ba923f\"]")).click();
		
		dr.findElement(By.xpath("//*[text()='Male']")).click();
						
		String s = dr.findElement(By.xpath("//*[contains(text(),\"It's\")]")).getText();
		System.out.print(s);
		
		dr.findElement(By.xpath("//input[@name='firstname']//following::input[1]")).sendKeys("sharma");
		
		//Make use of Ancestors 
		//*[text()='Birthday']//ancestor::div[1]
		dr.findElement(By.xpath("//*[text()='Birthday']//ancestor::div[1]")).click();

	}

}
