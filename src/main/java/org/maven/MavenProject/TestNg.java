package org.maven.MavenProject;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg {
	WebDriver driver;
	@BeforeClass
	public  void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\91729\\\\eclipse-workspace\\\\MavenProject\\\\driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
		System.out.println("Launch");
	}
	
	@BeforeMethod
	public void starttime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
		WebElement e =driver.findElement(By.id("email"));
		e.sendKeys("pavithran");
		Assert.assertEquals("pavithran",e.getAttribute("value"));
		WebElement p = driver.findElement(By.id("pass"));
		p.sendKeys("pranav");
		Assert.assertEquals("pranav",p.getAttribute("value"));
	}
	@AfterMethod
	public void endtime() {
		Date d = new Date();
		System.out.println(d);
	}  
	@Test
	public void test2() {
		driver.findElement(By.id("loginbutton")).click();
		
	}
	

	@AfterClass
	public void closeBrowser()
	{
		System.out.println("close");
	}

}
