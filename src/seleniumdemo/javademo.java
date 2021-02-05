package seleniumdemo;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class javademo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.name("q"));
	ele.sendKeys("java");
	Thread.sleep(2000);
	
	 java.util.List<WebElement> ref =driver.findElements(By.xpath(
			 "//span[contains(text(),'java')]"));
	 int i=0;
	    for(WebElement name : ref) {
	    	System.out.println(i + " = "+name.getText());
	    	i++;
	    }
	     ref.get(3).click();
}
}
