package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement createnewacc =driver.findElement(By.xpath("//a[@role='button']"));
		System.out.println(createnewacc.isEnabled());
		if(createnewacc.isEnabled())
			createnewacc.click();
		WebElement male=driver.findElement(By.xpath("//label[text()='Male']"));
		Thread.sleep(2000);
		if(male.isDisplayed())
			male.click();
		Thread.sleep(2000);
		System.out.println(male.isSelected());
	}
}