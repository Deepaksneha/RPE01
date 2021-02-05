package seleniumdemo;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class new1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.urbanladder.com/");
	String parent = driver.getWindowHandle();
	System.out.println("parent" +parent);
	Set<String>winshandel = driver.getWindowHandles();
	System.out.println(winshandel.getClass());
	ArrayList<String> a1= new ArrayList<>(winshandel);
	for(int i=a1.size()-1;i>=0;i--) {
		driver.switchTo().window(a1.get(i));
			driver.close();
			Thread.sleep(2000);
	}
	
}
}
