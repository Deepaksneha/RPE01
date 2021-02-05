package seleniumdemo;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class urbanlad4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.urbanladder.com/");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	//driver.findElement(By.xpath("//a[contains(.,' Stores ')]")).click();
	Thread.sleep(4000);
	 List<WebElement> menus =driver.findElements(By.xpath("//*[@class='topnav bodytext'/li]"));
	 Actions a=new Actions(driver);
	 Thread.sleep(1000);
	 for(WebElement menuname : menus) {
		String mName=menuname.getText();
		System.out.println(mName);
		a.moveToElement(menuname).perform();
		Thread.sleep(2000);
		DemoScreenShot.ScreenShot(driver,mName);
		List<WebElement> submenues= driver.findElements(
				By.xpath("//span[contains(.'Sale')]/parent::li/descent::ul[@class='subnav_item 14241']"));
		for(WebElement Submenuname:submenues) {
	    	System.out.println(Submenuname.getText());
	    }
}
}
}