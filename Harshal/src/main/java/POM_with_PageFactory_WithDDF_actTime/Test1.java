package POM_with_PageFactory_WithDDF_actTime;

import java.io.FileInputStream;

import java.time.Duration;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) throws Throwable {
		//fetch from excel sheet
		FileInputStream file=new FileInputStream("C:\\\\Users\\\\Admin\\\\Desktop\\\\fetch data.xlsx");
		//navigate to sheet
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		//set property
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.actitime.com/login.do");
		//1st object
		String username=sh.getRow(1).getCell(0).getStringCellValue();
		Login1Page l1=new Login1Page(driver);
		l1.enterUN(username);
		
		String password=sh.getRow(1).getCell(1).getStringCellValue();
		l1.enterpwd(password);
		
		l1.clickLoginbtn();
		
		//2nd object
		String expText=sh.getRow(1).getCell(2).getStringCellValue();
		Home1Page h=new Home1Page(driver);
		h.verifyText(expText);
		
	}
	
		
}		
		
		
		
		
		
		
	

	
