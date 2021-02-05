package seleniumdemo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class html {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Deepaksneha/Desktop/sam1.html");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("name");
    new WebDriverWait(driver,10).until(ExpectedConditions.textToBePresentInElementValue(By.xpath("/html/body/div[1]/input[1]"), "name"));
	
	driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("Deepak");
	
	
	
}
}
