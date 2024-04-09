package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_11 {static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	logintosalesforce();
	accounts();
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
	
	WebElement Createnewview=driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
	Createnewview.click();
	Thread.sleep(2000);
	WebElement viewname=driver.findElement(By.id("fname"));
	viewname.sendKeys("Roshni Patel");
	Thread.sleep(2000);
	WebElement uniqueviewname=driver.findElement(By.xpath("//input[@id='devname']"));
	uniqueviewname.sendKeys("123");
	//Thread.sleep(2000);
	WebElement save=driver.findElement(By.xpath("//input[@value=' Save ']"));
	save.click();
	System.out.println("Newely added View displayed in the account view list");
	}

}
 