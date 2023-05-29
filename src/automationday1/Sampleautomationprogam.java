package automationday1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleautomationprogam 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Datta\\OneDrive\\Desktop\\chromedriver.exe");
           WebDriver driver = new ChromeDriver();
           driver.get("https://www.facebook.com/");
           driver.manage().window().maximize();
           driver.navigate().refresh();
           driver.navigate().to("https://www.google.com/");
           Thread.sleep(5000);
           driver.navigate().back();
           driver.navigate().forward();
           System.out.println(driver.getCurrentUrl());
           System.out.println(driver.getTitle());
           Dimension d =new Dimension(200,300);
           driver.manage().window().setSize(d);
           Thread.sleep(5000);
           Point p = new Point(300,400); 
           driver.manage().window().setPosition(p);
           driver.quit();
           
         
		
	}

}
