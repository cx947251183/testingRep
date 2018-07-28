package com.selenium.elementOperate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.utils.DriverUtils;

public class TestMouseOperate1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("browser.type", "Chrome");
		WebDriver driver=DriverUtils.getDriver();
		driver.get("http://localhost:5555/ecshop/admin");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("caoxing");
		driver.findElement(By.name("password")).sendKeys("1992ican,.");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("menu-frame");//切换到“menu-frame”
		driver.findElement(By.partialLinkText("商品列表")).click();
		Thread.sleep(2000);
//		driver.switchTo().defaultContent();
		driver.switchTo().frame("header-frame");
		Actions actions=new Actions(driver);
//	    actions.moveToElement(driver.findElement(By.partialLinkText("个人设置"))).pause(8000).perform();
//	    actions.moveToElement(driver.findElement(By.linkText("退出"))).click().perform();
	    actions.moveToElement(driver.findElement(By.partialLinkText("个人设置")))
	    .moveToElement(driver.findElement(By.linkText("退出"))).click().perform();
	    Thread.sleep(5000);
	    driver.quit();		
		

	}

}
