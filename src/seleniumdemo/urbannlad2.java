package seleniumdemo;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class urbannlad2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.urbanladder.com/");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	//driver.findElement(By.xpath("//a[contains(.,' Stores ')]")).click();
	Thread.sleep(4000);
	 java.util.List<WebElement> menus =driver.findElements(By.xpath("//*[@class='topnav bodytext'/li]"));
	    for(WebElement menuname : menus) {
	    	System.out.println(menuname.getText());
	//String loc1= driver.findElement(By.xpath("//*[@id=\'app-container\']/div/main/section[2]/div/a[1]/div[2]/h3")).getText();
	//System.out.println(loc1);
	    	//String loc2= driver.findElement(By.xpath("//*[@id=\'app-container\']/div/main/section[2]/div/a[2]/div[2]/h3")).getText();
	    	//System.out.println(loc2);
	    	//String loc3= driver.findElement(By.xpath("//*[@id=\'app-container\']/div/main/section[2]/div/a[3]/div[2]/h3")).getText();
	    	//System.out.println(loc3);
	    	//String loc4= driver.findElement(By.xpath("//*[@id=\'app-container\']/div/main/section[2]/div/a[4]/div[2]/h3")).getText();
	    	//System.out.println(loc4);
	    	//String loc5= driver.findElement(By.xpath("//*[@id=\'app-container\']/div/main/section[2]/div/a[5]/div[2]/h3")).getText();
	    	//System.out.println(loc5);
	    	//String loc6= driver.findElement(By.xpath("//*[@id=\'app-container\']/div/main/section[2]/div/a[6]/div[2]/h3")).getText();
	    	//System.out.println(loc6);
	    	//String loc7= driver.findElement(By.xpath("//*[@id=\'app-container\']/div/main/section[2]/div/a[7]/div[2]/h3")).getText();
	    	//System.out.println(loc7);
	    	//String loc8= driver.findElement(By.xpath("//*[@id=\'app-container\']/div/main/section[2]/div/a[8]/div[2]/h3")).getText();
	    	//System.out.println(loc8);
	    	//String loc9= driver.findElement(By.xpath("//*[@id=\'app-container\']/div/main/section[2]/div/a[9]/div[2]/h3")).getText();
	    	//System.out.println(loc9);
	    	//String loc10= driver.findElement(By.xpath("//*[@id=\'app-container\']/div/main/section[2]/div/a[10]/div[2]/h3")).getText();
	    	//	System.out.println(loc10);
	    }
}
}
