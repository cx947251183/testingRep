package com.selenium.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestAddParameter1 {
	Calculator calculator;
  @Test(dataProvider = "dp")
  public void Test(int num1, int num2,int expectResult) {
	  calculator.add(num1);
	  calculator.add(num2);
	  int result = calculator.getResult();
	  Assert.assertEquals(result, expectResult);
  }
  @BeforeMethod
  public void beforeMethod() {
	  calculator.clear();
  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, 2,4 },
      new Object[] { 2, 2,4 },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  calculator = new Calculator();
  }

  @AfterClass
  public void afterClass() {
	  calculator=null;
  }

}
