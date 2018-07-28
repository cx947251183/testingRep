package com.selenium.elementOperate;

import java.awt.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.DriverUtils;

public class TestWindowSwitch1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("browser.type", "firefox");
		WebDriver driver = DriverUtils.getDriver();
		driver.get("http://bbs.51testing.com/forum.php");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("软件测试新手上路")).click();
		Thread.sleep(3000);
		String firsthandle= driver.getWindowHandle();
		Set<String> firstWindowsSet = driver.getWindowHandles();
		List<WebElement> list=driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]"));
		

	}

}
