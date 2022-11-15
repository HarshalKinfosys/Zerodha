package Selenium_Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_method {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Admin\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		//inspect the element where we want to click
		WebElement target=driver.findElement(By.xpath("//a[@class='gb_d']"));
		// create object of actions class
		Thread.sleep(4000);
		Actions act=new Actions(driver);
		act.moveToElement(target).click().perform();
		
		
	}

}
