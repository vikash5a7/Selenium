package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.Webdriver;

public class Test {

	public static void main(String[] args) {
		WebDriver driver = Webdriver.webdriver("https://www.facebook.com");
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("myown xpath");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
		driver.close();
	}

}
