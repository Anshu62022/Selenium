package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	WebElement ref = driver.findElement(By.id("gh-cat"));
	
	Select s=new Select(ref);

	Thread.sleep(3000);
	s.selectByIndex(7);
	
	Thread.sleep(3000);
	s.selectByValue("12576");
	
	Thread.sleep(3000);
	s.selectByVisibleText("Dolls & Bears");
	
	
	
	List<WebElement> alloptions = s.getOptions();
	System.out.println(alloptions.size());

	for(WebElement b:alloptions) {
		System.out.println(b.getText());
	}

	}

}
