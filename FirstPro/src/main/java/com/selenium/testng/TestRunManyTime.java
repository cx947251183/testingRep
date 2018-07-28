package com.selenium.testng;

import org.testng.annotations.Test;

public class TestRunManyTime {
	static int t=1;
  @Test(invocationCount=5,threadPoolSize=1)//重复多次运行
  public void f() throws Exception {
	  System.out.println("运行第"+t+"次");
	  t++;
	  Thread.sleep(5000);
  }
}
