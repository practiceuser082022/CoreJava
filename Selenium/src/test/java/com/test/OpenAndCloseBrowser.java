package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenAndCloseBrowser {
	

  @Test
  public void openFirefoxAndClose() {
	  
	  
	  WebDriverManager.firefoxdriver().setup();
	  
	  WebDriver webDriver=new FirefoxDriver();
	  
	  webDriver.get("https://www.linkedin.com/");
	 	  
	  webDriver.close();
	  
  }
  
	
  @Test
  public void openChromeAndClose() {
	  
	  
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver webDriver=new ChromeDriver();
	  
	  webDriver.get("https://www.google.com/");
	 	  
	  webDriver.close();
	  
  }
  
  @Test
  public void openEdgeAndClose() {
	  
	  
	  WebDriverManager.edgedriver().setup();
	  
	  WebDriver webDriver=new EdgeDriver();
	  
	  webDriver.get("https://www.facebook.com/");
	 	  
	  webDriver.close();
	  
  }
  
}
