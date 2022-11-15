package POM_with_PageFactory_WithDDF_actTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1Page {
	//declaration
		@FindBy(xpath="//input[@id='username']") private WebElement UN;
		@FindBy(xpath="//input[@name='pwd']") private WebElement pwd;
		@FindBy(xpath="//div[text()='Login ']") private WebElement loginbtn;
		
		//initialization
		public Login1Page(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		public void enterUN(String username) {
			UN.sendKeys(username);
		}
		public void enterpwd(String password) {
			pwd.sendKeys(password);
		}
		public void clickLoginbtn() {
			loginbtn.click();
		}

}
