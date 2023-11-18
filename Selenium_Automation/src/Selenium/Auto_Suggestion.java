package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion {

	public static void main(String[] args) throws Exception 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("Harshada Jangam");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		

	}

}
