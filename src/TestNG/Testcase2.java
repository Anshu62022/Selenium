package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase2 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openapp() {
	driver=new	ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void tc2() {
	driver.findElement(By.linkText("Forgotten password?")).click();
	driver.findElement(By.name("email")).sendKeys("6202230175");
	driver.findElement(By.id("did_submit")).click();
	Reporter.log(driver.getTitle(),true);
	Reporter.log(driver.getCurrentUrl(),true);
	
		
	}
	
	@AfterTest
	public void closeapp() {
		driver.close();
	}

}
