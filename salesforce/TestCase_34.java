package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_34 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		logintosalesforce();
		editprofie();
	
		
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
	static void editprofie() throws InterruptedException {
		WebElement icon=driver.findElement(By.id("moderatorMutton"));
		icon.click();
driver.findElement(By.xpath("//a[@title='Edit Profile']")).click();		
		

	//Thread.sleep(2000);

//	WebElement Frame=driver.findElement(By.xpath("//iframe[@title='sessionserver']"));
//	driver.switchTo().frame(Frame);
	Thread.sleep(2000);
		WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
		lastname.clear();
		lastname.sendKeys("Abn");
		Thread.sleep(2000);
		WebElement savebtn=driver.findElement(By.xpath("//input[@value='Save All']"));
		savebtn.click();
	}
}
