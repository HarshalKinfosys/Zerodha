package Selenium_drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Month {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//open the application
		driver.get("https://www.facebook.com/");
		//click on create account btn
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		//select which dd which we need to handle
		Thread.sleep(3000);
		//store list box in ref variable 
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		//create object of Select class 
		Select s=new Select(month);
		//select by text
		s.selectByVisibleText("Nov");
		
		//select by value
		//s.selectByValue("11");
	
		//select by index
		//s.selectByIndex(10);
		
		
		
	}

}
