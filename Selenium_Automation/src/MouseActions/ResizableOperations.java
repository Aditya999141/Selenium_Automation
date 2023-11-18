package MouseActions;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.*;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



/**
 * 
 */
public class ResizableOperations
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Actions act = new Actions(driver);
		
		
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/resizable/");


		
		List<WebElement> frame = driver.findElements(By.tagName("iFrame"));
		
		System.out.println("Total Numbers OF Frames Are Presented On Screen is = " + frame.size());
		
		driver.switchTo().frame(0);
		
		WebElement resize = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		
		
		act.moveToElement(resize).dragAndDropBy(resize, 100, 90).release().build().perform();
		
				
		jse.executeScript("window.scrollBy(0,25000)");
		//Thread.sleep(1000);
		
	}

}
