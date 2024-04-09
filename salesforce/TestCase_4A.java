package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_4A {
	//id.forgot_password_link
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		forgotpassword();
	}
	
	static void forgotpassword() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
		WebElement passwordResetMessage=driver.findElement(By.id("header"));
		 if (passwordResetMessage.getText().contains("Forgot Your Password")) {
	            System.out.println("Password reset message page displayed. Test Passed!");
	        } else {
	            System.out.println("Password reset message page not displayed. Test Failed!");
	        }
		Thread.sleep(3000);
		//System.out.println("Forgot Your Password page displayed");
	WebElement forgetusername=driver.findElement(By.id("un"));
	forgetusername.sendKeys("roshni@patel.com");
	driver.findElement(By.id("continue")).click();
	Thread.sleep(2000);
		driver.close();
	}

}
