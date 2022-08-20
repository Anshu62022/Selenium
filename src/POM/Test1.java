package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Facebook f=new Facebook(driver);
		f.usernametextbox("6202230175");
		f.passwordtextbox("chocolatedome");
		f.loginbutton();

	}

}
