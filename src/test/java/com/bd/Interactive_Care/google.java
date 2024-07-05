package com.bd.Interactive_Care;

import org.testng.annotations.Test;

public class google extends BaseDriver {
	
	public String baseUrl = "https://www.google.com/";
	
	@Test
	public void googleTest() throws InterruptedException{
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		if(driver.getTitle().contains("Google")) {
			
			System.out.println(driver.getTitle());
			
		}else {
			
			System.out.println("Title not match");
			
		}
		
		System.out.println(driver.getCurrentUrl());
			
		Thread.sleep(5000);
		
	}
}