package Selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		//List<WebElement> headings = driver.findElements(By.xpath("//table[@class='dataTable']/thead"));//Print Only Headings
		//List<WebElement> compniesName = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td/a"));//Print only companies name
		//List<WebElement> data = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")); Print all rows associated with company	
		//System.out.println("Total companies are " + compniesName.size() );Print only companies count
		
		int column = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th")).size();
		int row = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		
		List<WebElement> col  = driver.findElements(By.xpath("//table[@class='dataTable']/thead"));
		List<WebElement> rw = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		
		System.out.println("Total columns are " + column + " & Total rows are " + row);
		List<WebElement> headings = driver.findElements(By.xpath("//table[@class='dataTable']/thead"));//Print Only Headings
		
		for(WebElement heading : headings)
			
		  
			System.out.print(heading.getText() + " | ");
			
		
		for(WebElement company : rw)
		{
						
		System.out.println(company.getText());
		}
		
			
			driver.close();
		}
		
}
	
	
	

