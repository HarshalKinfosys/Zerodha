package POM_with_PageFactory_withoutDDF_actiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaration
	@FindBy(xpath="//td[text()='Enter Time-Track']") private WebElement Text;
	
	//initialization
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}

	public void verifyText() {
		String expText="Enter Time-Track";
		String actText=Text.getText();
	
	if(actText.equals(expText)) {
		System.out.println("Tc is Pass");
	}
	else
		System.out.println("TC is Fail");
}

}