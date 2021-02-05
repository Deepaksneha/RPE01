package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		Thread.sleep(4000);
		WebElement search = driver.findElement(By.xpath("//*[@id=\"gsc-i-id1\"]"));
		search.sendKeys("java",Keys.ENTER);
		driver.navigate().back();
		WebElement search1 = driver.findElement(By.xpath("//*[@id=\"gsc-i-id1\"]"));
		search1.sendKeys("testng",Keys.ENTER);
	}

}
