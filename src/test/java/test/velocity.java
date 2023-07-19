package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class velocity {
  @Test
  public void velc() throws InterruptedException {
	  
	  WebDriver driver= new ChromeDriver();
	  Thread.sleep(1000);
	  driver.get("https://vctcpune.com/");
	  System.out.println("hii i am velocity");
  }
}
