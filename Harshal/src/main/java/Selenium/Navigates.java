package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigates {
	public static void main(String[] args) throws Throwable {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.navigate().back();//now control goes to 
		Thread.sleep(3000);
		driver.navigate().forward();//now control goes to amazon
		driver.navigate().refresh();
		//whenever page is refreshed in automation at that time address of webpage can be change
		
		driver.close();
	}

}

