package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase_14 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		logintosalesforce();
		accounts();
		accountreport();
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
	static void accounts() throws InterruptedException {
		WebElement Accounts=driver.findElement(By.id("Account_Tab"));
		Accounts.click();
	}
	static void accountreport() throws InterruptedException {
		WebElement lastactivity=driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));
		lastactivity.click();
		WebElement Datefrom=driver.findElement(By.id("ext-gen152"));
		Datefrom.click();
		Thread.sleep(2000);
		WebElement FromToday=driver.findElement(By.id("ext-gen152"));
		FromToday.click();
		
	
		WebElement todaybtnfrom=driver.findElement(By.id("ext-gen276"));
		Thread.sleep(2000);
		todaybtnfrom.click();
		Thread.sleep(1000);
		
		WebElement DateTO=driver.findElement(By.id("ext-gen154"));
		DateTO.click();
		Thread.sleep(2000);
		
		WebElement todaybtnTo=driver.findElement(By.id("ext-gen291"));
		Thread.sleep(2000);
		todaybtnTo.click();
		Thread.sleep(1000);
		
		WebElement save=driver.findElement(By.id("ext-gen49"));
		save.click();
		WebElement Reportname=driver.findElement(By.id("saveReportDlg_reportNameField"));
		Reportname.sendKeys("Accounts");
		
		WebElement reportuniquename=driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']"));
		reportuniquename.sendKeys("124"); 
		// uniqename is must be uniqe everytime then it working
		Thread.sleep(2000);
		WebElement savenrun=driver.findElement(By.id("dlgSaveAndRun"));
		Thread.sleep(2000);
		savenrun.click();
		System.out.println("Report page with details is displayed.");
		}}

