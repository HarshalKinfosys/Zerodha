package Selenium_Screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Admin\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com/");
		//how to take ss
		TakesScreenshot ts=(TakesScreenshot)driver;//typecast here
		//use getscreenshot method and store in src
		File src=ts.getScreenshotAs(OutputType.FILE);
		//create folder where we need to store scrnsht and give the path of folder with proper name and extnsion
		File dest=new File("C:\\Users\\Admin\\Desktop\\ss\\flipkart.jpg");
		//copy srnsht src to dest
		Files.copy(src,dest);
		
		
	}

}
