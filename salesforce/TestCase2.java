package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class TestCase2 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		logintosalesforce();
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
		WebElement login=driver.findElement(By.id("Login"));
	//	WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
		Thread.sleep(3000);
		//driver.close();
		WebElement Hometab=driver.findElement(By.xpath("//a[@title='Home Tab']"));
		//WebElement Hometab=driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
		if(Hometab.isDisplayed()) {
			System.out.println("Login successful. Test pass");
		}
		else {
			System.out.println("Login failed, Test fail");
		}
		driver.close();
	}
	
}

