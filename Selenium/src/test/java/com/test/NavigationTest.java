package com.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationTest {
  @Test
  public void f() throws MalformedURLException {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver=new ChromeDriver();
	 
	  driver.get("https://www.google.com/");
	  
	  driver.navigate().to("https://www.facebook.com/");
	  
	  driver.navigate().to(new URL("https://www.linkedin.com/"));
	  
	 
	  driver.navigate().back();
	  
	  driver.navigate().back();
	  
	  driver.navigate().refresh();
	  
	  driver.navigate().forward();
  }
}
