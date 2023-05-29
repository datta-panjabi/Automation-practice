package automationday1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automationbasicprogram 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Datta\\OneDrive\\Desktop\\chromedriver.exe");
		System.out.println("browser has opend");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		 System.out.println(driver.getCurrentUrl());
		 driver.quit();
		 
//		if(getCurrentUrl() ="https://www.facebook.com/")
//		{
//			System.out.println("Url is correct");
//		}
//		else
//		{
//			System.out.println("Url is Wrong");
//		}
		
	}

}
