package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_16 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		logintosalesforce();
		OpportunitiesTab();
		newOpportunitie();
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
	static void OpportunitiesTab()
	{
		WebElement opportunity=driver.findElement(By.xpath("//a[@title='Opportunities Tab']"));
		opportunity.click();
	}
	static void newOpportunitie() throws InterruptedException
	{
		WebElement newopp=driver.findElement(By.xpath("//input[@value=' New ']"));
		newopp.click();
		
	WebElement oppname=driver.findElement(By.id("opp3"));
	oppname.sendKeys("Opportunity2");
	
	WebElement accname = driver.findElement(By.id("opp4"));
	accname.sendKeys("Grand Hotels & Resorts Ltd");
	WebElement closedate= driver.findElement(By.id("opp9"));
	closedate.click();
	WebElement date= driver.findElement(By.className("calToday"));
	date.click();
	
	WebElement stagedrpdwn= driver.findElement(By.id("opp11")); 
	Select stage=new Select(stagedrpdwn);
	stage.selectByVisibleText("Prospecting");
	WebElement source=driver.findElement(By.id("opp17"));
	source.click();
	WebElement search=driver.findElement(By.xpath("//img[@title='Primary Campaign Source Lookup (New Window)']"));
	search.click();
	WebElement lookup=driver.findElement(By.xpath("//input[@placeholder='Search...']"));
	lookup.sendKeys("*a*");
	Thread.sleep(2000);
//	WebElement go=driver.findElement(By.xpath("//input[@class='btn']"));
//	go.click();
//	Thread.sleep(2000);
//	WebElement campaignname=driver.findElement(By.linkText("Webinar"));
//	campaignname.click();
	Thread.sleep(2000);
	WebElement save=driver.findElement(By.xpath(" //input[@name='save']"));
	save.click();
	System.out.println("New Opportunity page is displayed with Opportunity details.");
	
	// camping source is not working .
	
	
	
	
	

	}
}
