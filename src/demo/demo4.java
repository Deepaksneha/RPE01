package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo4 {

	
	@Test(groups="smoke")
	public void tc1() {
		Reporter.log("1hi....", true);
	}
	
	@Test(groups="smoke")
	public void tc2() {
		Reporter.log("2hi....", true);
	}
	
	@Test(groups="functional",dependsOnGroups="smoke",priority=-1)
	public void tc3() {
		Reporter.log("3hi....", true);
	}
	
	@Test(groups="smoke")
	public void tc4() {
		Reporter.log("4hi....", true);
	}
	
	@Test(groups="functional",dependsOnGroups="smoke",priority=-2)
	public void tc5() {
		Reporter.log("5hi....", true);
	}
	
	@Test(groups="functional",dependsOnGroups="smoke",priority=-4)
	public void tc6() {
		Reporter.log("6hi....", true);
	}
	
	@Test(groups="functional",dependsOnGroups="smoke",priority=-3)
	public void tc7() {
		Reporter.log("7hi....", true);
	}
	
	
}
