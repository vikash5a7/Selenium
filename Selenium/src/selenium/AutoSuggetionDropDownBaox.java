package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Webdriver;

public class AutoSuggetionDropDownBaox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Webdriver.webdriver("https://www.makemytrip.com/");
		WebElement source=driver.findElement(By.id("fromCity"));
		source.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
		element.sendKeys("Mum");
		Thread.sleep(2000);
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ENTER);
		WebElement destinationKey = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));
		destinationKey.sendKeys("chen");
		Thread.sleep(2000);
		destinationKey.sendKeys(Keys.ARROW_DOWN);
		destinationKey.sendKeys(Keys.ENTER);
		driver.close();
	}

}
