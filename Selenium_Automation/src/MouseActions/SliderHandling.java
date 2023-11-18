package MouseActions;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderHandling
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/slider/#default");
		
		List<WebElement> frame=driver.findElements(By.tagName("iframe"));
		
		System.out.println("Total Numbers OF Frames Are Presented On Screen is = " + frame.size());
		
		driver.switchTo().frame(0);
		
		WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
				
		Actions act = new Actions(driver);
		
		act.moveToElement(slider).dragAndDropBy(slider, 300, 0).build().perform();
	}

}
