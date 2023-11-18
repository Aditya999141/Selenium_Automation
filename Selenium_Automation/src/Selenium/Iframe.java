package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				 
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		List<WebElement> fram = driver.findElements(By.tagName("iframe"));
		System.out.println("Total Number Of Frames Presented On Screen is " + fram.size());
		
		for(int i=0;i<=fram.size();i++)
		{
			driver.switchTo().frame(i);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[text()='privacy policy']")).click();
		}
		//driver.findElement(By.xpath("//a[contains(text(),'privacy policy')]")).click();
		
		
	}

}