package automationpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookautomation
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Datta\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		
//		Thread.sleep(3000);
//		String actualurl ="https://www.facebook.com/";
//	    String currenturl= driver.getCurrentUrl();
//	    if(actualurl.equals(currenturl))
//	    {
//	    	System.out.println("You are on expected url page");
//	    }else
//	    {
//	    	System.out.println("You are in wrong Url page");
//	    }
//	    
//	   WebElement username =driver.findElement(By.id("email"));
//	   username.sendKeys("dattapanjabi0459@gmail.com");
//	   Thread.sleep(3000);
//	   
//	   WebElement password =driver.findElement(By.className("inputtext _55r1 _6luy _9npi"));
//	   username.sendKeys("Datta@12345");
//	   Thread.sleep(3000);
//	   
//	   WebElement lognbtn =driver.findElement(By.id("u_0_5_WY"));
//	   lognbtn.click();
//	   Thread.sleep(50000);
//	   
//	   WebElement forgotpass =driver.findElement(By.linkText("Forgotten password?"));
//	   forgotpass.click();
//	   Thread.sleep(3000);
//	   driver.quit();
//	 
		
		WebElement createnewaccount =driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createnewaccount.click();
      Thread.sleep(4000);
      System.out.println("program run till time");
         driver.quit();

	   
	   
	   
	   

	   
	   
	    
	                 
	   
	   
		
		
		
	}

}
