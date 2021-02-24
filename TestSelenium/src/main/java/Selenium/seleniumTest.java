package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest {
	
	public static void main(String args[])
	
	{
		System.setProperty("webdriver.chrome.driver","C://Users/ashishyd/Desktop/chromedriver_win32/chromedriver.exe");
		
		WebDriver vd = new ChromeDriver();
		
		vd.get("https://www.amazon.com");
		System.out.println(vd.getTitle());	
		
		
	}

}
