package org.maven.MavenProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) throws InterruptedException, IOException  { 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\91729\\eclipse-workspace\\MavenProject\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 TakesScreenshot tk =(TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dec =new File("C:\\Image\\Facebook.png");
		FileUtils.copyFile(src, dec);
}}
