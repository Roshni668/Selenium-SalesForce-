package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase5 {
	static WebDriver driver;
	 public static void main(String[] args) throws InterruptedException {
			logintosalesforce();
			RoshniPatel();
		}
	 static void logintosalesforce() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://login.salesforce.com/");
		 WebElement username=driver.findElement(By.id("username"));
			username.sendKeys("roshni@patel.com");
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Pankti123");
			//driver.findElement(By.id("rememberUn")).click();
			WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
			login.click();
			Thread.sleep(3000);
}
	 static void  RoshniPatel() throws InterruptedException {
			
			WebElement RoshniPatel = driver.findElement(By.id("userNavLabel"));
			Actions action = new Actions(driver);
			action.moveToElement(RoshniPatel).build().perform();
			RoshniPatel.click();
			//System.out.println("User menu drop down available");
			Thread.sleep(2000);
			//a[contains(text(),'My Profile')]
		boolean myProfile = driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).isDisplayed();
		boolean mySetting = driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).isDisplayed();
		boolean developer = driver.findElement(By.xpath("//a[contains(text(),'Developer Console')]")).isDisplayed();
		boolean switchto = driver.findElement(By.xpath("//a[@title='Switch to Lightning Experience']")).isDisplayed();
		boolean logout = driver.findElement(By.xpath("//a[@title='Logout']")).isDisplayed();
			Thread.sleep(2000);
		System.out.println("My profile displayed:"+myProfile);
		System.out.println("My setting displayed :"+mySetting);
		System.out.println("Developer console displayed :"+developer);
		System.out.println("Switch to Lightning Experience displayed :"+switchto);
		System.out.println("Logout displayed :"+logout);
	 }}
