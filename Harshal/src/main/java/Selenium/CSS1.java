package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the application
		driver.get("https://demo.actitime.com/login.do");
		//enter un
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		//enter password
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.manage().window().maximize();
		
		
		
		
		
	}

}
