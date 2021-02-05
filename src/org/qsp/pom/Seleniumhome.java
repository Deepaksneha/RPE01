package org.qsp.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Seleniumhome {
	
	@FindBy(name="search")
	private WebElement Search;
	
	
	public Seleniumhome(WebDriver driver ) {
		PageFactory.initElements(driver, this);
	}
	public void sendText(String Text) {
		
		Search.sendKeys(Text,Keys.ENTER);
	}

}
