package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actime3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	WebElement name=(WebElement) driver.findElement(By.xpath("//input[@name='username']"));
	name.sendKeys("admin");
	WebElement pass=(WebElement) driver.findElement(By.xpath("//input[@name='pwd']"));
	pass.sendKeys("manager");
	WebElement login=(WebElement) driver.findElement(By.xpath("//a[@id='loginButton']"));
	login.click();
	WebElement logout=(WebElement) driver.findElement(By.id("logoutLink"));
	logout.click();
}
	
}
