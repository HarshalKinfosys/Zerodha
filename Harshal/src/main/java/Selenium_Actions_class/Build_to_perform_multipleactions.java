package Selenium_Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Build_to_perform_multipleactions {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Admin\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		// inspect element where we need to move cursor
		WebElement target=driver.findElement(By.xpath("//a[text()='Images']"));
		//create object of actions class
		Actions act=new Actions(driver);
		// we are performing multiple actions in single statement using build method
		act.moveToElement(target).contextClick().click().build().perform();
	}

}
