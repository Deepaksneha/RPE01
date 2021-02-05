package seleniumdemo;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipka {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		ele.click();
   WebElement ele2=driver.findElement(By.name("q"));
	ele2.sendKeys("iphone");
	Thread.sleep(2000);
	
	 List<WebElement> names =driver.findElements(By.xpath(
			 "//input[contains(text(),'iphone')]"));
	 int i=0;
	    for(WebElement name : names) {
	    	System.out.println(i + " = "+name.getText());
	    	i++;
	    }
	     names.get(1).click();
}
}
