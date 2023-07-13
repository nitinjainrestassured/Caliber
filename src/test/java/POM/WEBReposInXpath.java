package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WEBReposInXpath {
	WebDriver driver;
	
	
	public WEBReposInXpath(WebDriver driver) {
		
		this.driver = driver;
	}
	
private By Categories =By.xpath("//h2[@class='wp-block-heading']");
private By readMore=By.xpath("//span[@class='uagb-inline-editing']");
private By Contact= By.xpath("//span[@class='menu-text']");



public void Categories() {
	
	driver.findElement(Categories).isDisplayed();
	
	
}

public void readMore() {
	
	driver.findElement(readMore).click();
	
}

public void Contact() {
	
	driver.findElement(Categories).click();
	
}

	
}

