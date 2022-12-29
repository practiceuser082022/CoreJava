package com.test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesTest {
  @Test
  public void f() {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://testproject.io/");
	  
	  String parentWindow=driver.getWindowHandle();
	  driver.findElement(By.linkText("Login")).click();
	  Set windowHandles=driver.getWindowHandles();
	  
	  Iterator<String> itr=windowHandles.iterator();
	  
	  while(itr.hasNext()) {
		  String childWindow=itr.next();
		  if(!parentWindow.equals(childWindow)) {
			  driver.switchTo().window(childWindow);
		  }
	 }
	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  driver.findElement(By.id("username")).sendKeys("hello@gmail.com");
	  
	  
	//  driver.close();
	  
	  driver.quit();
  }
}
