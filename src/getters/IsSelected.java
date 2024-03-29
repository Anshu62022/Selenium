package getters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
	if(checkbox.isSelected()) {
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	
	driver.close();
	
	}

}
