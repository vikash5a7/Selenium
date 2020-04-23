package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {
	
	public static WebDriver webdriver(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\selenium\\driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get(url);
		return driver;
	}

}
