package actitime_framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_without_DDF {
	public static void main(String[] args) {
		//set the properties
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	
	driver.get("https://demo.actitime.com/login.do");
	//enterUn
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	//enter pwd
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	//click on loginbtn
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	//verify text present on homepage
	String expText="Enter Time-Track";
	String actText=driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
	
	if(actText.equals(expText)) {
		System.out.println("TC is Pass");
	}
	else
		System.out.println("TC is Fail");
	

	}
}
