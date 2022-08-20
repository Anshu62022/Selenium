package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.id("gh-cat"));
		
		Select s=new Select(ele);
		s.selectByValue("11116");
		List<WebElement> sec = s.getOptions();
		System.out.println(sec.size());
		
		for(WebElement b:sec) {
			System.out.println(b.getText());
		}

		
	
		

	}

}
