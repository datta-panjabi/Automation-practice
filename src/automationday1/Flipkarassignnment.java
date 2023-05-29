package automationday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Flipkarassignnment 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Datta\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
//    	System.out.println("15000 timer done-till time code run successfully");

    	WebElement	createbutton=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
    	createbutton.click();
    	//System.out.println("till time code run successfully");
    	Thread.sleep(5000);
    	
    	WebElement	username=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
    	username.sendKeys("Datta");
    	
    	WebElement	lastname=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
    	lastname.sendKeys("Panjabi");
    	
    	WebElement	Email=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input"));
    	Email.sendKeys("7620186149");
    	

//    	WebElement	Remail=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
//    	Remail.sendKeys("dattapanjabi0459@gmail.com");
    	
    	WebElement	Pass=driver.findElement(By.xpath("//*[@id=\"password_step_input\"]"));
    	Pass.sendKeys("Datta@1234");
    	
    	WebElement	date=driver.findElement(By.xpath("(//select[@id=\"day\"]"));
    	date.click();
    	Select s =new Select(date);    	
    	s.selectByIndex(11);
    	
    
    	
    	
    	
    	
    	driver.quit();
    	
		
		
	}

}
