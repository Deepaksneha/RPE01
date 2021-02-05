package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notification {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--diable-notification");
	WebDriver driver= new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
}
}
