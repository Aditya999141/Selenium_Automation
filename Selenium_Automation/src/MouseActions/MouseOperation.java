package MouseActions;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class MouseOperation
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/flipkart-elec-big-dussehra-sale-store?fm=neo%2Fmerchandising&iid=M_eff51e16-496b-4f5d-83d8-2092f7b6148d_1_FBB4FBSRQIC6_MC.8TVKUWT87M16&otracker=hp_rich_navigation_3_1.navigationCard.RICH_NAVIGATION_Electronics_8TVKUWT87M16&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L0_view-all&cid=8TVKUWT87M16");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(3000);
		
		WebElement Electonics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		// Mouse Simulation using actions class
		
		Actions act = new Actions(driver);
		
		// Mouse hover to particular WebElement
		Thread.sleep(3000);
		act.moveToElement(Electonics).build().perform();
		
		//right click on particular WebElement
		Thread.sleep(3000);
		act.contextClick(Electonics).build().perform();
		
		//release the selection
		
		act.release(Electonics).build().perform();
		
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		WebElement HomeandFurniture = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		Thread.sleep(3000);
			
		act.sendKeys(HomeandFurniture, Keys.ENTER).build().perform();
		
		
		
		
	}

}
