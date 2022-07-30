//package SeleniumCommands;
package com.mindtree.seleniumclass;

import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tide.com/en-us");
		//driver.manage().window().maximize();		
		
		driver.findElement(By.xpath("//*[@id=\"site-content\"]/div/div/div/div/div[3]/div/div/div/div[2]/div/div/div/div[2]/div/h4")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div[1]/a/div/picture/img")).click();
		Thread.sleep(2000);
	driver.navigate().to("https://tide.com/en-us");
	Thread.sleep(2000);
		//driver.findElement(By.linkText("")).click();
		driver.findElement(By.xpath("//*[@id=\"site-header\"]/div[2]/div/div/div/form/div/input")).sendKeys("liquids");
		driver.navigate().to("https://tide.com/en-us");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		driver.navigate().to("https://tide.com/en-us");
		Thread.sleep(2000);
		
	}

}
