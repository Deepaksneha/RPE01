package org.qsp.testpom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.urbanladderhome;

public class urbanladder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		urbanladderhome ul = new urbanladderhome(driver);
		ul.closeclick1();
		ul.Living1MouseHover(driver);
		ul.sofaclick();
		ul.viewproductclick();

}
}
