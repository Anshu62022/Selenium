package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	WebElement ele = driver.findElement(By.id("gh-cat"));
	
	Select s=new Select(ele);
	s.selectByIndex(5);
	
	Thread.sleep(3000);
	s.selectByValue("58058");
	
List<WebElement> alloptions = s.getOptions();
System.out.println(alloptions.size());
for(WebElement b:alloptions) {
	System.out.println(b.getText());
}

	}

}
