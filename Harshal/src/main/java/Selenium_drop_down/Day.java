package Selenium_drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//open the application
		driver.get("https://www.facebook.com/");
		//click on create new account btn
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		//select the dd which we need to handle
		Thread.sleep(4000);
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		//create the object of select class 
		Select s=new Select(day);
		Thread.sleep(4000);
		//use select methods(select bt text)
		//s.selectByVisibleText("26");
		//select by value
		s.selectByValue("31");
	}

}
