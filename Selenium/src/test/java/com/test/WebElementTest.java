package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementTest {
  @Test
  public void f() {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver=new ChromeDriver();
	 
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  
	  driver.findElement(By.name("username")).sendKeys("Admin1");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.name("username")).clear();
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  
	  List<WebElement> list=driver.findElements(By.tagName("div"));
	  System.out.println(list.size());
	  
	  String attribute=driver.findElement(By.name("username")).getAttribute("placeholder");
	  System.out.println(attribute);
	  
	  String cssvalue=driver.findElement(By.tagName("button")).getCssValue("font-size");
	  
	  System.out.println(cssvalue);
	  
	  
	  Point p=driver.findElement(By.tagName("button")).getLocation();
	  System.out.println(p.x);
	  System.out.println(p.y);
	  
	  
	  Dimension d=driver.findElement(By.tagName("button")).getSize();
	  System.out.println(d.height);
	  System.out.println(d.width);
	  
	  
	  String tname=driver.findElement(By.name("username")).getTagName();
	  System.out.println(tname);
	  
	  String text=driver.findElement(By.tagName("button")).getText();
	  
	  System.out.println(text);
	  
	  driver.get("https://the-internet.herokuapp.com/checkboxes");
	  
	  boolean flag1=driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).isSelected();
	  System.out.println(flag1);
	  
	  boolean flag2=driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).isSelected();
	  System.out.println(flag2);
	  
	  
	  boolean flag3=driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).isEnabled();
	  System.out.println(flag3);
	  
	  boolean flag4=driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).isDisplayed();
	  System.out.println(flag4);
	  
  }
}
