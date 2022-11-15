package Test_NG_Programmes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	@Test(enabled = false)//intentionally we are ignored tc1
	public void TC1() {
		Reporter.log("Running TC1",true);
	}
	@Test
	public void TC2() {
		Reporter.log("Running TC1",true);
	}


}
