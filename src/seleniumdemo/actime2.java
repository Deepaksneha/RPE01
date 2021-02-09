package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actime2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("admin");
	driver.findElement(By.xpath("//*[@id=\'loginFormContainer\']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("manager",Keys.ENTER);
	Thread.sleep(10000);
	driver.findElement(By.xpath("//*[@id=\'addTaskButtonId\']/div[1]")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//*[@id=\'createTasksPopup_content\']/div[1]/div[1]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/div[1]/div[3]")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//*[@id=\'createTasksPopup_content\']/div[1]/div[1]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	driver.findElement(By.xpath("//*[@id=\'createTasksPopup_content\']/div[1]/div[1]/div/div[1]/div/table/tbody/tr[2]/td[1]/input")).sendKeys("Deepak");
	driver.findElement(By.xpath("//*[@id=\'createTasksPopup_content\']/div[1]/div[1]/div/div[1]/div/table/tbody/tr[4]/td[1]/input")).sendKeys("Selenium");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//*[@id=\'createTasksPopup_content\']/div[2]/div[2]/div[1]/div/div[1]")).click();
	Thread.sleep(10000);
	String error=driver.findElement(By.xpath("//*[@id=\'createTasksPopup_content\']/div[2]/div[1]/span")).getText();
	System.out.println(error);
	
	system
}
	
}
