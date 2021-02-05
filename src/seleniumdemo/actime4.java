package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actime4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[7]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/div[4]/div")).click();
	driver.findElement(By.xpath("//*[@id=\"popup_menu_support\"]/div[2]/div[3]/ul/li[6]/a")).click();
	String error=driver.findElement(By.xpath("//*[@id=\"aboutPopup_content\"]/table[2]/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[2]/span")).getText();
	System.out.println(error);
	
}
	
}