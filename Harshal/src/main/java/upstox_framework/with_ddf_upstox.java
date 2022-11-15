package upstox_framework;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class with_ddf_upstox {
	
	public static void main(String[] args) throws Throwable {
		//navigate to excel sheet
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\fetch data.xlsx");
		Sheet sh=WorkbookFactory.create(fis).getSheet("Sheet1");
		//set the properties
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		//open the application
		driver.get("https://login-v2.upstox.com/");
		//enter UN
		String UN=sh.getRow(0).getCell(0).getStringCellValue();//BS7849
		driver.findElement(By.xpath("//input[@id='userCode']")).sendKeys(UN);
		//enter pwd
		String pwd=sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		//click on sign in btn
		driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
		//enter DOB as pin
		String pin=sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='yob']")).sendKeys(pin);
		//click on no i am good if appear
		//verification
		String expTitle=sh.getRow(0).getCell(3).getStringCellValue();
		String actTitle=driver.getTitle();
		if(actTitle.equals(expTitle)) {
			System.out.println("user navigate to Home Page TC is pass");
		}
		else {
			System.out.println("TC is fail");
			
		}
		

	}

	
	}
	





