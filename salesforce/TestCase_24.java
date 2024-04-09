package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_24 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		logintosalesforce();
		LeadTab();
}
	static void logintosalesforce() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("roshni@patel.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Pankti123");
		WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
	}
	static void LeadTab()
	{
		WebElement lead=driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		lead.click();
		WebElement newbtn=driver.findElement(By.xpath("//input[@name='new']"));
		newbtn.click();
	WebElement lastname=driver.findElement(By.id("name_lastlea2"));
	lastname.sendKeys("ABCD");
	WebElement company=driver.findElement(By.id("lea3"));
	company.sendKeys("ABCD");
	WebElement save=driver.findElement(By.xpath("//input[@title='Save'] "));
	save.click();
	System.out.println("new lead saved and the newly created lead view page opened");
		
		
	
	
	
	
	
	}
}
