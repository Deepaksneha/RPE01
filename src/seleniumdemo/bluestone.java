package seleniumdemo;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bluestone {
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com/");
	
	driver.findElement(By.xpath("//input[contains(@class,'form-text typeahead')]")).sendKeys("diamond ring",Keys.ENTER);
	driver.findElement(By.xpath("//*[@id=\'pid_28402\']/img")).click();
	
	for (String win: driver.getWindowHandles())
   {
		driver.switchTo().window(win);
	
	}
	driver.findElement(By.xpath("//*[@id=\'buy-now\']")).click();
	Thread.sleep(1000);
   String Error= driver.findElement(By.xpath("/html/body/div[4]/div[1]/text()")).getText();
    System.out.println(Error);
}

}
	


	
   
   
 