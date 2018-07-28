package com.selenium.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestAddDataProvider {
  @DataProvider(name="shareData")
  public Object[][] data() {
    return new Object[][] {
      new Object[] { 1, 2,3 },
      new Object[] { 2, 3,4 },
      new Object[] { 2, 3,4 },
    };
  }
}
