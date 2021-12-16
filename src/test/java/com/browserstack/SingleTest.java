package com.browserstack;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SingleTest extends BrowserStackJUnitTest {

  @Test
  public void googleTest() throws Exception {
    driver.get("https://www.google.com/ncr");
    WebElement element = driver.findElement(By.name("q"));
    element.sendKeys("BrowserStack");
    element.submit();
    Thread.sleep(5000);

    assertTrue(driver.getTitle().matches("(?i)BrowserStack - Google Search"));
  }

  @Test
  public void browserstackTest() throws Exception {
    driver.get("https://www.browserstack.com/");
    WebElement element = driver.findElement(By.cssSelector(".sign-in-link a"));
    element.click();
    Thread.sleep(5000);
    assertTrue(element.isDisplayed());
  }

  @Test
  public void randomTest1() throws Exception {
    driver.get("https://www.browserstack.com/");
    WebElement element = driver.findElement(By.cssSelector(".sign-in-link a"));
    element.click();
    Thread.sleep(5000);
    assertTrue(element.isDisplayed());
  }

  @Test
  public void randomTest2() throws Exception {
    driver.get("https://www.browserstack.com/");
    WebElement element = driver.findElement(By.cssSelector(".sign-in-link a"));
    element.click();
    Thread.sleep(5000);
    assertTrue(element.isDisplayed());
  }

  @Test
  public void randomTest3() throws Exception {
    driver.get("https://www.browserstack.com/");
    WebElement element = driver.findElement(By.cssSelector(".sign-in-link a"));
    element.click();
    Thread.sleep(5000);
    assertTrue(element.isDisplayed());
  }

  @Test
  public void randomTest4() throws Exception {
    driver.get("https://www.browserstack.com/");
    WebElement element = driver.findElement(By.cssSelector(".sign-in-link a"));
    element.click();
    Thread.sleep(5000);
    assertTrue(element.isDisplayed());
  }

  @Test
  public void randomTest5() throws Exception {
    driver.get("https://www.browserstack.com/");
    WebElement element = driver.findElement(By.cssSelector(".sign-in-link a"));
    element.click();
    Thread.sleep(5000);
    assertTrue(element.isDisplayed());
  }

  @Test
  public void randomTest6() throws Exception {
    driver.get("https://www.browserstack.com/");
    WebElement element = driver.findElement(By.cssSelector(".sign-in-link a"));
    element.click();
    Thread.sleep(5000);
    assertTrue(element.isDisplayed());
  }

  @Test
  public void randomTest7() throws Exception {
    driver.get("https://www.browserstack.com/");
    WebElement element = driver.findElement(By.cssSelector(".sign-in-link a"));
    element.click();
    Thread.sleep(5000);
    assertTrue(element.isDisplayed());
  }

  @Test
  public void sampleTest1() throws Exception {
    driver.get("https://www.browserstack.com/");
    WebElement element = driver.findElement(By.cssSelector(".sign-in-link a"));
    element.click();
    Thread.sleep(5000);
    assertTrue(element.isDisplayed());
  }

  @Test
  public void sampleTest2() throws Exception {
    driver.get("https://www.browserstack.com/");
    WebElement element = driver.findElement(By.cssSelector(".sign-in-link a"));
    element.click();
    Thread.sleep(5000);
    assertTrue(element.isDisplayed());
  }
}
