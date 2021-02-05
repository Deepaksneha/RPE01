package seleniumdemo;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8296010606");
	driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("deepak@2019");
    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).sendKeys(Keys.ENTER);
    Thread.sleep(5000);
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphones",Keys.ENTER);
    java.util.List<WebElement> menus =driver.findElements(By.xpath("//*[@id=\'container\']/div/div[2]/div/div/span[1]"));
    for(WebElement menuname : menus) {
    	System.out.println(menuname.getText());
}
}
}
