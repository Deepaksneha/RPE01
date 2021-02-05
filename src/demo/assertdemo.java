package demo;

import static org.testng.Assert.fail;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class assertdemo {
@SuppressWarnings("deprecation")
@Test
public void tc() {
	String st1 = "ABC";
	String st2 = "ABC";
	Assert.assertEquals(st1, st2);
	Reporter.log("matched", true);
	
	List<Object>lst1 = new ArrayList<>();
	lst1.add(true);
	lst1.add(1234);
	lst1.add("abc");
	List<Object>lst2 = new ArrayList<>();
	lst2.add("abc");
	lst2.add(456);
	lst2.add("abc");
	Reporter.log("matched2", true);
	
	SoftAssert sa = new SoftAssert();
	sa.assertEquals("abc", "abc");
	Reporter.log("matched3", true);
	sa.assertAll();
	Assert.fail();
}
}
