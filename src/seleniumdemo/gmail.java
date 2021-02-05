package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
	public static void main(String[] args)throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("deepakdeepu.2493@gmail.com");
		WebElement next =driver.findElement(By.className("VfPpkd-RLmnJb"));
	    next.click();
	    Thread.sleep(5000);
	    driver.findElement(By.name("password")).sendKeys("deepakmeghana");
		WebElement next1 =driver.findElement(By.className("VfPpkd-RLmnJb"));
	    next1.click();
		
		
		
		
	}

}
