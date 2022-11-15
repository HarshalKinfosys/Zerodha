package POM_with_pagefactory_without_ddf_Upstox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstox_login2page {
	
	//declaration
	@FindBy(xpath="//input[@id='yob']") private WebElement pin;
	
	//initialization
	public Upstox_login2page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//implementation
	public void enterpin() {
		pin.sendKeys("1993");
		
	}

}
