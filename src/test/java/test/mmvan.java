package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mmvan {
  @Test
  public void mav() throws InterruptedException {
	  WebDriver driver= new ChromeDriver();
	  Thread.sleep(1000); 
	  driver.get("https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml/5.2.3");

  }
}
