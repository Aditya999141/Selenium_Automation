package Selenium;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Open_Fb 
{
	
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win32\\chromedriver.exe");		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
					
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aditya");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bandgar");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9422999141");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("Whirpol@1860210");

		
		
		/* 
		List<WebElement> day= driver.findElements(By.xpath("//select[@aria-label='Day']/option"));
		System.out.println(day.size());
		day.get(3).click();
		
		List<WebElement> month= driver.findElements(By.xpath("//select[@aria-label='Month']/option"));
		System.out.println(month.size());
		month.get(4).click();
		
		List<WebElement> year= driver.findElements(By.xpath("//select[@aria-label='Year']/option"));
		System.out.println(year.size());
		year.get(33).click();
		*/
		
		
		
	 	WebElement Bdate=driver.findElement(By.xpath("//select[@id='day']"));
		
		WebElement Bmonth=driver.findElement(By.xpath("//select[@id='month']"));
		
		WebElement Byear=driver.findElement(By.xpath("//select[@id='year']"));
		
		Select day =new Select(Bdate);
		Select month =new Select(Bmonth);
		Select year =new Select(Byear);
		
		day.selectByValue("4");
		month.selectByValue("5");
		year.selectByValue("1990");
		
		WebElement female =driver.findElement(By.xpath("//input[@value='1']"));
		female.isDisplayed();
		female.isEnabled();
		female.isSelected();
		//female.click();
		System.out.println(female.isDisplayed());
		System.out.println(female.isEnabled());
		System.out.println(female.isSelected());
		WebElement male =driver.findElement(By.xpath("//input[@value='2']"));
		male.isDisplayed();
		male.isEnabled();
		male.isSelected();
		male.click();
		System.out.println(male.isDisplayed());
		System.out.println(male.isEnabled());
		System.out.println(male.isSelected());
		
		WebElement submit =driver.findElement(By.xpath("//button[@name='websubmit']"));
		submit.click();
		//driver.close();
	

		
		
		
		/*
		WebElement daysEle= driver.findElement(By.xpath("//select[@id='day']"));
		WebElement monthsEle= driver.findElement(By.xpath("//select[@aria-label='Month']"));
		WebElement yearsEle= driver.findElement(By.xpath("//select[@aria-label='Year']"));
		
	
		/*Select day=new Select(daysEle);
		List<WebElement> days=day.getOptions();
		System.out.println("Total Days Are " + days.size());
		
		Select month =new Select(monthsEle);
		List<WebElement> months=month.getOptions();
		System.out.println("Total Months Are " + months.size());
		
		Select year = new Select(yearsEle);
		List<WebElement> years=year.getOptions();
		System.out.println("Total Years Are " + years.size());
		
		
		for(int d=0;d<days.size();d++)
		{
			
			if(d==3)
			{
				for(int m=0;d<months.size();m++)
				{
					if(m==4)
					{
						for(int y=0;y<years.size();y++)
						{
							if(y==33)
							{
								days.get(d).click();
								months.get(m).click();
								years.get(y).click();
								break;
							}
							
						}
						
					}
					
				}
				
			}
			
			
		}
	
		*/	


	}
		
			
		
}
		
