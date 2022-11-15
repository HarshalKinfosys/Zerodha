package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_Attribute {
		public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Admin\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do"
				+ "");
		//enter UN(use formula xpath by attribute)
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		//enter pwd
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		// click on login butn (use formula xpath by text())
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//driver.findElement(By.xpath("//div[text()='Login']")).click();
		
	}

}
