package Selenium_Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class with_DDF {
	public static void main(String[] args) throws Throwable {
		//fetch data from excel
		FileInputStream fm=new FileInputStream("C:\\Users\\Admin\\Desktop\\fetch data.xlsx");
		Sheet sh=WorkbookFactory.create(fm).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//delete all cookies
		driver.manage().deleteAllCookies();
		//maximize
		driver.manage().window().maximize();
		//open the app
		driver.get("https://demo.actitime.com/login.do");
		//enter un
		String UN=sh.getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UN);
		//enter paswrd
		String pass=sh.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pass);
		//click on login bttn
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//enter something on home page
		String data=sh.getRow(1).getCell(2).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).sendKeys(data);
		//verify title of home page
		String expT=sh.getRow(1).getCell(2).getStringCellValue();
		String actT=driver.getTitle();
		//compare
		if(expT.equals(actT)) {
			System.out.println("TC is Pass");
		}
		else {
			System.out.println("TC is fail");
		}
	}

}
