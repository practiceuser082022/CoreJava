package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetSiteDetailsTest {
	@Test
	public void f() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		List<WebElement> list = driver.findElements(By.tagName("input"));
		System.out.println(list.size());

		String windowId = driver.getWindowHandle();
		System.out.println(windowId);

//	  String title=driver.getTitle();
//	  System.out.println(title);
//	  
//	  String url=driver.getCurrentUrl();
//	  System.out.println(url);
//	  
//	  
//	  String pageSource=driver.getPageSource();
//	  System.out.println(pageSource);

	}
}
