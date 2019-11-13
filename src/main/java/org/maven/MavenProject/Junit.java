package org.maven.MavenProject;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Junit 
{
	static WebDriver driver;
	@BeforeClass
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91729\\eclipse-workspace\\MavenProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
		System.out.println("Launch");
	}
	
	@Before
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
	@After
	public void endtime() {
		Date d = new Date();
		System.out.println(d);
	}  
	@Test
	public void test2() {
		driver.findElement(By.id("loginbutton")).click();
		
	}
	

	@AfterClass
	public static void closeBrowser()
	{
		System.out.println("close");
	}
}
