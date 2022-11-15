package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actitime.com/pricing");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//page source
		String allelements=driver.getPageSource();
		driver.getPageSource();
		System.out.println(allelements);
		String title=driver.getTitle();
		System.out.println(title);
	}
}

