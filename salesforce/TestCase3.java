package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {
 static WebDriver driver;
 public static void main(String[] args) throws InterruptedException {
		logintosalesforce();
		//RoshniPatel();
	}
 static void logintosalesforce() throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.get("https://login.salesforce.com/");
	 WebElement username=driver.findElement(By.id("username"));
		//username.sendKeys("roshni@patel.com");
	 String expectedUsername = "roshni@patel.com";
     username.sendKeys("roshni@patel.com");
     String actualUsername = username.getAttribute("value");
     WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Pankti123");
	WebElement remember=driver.findElement(By.id("rememberUn"));
	remember.click();
		WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
		Thread.sleep(3000);
		if (actualUsername.equals(expectedUsername)) {
            System.out.println("Username displayed correctly. Test Passed!");
        } else {
            System.out.println("Username not displayed correctly. Test Failed!");
        }
		//driver.close();
	 }
 static void  RoshniPatel() throws InterruptedException {
		
		WebElement RoshniPatel = driver.findElement(By.id("userNavLabel"));
		Actions action = new Actions(driver);
		action.moveToElement(RoshniPatel).build().perform();
		RoshniPatel.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		//System.out.println("Username displayed");
		Thread.sleep(2000);
}
}
