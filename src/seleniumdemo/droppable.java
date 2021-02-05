package seleniumdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class droppable {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/droppable/");
	Thread.sleep(1000);
	
	WebElement f=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	
	Thread.sleep(10000);
	
	driver.switchTo().frame(f);
	Thread.sleep(2000);
	WebElement From=driver.findElement(By.id("draggable"));
	WebElement To=driver.findElement(By.id("droppable"));
	
	Actions act=new Actions(driver);
	
	act.dragAndDrop(From, To).build().perform();
	//act.dragAndDropBy(ele, 168, 168).perform();
	WebElement dropped=driver.findElement(By.xpath("//*[@id=\'droppable\']/p"));
	System.out.println(dropped.getText());
}
}