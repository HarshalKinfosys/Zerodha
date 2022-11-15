package Selenium_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		//maximize the browser
		driver.manage().window().maximize();
		//switch to first frame
		driver.switchTo().frame("packageListFrame");
		//take any element on first frame and print it
		String text1=driver.findElement(By.xpath("//a[text()='org.openqa.selenium.cli']")).getText();
		System.out.println(text1);
	// try to click on any element which is in first frame
		//driver.findElement(By.xpath("//a[text()='org.openqa.selenium.cli']")).click();
		//now we need to switch from 1st frame to main webpage
		driver.switchTo().defaultContent();//now again we came on main webpage
		
		//switch to 2nd frame
		Thread.sleep(3000);
		driver.switchTo().frame("packageFrame");
		//take any element on 2nd frame and print it
		Thread.sleep(4000);
		String text2=driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
		Thread.sleep(3000);
		System.out.println(text2);
		//try to click on any element which is in first frame
				//driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).click();
		
		//switch to 3rd frame
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		//take any element on 3rd frame and print it
		Thread.sleep(3000);
		String text3=driver.findElement(By.xpath("//a[text()='org.openqa.selenium.chrome']")).getText();
		Thread.sleep(3000);
		System.out.println(text3);
		
		//try to click on any element which is in first frame
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium.chrome']")).click();
		
		
		
		
	}

}
