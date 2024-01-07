package question;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testfacebook {
	WebDriver driver;
	@Test
	public void login() throws Exception {
		// I an checking if pull request was confirm
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("masud3386@yahoo.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("madudd");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.quit();
		
		
	}

}
