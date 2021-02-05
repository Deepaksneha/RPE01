package seleniumdemo;


import java.awt.List;
import java.awt.Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class automation {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	Thread.sleep(10000);
	//driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	java.util.List<WebElement> menus =driver.findElements(By.xpath("//*[@id=\'block_top_menu\']/ul"));
	Actions a=new Actions(driver);
	for(WebElement menuname : menus) {
		System.out.println(menuname.getText());
		a.moveToElement(menuname).build().perform();
		Thread.sleep(1000);
	}
	
	
}
}