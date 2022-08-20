package getters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ref= driver.findElement(By.id("email"));
		System.out.println(ref.getAttribute("placeholder"));
		
	WebElement ele=	driver.findElement(By.id("pass"));
	System.out.println(ele.getAttribute("placeholder"));
}
}