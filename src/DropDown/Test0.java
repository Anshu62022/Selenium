package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ref = driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(ref );		
		s.selectByValue("search-alias=beauty");
		
		Thread.sleep(3000);
		s.selectByVisibleText("Car & Motorbike");
		Thread.sleep(3000);
		s.selectByIndex(7);

	}

}
