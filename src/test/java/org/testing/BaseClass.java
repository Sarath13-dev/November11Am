package org.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	static WebDriver driver;
	
	public static void launchBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		System.out.println("test work carried out by Dev");
		System.out.println("work done by perf");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	public static void entertText(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public static void clickButton(WebElement element) {
		element.click();
	}
	
	
	
}
