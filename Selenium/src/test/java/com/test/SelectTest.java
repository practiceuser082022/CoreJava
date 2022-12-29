package com.test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectTest {
  @Test
  public void f() {
	  
 WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
	 
	  
	  //driver.switchTo().frame("iframeResult");
	  //driver.switchTo().frame(1);
	  
	 WebElement e= driver.findElement(By.xpath("//*[@id='iframeResult']"));
	 
	  driver.switchTo().frame(e);
	  
	  boolean flag=driver.findElement(By.xpath("//*[@value='Submit']")).isDisplayed();
	  
	  driver.switchTo().defaultContent();
	  
	  boolean flag1=driver.findElement(By.id("runbtn")).isDisplayed();
	  assertTrue(flag1);
	  
  }
}
