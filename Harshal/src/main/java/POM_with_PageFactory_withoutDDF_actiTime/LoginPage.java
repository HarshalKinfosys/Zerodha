package POM_with_PageFactory_withoutDDF_actiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
	@FindBy(xpath="//input[@id='username']") private WebElement UN;
	@FindBy(xpath="//input[@name='pwd']") private WebElement pwd;
	@FindBy(xpath="//div[text()='Login ']") private WebElement loginbtn;
	
	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void enterUN() {
		UN.sendKeys("admin");
	}
	public void enterpwd() {
		pwd.sendKeys("manager");
	}
	public void clickloginbtn() {
		loginbtn.click();
	}
	
}
