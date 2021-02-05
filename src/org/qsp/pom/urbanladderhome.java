package org.qsp.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class urbanladderhome {
	
	@FindBy(xpath="//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]")
	private WebElement close;
	
	@FindBy(xpath="//*[@id=\"topnav_wrapper\"]/ul/li[2]/span")
	private WebElement Living1;
	
	
	@FindBy(xpath="//*[@id=\"topnav_wrapper\"]/ul/li[2]/div/div/ul/li[1]/ul/li[1]/a/span")
	private WebElement fabricsofaset;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div/ul/li[1]/div/div[1]/div/a[3]/div/button")
	private WebElement viewproduct1;
	
	public void closeclick1() {
		close.click();
	}
	public void Living1MouseHover(WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(Living1).perform();
	}
	
	public urbanladderhome(WebDriver driver ) {
		PageFactory.initElements(driver, this);
	}
	public void sofaclick() {
		fabricsofaset.click();
	}
	public void viewproductclick() {
		viewproduct1.click();
	}
}