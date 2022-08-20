package AutoSuggestion;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("dress");
		
		Thread.sleep(2000);
		
		List<WebElement> s= driver.findElements(By.xpath("//div[@class='nav-issFlyout nav-flyout']"));
		System.out.println(s.size());
		
		for(WebElement b:s) {
			System.out.println(b.getText());
		}
		
		
		
		
	}

}
