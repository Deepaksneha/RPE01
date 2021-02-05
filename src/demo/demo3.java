package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo3 {

	
	@Test
	public void tc1() {
		Reporter.log("1hi....", true);
	}
	
	@Test(dependsOnMethods = {"tc1"})
	public void tc2() {
		Reporter.log("2hi....", true);
	}
	
	@Test
	public void tc3() {
		Reporter.log("3hi....", true);
	}
}
