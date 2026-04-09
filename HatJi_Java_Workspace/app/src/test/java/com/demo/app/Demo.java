package com.demo.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		WebDriver drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.get("https://www.saucedemo.com");
		
		WebElement usrtxtbox = drv.findElement(By.id("user-name"));
		usrtxtbox.sendKeys("standard_user");
		
		WebElement pwdtxtbox = drv.findElement(By.id("password"));
		pwdtxtbox.sendKeys("secret_sauce");
		
		WebElement loginbtn = drv.findElement(By.id("login-button"));
		loginbtn.click();
				
		
		
	}
}
