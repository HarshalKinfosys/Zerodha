package Selenium_Dynamic_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Admin\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.get("https://www.flipkart.com/");
		//click on cancle button
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//search for mobile
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobile under 20000",Keys.ENTER);
		//print the price of first mobile
		String fmp=driver.findElement(By.xpath("//div[@class='col col-5-12 nlI3QM']/descendant::div[3]")).getText();
		System.out.println(fmp);
		
		//print ratings
		String rate=driver.findElement(By.xpath("(//div[@class='gUuXy-'])[1]")).getText();
		System.out.println(rate);
	}

}
