package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class acttime {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(4000);
	WebElement username=(WebElement) driver.findElement(By.xpath("//b[contains(.,'admin')]"));
	System.out.println("username"+ username .getText());
	WebElement Password=(WebElement) driver.findElement(By.xpath("//b[contains(.,'manager')]"));
	System.out.println("Password"+ Password .getText());
	WebElement name=(WebElement) driver.findElement(By.xpath("//input[@name='username']"));
	name.sendKeys("admin");
	WebElement pass=(WebElement) driver.findElement(By.xpath("//input[@name='pwd']"));
	pass.sendKeys("manager");
	WebElement login=(WebElement) driver.findElement(By.xpath("//a[@id='loginButton']"));
	login.click();
}
	
}
