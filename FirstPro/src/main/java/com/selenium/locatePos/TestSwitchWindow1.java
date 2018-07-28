package com.selenium.locatePos;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.DriverUtils;

public class TestSwitchWindow1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    System.setProperty("browser.type", "firefox");
    WebDriver driver=DriverUtils.getDriver();
    driver.get("http://bbs.51testing.com/forum.php");
//    Thread.sleep(5000);
    driver.findElement(By.partialLinkText("软件测试新手上路")).click();
//    Thread.sleep(1000);
    List<WebElement> list=driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]"));
    list.get(0).findElement(By.xpath("tr/th/a[3]")).click();
    driver.findElement(By.partialLinkText("软件测试新手上路")).click();
    list=driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]"));
    list.get(1).findElement(By.xpath("tr/th/a[3]")).click();
//    System.out.println(driver.findElement(By.cssSelector("a.btn-login.ml1.tb-bg.weight")).getText());
    
    //tbody[contains(@id,'normalthread')][1]//th/a[3]
 // Set是无序的 ，但是唯一的 ，没有重复的 List是有序，但可以重复的
 			Set<String> handles = driver.getWindowHandles();
 			for (String handle : handles) {
 				System.out.println(handle);
 				driver.switchTo().window(handle);
 				Thread.sleep(2000);
 			}
 			for (String handle : handles) {
 				System.out.println(handle);
 				driver.switchTo().window(handle);
 				Thread.sleep(1000);
 				try {
 					if (driver.findElement(By.partialLinkText("测试软件什么比较好用")).isEnabled()) {
 						break;
 					}
 				} catch (Exception e) {
 					// TODO Auto-generated catch block
 					// e.printStackTrace();
 					System.out.println("继续查找！");
 				}
 			}
 	driver.findElement(By.partialLinkText("测试软件什么比较好用")).click();
    Thread.sleep(5000);
//    driver.quit();
	}

}
