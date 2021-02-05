package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
    	WebElement search1 =driver.findElement(By.xpath("//input[@type='text']"));
		search1.sendKeys("deepakdeepu.2493@gmail.com");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("deepaksneha",Keys.ENTER);
		WebElement login1 =driver.findElement(By.xpath("//button[@'value=\"1\"']"));
		login1.click();
		
		
		
}
}