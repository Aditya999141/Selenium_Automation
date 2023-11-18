package MouseActions;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement Oslo = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement Stockholm = driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement Washington = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement Copenhagen = driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement Seoul = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement Rome = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement Madrid = driver.findElement(By.xpath("//div[@id='box7']"));
		
		WebElement Norway = driver.findElement(By.xpath("//div[@id='box101']"));
		WebElement Sweden = driver.findElement(By.xpath("//div[@id='box102']"));
		WebElement United_States = driver.findElement(By.xpath("//div[@id='box103']"));
		WebElement Denmark = driver.findElement(By.xpath("//div[@id='box104']"));
		WebElement South_Korea = driver.findElement(By.xpath("//div[@id='box105']"));
		WebElement Italy = driver.findElement(By.xpath("//div[@id='box106']"));
		WebElement Spain = driver.findElement(By.xpath("//div[@id='box107']"));
		
		
		
		/*
		
		Thread.sleep(3000);
		act.clickAndHold(Oslo).moveToElement(Norway).release().build().perform();
		Thread.sleep(3000);
		act.clickAndHold(Stockholm).moveToElement(Sweden).release().build().perform();
		Thread.sleep(3000);
		act.clickAndHold(Washington).moveToElement(United_States).release().build().perform();
		Thread.sleep(3000);
		act.clickAndHold(Copenhagen).moveToElement(Denmark).release().build().perform();
		Thread.sleep(3000);
		act.clickAndHold(Seoul).moveToElement(South_Korea).release().build().perform();
		Thread.sleep(3000);
		act.clickAndHold(Rome).moveToElement(Italy).release().build().perform();
		Thread.sleep(3000);
		act.clickAndHold(Madrid).moveToElement(Spain).release().build().perform();
		Thread.sleep(3000);
		
		*/
		
		// 2 Way
		
		
		act.dragAndDrop(Oslo, Norway).build().perform();
			
		act.dragAndDrop(Oslo, Norway).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(Stockholm, Sweden).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(Washington, United_States).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(Copenhagen, Denmark).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(Seoul, South_Korea).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(Rome, Italy).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(Madrid, Spain).build().perform();
		Thread.sleep(3000);
		/*
		Capitals	CPTL_Id	Countryt		CNTRY_Id
		Oslo		box1	Norway			box101
		Stockholm	box2	Sweden			box102
		Washington	box3	United States	box103
		Copenhagen	box4	Denmark			box104
		Seoul		box5	South_Korea		box105
		Rome		box6	Italy			box101
		Madrid		box7	Spain			box107
		*/
		
		driver.quit();

	}

}
