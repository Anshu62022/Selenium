package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	WebElement ele = driver.findElement(By.id("course"));
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();
	
	driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
	
WebElement ele2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
a.doubleClick(ele2).perform();

	}

}
