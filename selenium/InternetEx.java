package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		WebDriver dr = new InternetExplorerDriver();
		
		dr.get("https://www.google.com");
		
		
	}

}