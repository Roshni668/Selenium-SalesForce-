package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_26 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		logintosalesforce();
		ContactTab();
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
	static void ContactTab()
	{
		WebElement contact=driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
		contact.click();
		WebElement newview=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		newview.click();
		WebElement viewname=driver.findElement(By.id("fname"));
		viewname.sendKeys("Patel");
		WebElement uniqename=driver.findElement(By.id("devname"));
		uniqename.sendKeys("231");
		WebElement save=driver.findElement(By.xpath("//input[@title='Save'] "));
		save.click();
		System.out.println("Contacts Home page is opened. Created View name is displayed ");
		
		
		
		
		
		
}
}