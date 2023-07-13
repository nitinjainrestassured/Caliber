package UIANDRESTASSURED;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM.WEBReposInXpath;

public class caliberProject {
	WebDriver driver;
	
	 @BeforeTest
	   @Parameters("browser")
		 
		 public void setUpBrowser(@Optional("chrome") String browser) {
		 if (browser.equals("chrome")) {
				
				 System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Tutorbin\\Desktop\\Selenium\\chromedriver.exe");
				 
				  driver = new ChromeDriver();
				
				 
 }
	 }
		 
		 
@Test(priority=1)
 public void createProject() throws InterruptedException{
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
    driver.manage().window().maximize();
     driver.get("https://thedemosite.co.uk/");
     Thread.sleep(2000);
    // String url="https://thedemosite.co.uk/";
     
     WEBReposInXpath wrix = new  WEBReposInXpath(driver);
     wrix.Categories();
     Thread.sleep(4000);
     wrix.readMore();
     Thread.sleep(3000);
     
   WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='menu-text']")));
  // wrix.Contact();
   
   
     
     TakesScreenshot scrShot =((TakesScreenshot )driver);
     File scrFile= scrShot.getScreenshotAs(OutputType.FILE);
 //  String path=  System.setProperties("user.dir"+"scrfile");
     
     
   //scrolldown a page  
     JavascriptExecutor js=(JavascriptExecutor) driver;
     js.executeScript("window.scrollBy(0,350)", "");
     
     
     
     
     
     
     
     
     
     
     }
		 
		
@AfterTest
public void teardown() {
	//driver.close();
	driver.quit();
}
	

}

