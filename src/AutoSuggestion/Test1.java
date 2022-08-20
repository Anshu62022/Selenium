package AutoSuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	WebElement ele = driver.findElement(By.name("q"));
	ele.sendKeys("myntra");
	Thread.sleep(3000);
List<WebElement> ele1 = driver.findElements(By.xpath("//ul[@class='G43f7e']"));
System.out.println(ele1.size());


for(WebElement b:ele1) {
	System.out.println(b.getText());

	}
	}
}