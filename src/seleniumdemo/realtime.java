package seleniumdemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class realtime {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(4000);
	driver.findElement(By.partialLinkText("Inc")).click();
	Set <String> wins =driver.getWindowHandles();
	for (String win: wins) {
	driver.switchTo().window(win);
}
   driver.findElement(By.xpath("//input[@type='text']"));
    

}
	
}
