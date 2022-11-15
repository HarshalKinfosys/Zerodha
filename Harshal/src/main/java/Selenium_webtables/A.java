package Selenium_webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Admin\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/WebTable%20by%20ANKUSH%20(1).html");
		//print only student name 
		String sn=driver.findElement(By.xpath("//table[@id='2244']//th[2]")).getText();
		System.out.println(sn);
		
		//print city
		String snn=driver.findElement(By.xpath("//table[@id='2244']//th[3]")).getText();
		System.out.println(snn);
		
		//print sr no
		String sr=driver.findElement(By.xpath("//table[@id='2244']//th[1]")).getText();
		System.out.println(sr);
		
		//print sachin
		String sachn=driver.findElement(By.xpath("//table[@id='2244']/descendant::td[2]")).getText();
		System.out.println(sachn);
		
		//print shilpa
		String shl=driver.findElement(By.xpath("//table[@id='2244']/descendant::td[11]")).getText();
		System.out.println(shl);
		
		//print row2
		String r2=driver.findElement(By.xpath("//table[@id='2244']//tr[2]")).getText();
		System.out.println(r2);
		
		//print row5
		String r5=driver.findElement(By.xpath("//table[@id='2244']//tr[5]")).getText();
		System.out.println(r5);
		
	}

}
