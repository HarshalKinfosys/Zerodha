package Test_NG_Programmes;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailable {
	@Test
	public void TC1() {
		Reporter.log("running tc1",true);
	}
	@Test
	public void TC2() {
		Reporter.log("running tc2",true);
	}
	@Test
	public void TC3() {
		Reporter.log("running tc3",true);
		Assert.fail();//it is used to fail test case intentionally
	
	}

}