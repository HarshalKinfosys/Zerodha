package actitime_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_with_DDF {
	public static void main(String[] args) throws Throwable {
		//Excel fetch
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\fetch data.xlsx");
		Sheet sh=WorkbookFactory.create(fis).getSheet("Sheet1");
		//set property
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.actitime.com/login.do");
		//enter UN
		String UN=sh.getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UN);
		//enter pwd
		String pwd=sh.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
		//click on login
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//verify the text on home page
		String expText=sh.getRow(1).getCell(2).getStringCellValue();
		String actText=driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
		
		if(expText.equals(actText)) {
		System.out.println("TC is Pass");
	}
	else
		System.out.println("TC is Fail");

		}

}
