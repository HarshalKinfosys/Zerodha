package POM_with_pagefactory_without_ddf_Upstox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstox_Login1page {
	//declaration
	@FindBy(xpath="//input[@id='userCode']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement pwd;
	@FindBy(xpath="//div[text()='Sign into Upstox']") private WebElement login;
	//initialization
	public Upstox_Login1page(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	//implementation
	public void enterUN() {
		UN.sendKeys("BS7849");
	}
	public void enterpwd() {
		pwd.sendKeys("Samarth@97");
	}
	public void clickloginbtn() {
		login.click();
	}
 	

}
