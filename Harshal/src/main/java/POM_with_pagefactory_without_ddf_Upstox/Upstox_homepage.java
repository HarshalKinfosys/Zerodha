package POM_with_pagefactory_without_ddf_Upstox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstox_homepage {
	//declaration
	@FindBy(xpath="//title[text()='Upstox Pro']") private WebElement Title;
	
	//initialization
	public Upstox_homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void verifyPagetitle() {
		String expT="Upstox Pro";
		String actT=Title.getText();
		
		if (actT.equals(expT)) {
			System.out.println("TC is Pass");
		}
		else
			System.out.println("TC is Fail");
	}

}
