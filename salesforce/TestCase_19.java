package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_19 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		logintosalesforce();
		OpportunitiesTab();
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
		
		WebElement Interval=driver.findElement(By.id("quarter_q"));
		Select summary=new Select(Interval);
		summary.selectByVisibleText("Current and Next FQ");
		
		WebElement Include=driver.findElement(By.id("open"));
		Select opp=new Select(Include);
		opp.selectByVisibleText("Open Opportunities");
		
		WebElement runreport=driver.findElement(By.xpath("//input[@value='Run Report']"));
		runreport.click();
		System.out.println("Report Page with the Opportunities that satisfies the search criteria displayed.");
		
		
		
}}
