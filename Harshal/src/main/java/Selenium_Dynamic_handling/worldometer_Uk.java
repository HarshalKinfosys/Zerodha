package Selenium_Dynamic_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class worldometer_Uk {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		 
		 driver.get("https://www.worldometers.info/coronavirus/country/uk");
		 
		 //print death cases
		 String death=driver.findElement(By.xpath("(//div[@class='maincounter-number'])[2]")).getText();
		 System.out.println(death);
		 
		 //print recover cases
		 String recovered=driver.findElement(By.xpath("(//div[@class='maincounter-number'])[3]")).getText();
		 System.out.println(recovered);
	
	}
	

}
