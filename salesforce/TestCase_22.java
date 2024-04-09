package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_22 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		logintosalesforce();
		LeadTab();
		RoshniPatel();
		logintosalesforce();
		LeadTab1();
		
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
		WebElement view=driver.findElement(By.id("fcf"));

		Select mylead= new Select(view);
		mylead.selectByVisibleText("My Unread Leads");
	}
	static void  RoshniPatel() throws InterruptedException {
		
		WebElement RoshniPatel = driver.findElement(By.id("userNavLabel"));
		Actions action = new Actions(driver);
		action.moveToElement(RoshniPatel).build().perform();
		RoshniPatel.click();
		
		Thread.sleep(2000);
		WebElement logout = driver.findElement(By.xpath("//a[@title='Logout']"));
		Thread.sleep(2000);		
		logout.click();
}
	static void LeadTab1()
	{
		WebElement lead=driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		lead.click();
		WebElement go=driver.findElement(By.xpath("//input[@value=' Go! '] "));
		go.click();
		System.out.println("view displayed");
	
	}

}