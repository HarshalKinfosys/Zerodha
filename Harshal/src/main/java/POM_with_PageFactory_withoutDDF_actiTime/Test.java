package POM_with_PageFactory_withoutDDF_actiTime;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.actitime.com/login.do");
		//object 1
		LoginPage l=new LoginPage(driver);
		l.enterUN();
		l.enterpwd();
		l.clickloginbtn();
		//object 2
		HomePage h=new HomePage(driver);
		h.verifyText();
	}
	

}



