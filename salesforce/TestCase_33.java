package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_33 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		logintosalesforce();
		RoshniPatel();
		
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
		WebElement Hometab=driver.findElement(By.xpath("//a[@title='Home Tab']"));
		Hometab.click();
		WebElement namelink=driver.findElement(By.className("currentStatusUserName"));
		namelink.click();
	}
static void  RoshniPatel() throws InterruptedException {
	
	WebElement RoshniPatel = driver.findElement(By.id("userNavLabel"));
	Actions action = new Actions(driver);
	action.moveToElement(RoshniPatel).build().perform();
	RoshniPatel.click();
	Thread.sleep(2000);
	String homename	="https://patelcom27-dev-ed.develop.my.salesforce.com/_ui/core/userprofile/UserProfilePage?tab=sfdc.ProfilePlatformFeed";
	String profilename="https://patelcom27-dev-ed.develop.my.salesforce.com/_ui/core/userprofile/UserProfilePage?tab=sfdc.ProfilePlatformFeed";
	driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
if(homename==profilename)
{
	System.out.println("This page is same as the 'My Profile' page.");
	}
else {
	System.out.println("page is not same");
}
	}
}
