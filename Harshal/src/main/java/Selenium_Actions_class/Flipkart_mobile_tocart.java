package Selenium_Actions_class;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_mobile_tocart {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//click on cancel buttn
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//search mobile 
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("apple mobile",Keys.ENTER);
		
		//click on mobile
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		
		Set<String>allwindows=driver.getWindowHandles();
		ArrayList<String>al=new ArrayList<String>(allwindows);
		
		
		//click on add to cart
		WebElement target=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']"));
		Actions act=new Actions(driver);
		act.moveToElement(target).click().build().perform();
		
		
	}

}
