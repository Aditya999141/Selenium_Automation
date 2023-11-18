package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownAndRadioButton
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win32\\chromedriver.exe");		
		WebDriver dr = new ChromeDriver();
		
		
		dr.navigate().to("https://www.facebook.com/");
		//dr.findElement(By.xpath("//a[@role='button'][@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		//dr.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aditya");
		List<WebElement> elements = dr.findElements(By.tagName("button"));
		//System.out.println(el.getText());
		//dr.findElement(By.name("))
		//dr.close();
		
		//List<WebElement> elements = dr.findElements(By.tagName("button"));
		
		System.out.println("There ara total buttons are present on page is " + elements.size());
		
		for ( WebElement element : elements)
		{
			System.out.println(element.getText());
		}
	}

}
