package seleniumdemo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/upload/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"file_wraper0\"]")).click();
	Runtime r= Runtime.getRuntime();
	r.exec("C:\\Users\\Deepaksneha\\Desktop\\Disabled.exe");
}
}
