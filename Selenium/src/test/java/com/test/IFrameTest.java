package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrameTest {
  @Test
  public void f() {
	  
 WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver=new ChromeDriver();
	  
//	  driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
//	  //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	  
//	  driver.switchTo().frame("iframeResult");
//	  
//	  WebElement element=driver.findElement(By.id("cars"));
//	  
//	  Select s=new Select(element);
//	  element.click();
//	  
//	  List<WebElement> list=s.getOptions();
//	  
//	  System.out.println(list.size());
//	  
//	  for(WebElement e: list) {
//		  
//		  System.out.println(e.getText());
//	  }
//	  
//	 
//	  System.out.println(s.isMultiple());  // false
//	  
//	  // s.selectByIndex(1);
//	  // s.selectByValue("audi");
//	  s.selectByVisibleText("Opel");
//	  
//	  WebElement selectedValue=s.getFirstSelectedOption();
//	  System.out.println(selectedValue.getText());
//	  
	  
	  driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	  
	  driver.switchTo().frame("iframeResult");
	  
	  WebElement element=driver.findElement(By.id("cars"));
	  Select s=new Select(element);
	  System.out.println(s.isMultiple());  // true
	  
	  s.selectByIndex(1);
	  s.selectByValue("opel");
	  s.selectByVisibleText("Audi");
	  
//	  s.deselectByIndex(1);
//	  s.deselectByValue("opel");
//	  s.deselectByVisibleText("Audi");
	  
	 // s.deselectAll();
	  
	  
	  List<WebElement> list=s.getAllSelectedOptions();
	  
	  System.out.println(list.size());
	  
	  for(WebElement e: list) {
		  
		  System.out.println(e.getText());
  }
	  
  }
}
