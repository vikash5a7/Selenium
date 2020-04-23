package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Webdriver;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Webdriver.webdriver("http://spicejet.com");
		driver.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(2000L);

		/*
		 * int i=1;
		 * 
		 * while(i<5)
		 * 
		 * {
		 * 
		 * driver.findElement(By.id("hrefIncAdt")).click();//4 times
		 * 
		 * i++;
		 * 
		 * }
		 */

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		for (int i = 1; i < 5; i++)

		{

			driver.findElement(By.id("hrefIncAdt")).click();

		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
