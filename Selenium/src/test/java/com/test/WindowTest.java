package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowTest {
  @Test
  public void f() {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver=new ChromeDriver();
	  //driver.manage().window().maximize();
	 
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  driver.manage().window().fullscreen();
	  
	 
  }
}
