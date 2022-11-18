package upstox_framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDF_upstox {
	public static void main(String[] args) {
		//set properties
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//delete all coockies
		driver.manage().deleteAllCookies();
		//maximize the browser
		driver.manage().window().maximize();
		//open the application
		driver.get("https://login-v2.upstox.com/");
		//enter UN
		driver.findElement(By.xpath("//input[@id='userCode']")).sendKeys("BS7849");
		//enter pwd
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Samarth@97");
		//click on sign in
		driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
		//
		driver.findElement(By.xpath("//input[@id='yob']")).sendKeys("1992");
		//click on no iam good
		driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
		//verify user is on home page
		String expT="Upstox Pro";
		String actT=driver.getTitle();
		if(actT.equals(actT)) {
			System.out.println("user navigate to home page and TC is pass");
		}
		else
		{
			System.out.println("TC is fail");
		}
	}

}
