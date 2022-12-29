package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertTest {
	@Test
	public void f() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//*[contains(text(),'Click for JS Alert')]")).click();

		Alert a = driver.switchTo().alert();

		String textmessage = a.getText();
		System.out.println(textmessage);
		a.accept();

		driver.findElement(By.xpath("//*[contains(text(),'Click for JS Confirm')]")).click();
		a.dismiss();

		driver.findElement(By.xpath("//*[contains(text(),'Click for JS Prompt')]")).click();
		a.sendKeys("Hello Selenium");
		a.accept();

	}
}
