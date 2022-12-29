package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
  @Test
  public void loginTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  WebElement userName=driver.findElement(By.name("username"));
	  userName.sendKeys("Admin");
	  
	  WebElement password=driver.findElement(By.name("password"));
	  password.sendKeys("admin123");
	  
	  WebElement loginBtn=driver.findElement(By.tagName("button"));
	  loginBtn.click();
	  
  }
  
  @Test
  public void loginTestEdge() {
	  
	  WebDriverManager.edgedriver().setup();
	  
	  WebDriver driver=new EdgeDriver();
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");	  
	  
	  driver.findElement(By.name("password")).sendKeys("admin123");	 
	  
	  driver.findElement(By.tagName("button")).click();
	  
  }
}
