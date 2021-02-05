package org.qsp.testpom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.Seleniumhome;

public class testseleniumpom {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.selenium.dev/");
	Seleniumhome sh = new Seleniumhome(driver);
	sh.sendText("java");
    driver.navigate().back();
    sh.sendText("testng");
}
}
