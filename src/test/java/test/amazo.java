package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.driver.chrome", "C:\\New folder\\Chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.amazon.in/");
		driver.close();
	}

}
