package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		
		WebDriver dr = new ChromeDriver();
		
		dr.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		
		dr.findElement(By.xpath("//input[@name='user_login']")).sendKeys("ujajaijwala");
		
		dr.findElement(By.xpath("//input[@name='user_password']")).sendKeys("qwerty12");
		
		dr.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Ujjwal");
		
		dr.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Anand");
		
		dr.findElement(By.xpath("//input[@name='email']")).sendKeys("ujjwal.anand@gmail.com");
		
		dr.findElement(By.xpath("//input[@name='address1']")).sendKeys("H2002");
		
		dr.findElement(By.xpath("//input[@name='address2']")).sendKeys("Logix");
		
		dr.findElement(By.xpath("//input[@name='address3']")).sendKeys("Sector 137");
		
		dr.findElement(By.xpath("//input[@name='city']")).sendKeys("Noida");
		
		dr.findElement(By.xpath("//select[@name='state_id']//option[@value='6']")).click();
		
		dr.findElement(By.xpath("//input[@name='zip']")).sendKeys("82701");
		
		dr.findElement(By.xpath("//select[@name='country_id']//option[@value='6']")).click();
		
		dr.findElement(By.xpath("//input[@name='phone_home']")).sendKeys("8270124343");
		
		dr.findElement(By.xpath("//input[@name='phone_work']")).sendKeys("8270122323");

		dr.findElement(By.xpath("//select[@name='language_id']//option[@value='1']")).click();
		
		dr.findElement(By.xpath("//select[@name='age_id']//option[@value='4']")).click();
		
		dr.findElement(By.xpath("//select[@name='gender_id']//option[@value='1']")).click();
		
		dr.findElement(By.xpath("//select[@name='education_id']//option[@value='2']")).click();
		
		dr.findElement(By.xpath("//select[@name='income_id']//option[@value='5']")).click();
		
		dr.findElement(By.xpath("//textarea[@name='note']")).sendKeys("Mast Aadmi");
		
		dr.findElement(By.xpath("//input[@name='Insert']")).click();
		

		if("admin".equals(dr.findElement(By.xpath("//*[text()='admin']")).getText())) {
			System.out.print("Matched");
		}else {
			System.out.print("Not Matched");
		}

		dr.close();
		
	}

}
