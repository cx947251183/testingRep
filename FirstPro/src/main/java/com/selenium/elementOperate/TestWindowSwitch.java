package com.selenium.elementOperate;

import java.util.List;
import java.util.Set;

import org.apache.xml.serializer.utils.StringToIntTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.utils.DriverUtils;

public class TestWindowSwitch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("browser.type", "firefox");
		WebDriver driver = DriverUtils.getDriver();
		driver.get("http://bbs.51testing.com/forum.php");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("软件测试新手上路")).click();	
		Thread.sleep(3000);
		String firstHandle=driver.getWindowHandle();
//		List<WebElement> list=driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]/tr/th/a[3]"));
//		list.get(0).click();
		List<WebElement> list=driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]"));
		list.get(0).findElement(By.xpath("tr/th/a[3]")).click();
		Thread.sleep(3000);

		driver.findElement(By.partialLinkText("软件测试新手上路")).click();
		Thread.sleep(3000);
		// 以下这一步必须要有，需要重新更新获取一下元素List才可以，因为上面已经动过了，否则获取不到
		list=driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]/tr/th/a[3]"));
		list.get(1).click();

		
		Set<String> windowsSet=driver.getWindowHandles();
		for(String handle:windowsSet) {
			System.out.println(handle);
			driver.switchTo().window(handle);
		}
		driver.switchTo().window(firstHandle);
		driver.findElement(By.partialLinkText("测试人员面试题")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
