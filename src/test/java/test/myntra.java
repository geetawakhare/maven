package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class myntra {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver= new ChromeDriver();
	  Thread.sleep(1000);
	  driver.get("https://www.myntra.com/");
	  driver.close();
  }
}
