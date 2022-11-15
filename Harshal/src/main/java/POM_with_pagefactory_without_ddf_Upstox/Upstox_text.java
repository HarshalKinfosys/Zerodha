package POM_with_pagefactory_without_ddf_Upstox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upstox_text {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		Upstox_Login1page login1=new Upstox_Login1page(driver);
		login1.enterUN();
		login1.enterpwd();
		login1.clickloginbtn();
		
		Upstox_login2page login2=new Upstox_login2page(driver);
		login2.enterpin();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
		
		Upstox_homepage home=new Upstox_homepage(driver);
		home.verifyPagetitle();
	}

}
