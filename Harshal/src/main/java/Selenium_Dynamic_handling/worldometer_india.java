package Selenium_Dynamic_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class worldometer_india {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.worldometers.info/coronavirus/country/india");
		//print india corona cases
		String cvc=driver.findElement(By.xpath("(//div[@class='maincounter-number'])[1]")).getText();
		System.out.println(cvc);
		
		// print india corona death
		String death=driver.findElement(By.xpath("(//div[@class='maincounter-number'])[2]")).getText();
		System.out.println(death);
		
		//print recover cases
		String recover=driver.findElement(By.xpath("(//div[@class='maincounter-number'])[3]")).getText();
		System.out.println(recover);
	}

}
