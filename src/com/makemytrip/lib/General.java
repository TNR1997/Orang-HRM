package com.makemytrip.lib;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.makemytrip.utaility.Log;

public class General extends Global {
	WebDriver driver;
	public void openapplication() {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver.navigate().to(url);
		Reporter.log("Application opened");
		Log.info("Applicationopened");
		
	}
	public void booking_trian() throws Exception
	{
	
		driver.findElement(By.xpath(from)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(fromtb)).sendKeys("hyde");
		Thread.sleep(2000);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath(fromsughyd)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(to)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(totb)).sendKeys("visa");
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath(tosugvskp)).click();
		Thread.sleep(2000);

		
		
		
		
		
	}
		
			
		
	

}

