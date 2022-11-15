package POM_with_PageFactory_WithDDF_actTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home1Page {
	//declaration
		@FindBy(xpath="//td[text()='Enter Time-Track']") private WebElement Text;
		
		public Home1Page(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		public void verifyText(String expText) {
			String actText=Text.getText();
			
			if(actText.equals(expText)) {
				System.out.println("TC is Pass");
			}
			else
				System.out.println("TC is fail");
		}
		

}
