package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase7 {static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	logintosalesforce();
	RoshniPatel();
	MySetting();
	Email();
	calander();
}
static void logintosalesforce() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
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
}
static void  RoshniPatel() throws InterruptedException {
		
		WebElement RoshniPatel = driver.findElement(By.id("userNavLabel"));
		Actions action = new Actions(driver);
		action.moveToElement(RoshniPatel).build().perform();
		RoshniPatel.click();
		Thread.sleep(2000);
	}
static void MySetting() throws InterruptedException {
	driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).click();
	WebElement personal=driver.findElement(By.id("PersonalInfo_font"));
	personal.click();
	Thread.sleep(2000);
WebElement loginhistory=driver.findElement(By.id("LoginHistory_font"));
	loginhistory.click();
	WebElement displaytab=driver.findElement(By.id("DisplayAndLayout_font"));
	displaytab.click();
	
	WebElement customizetab=driver.findElement(By.id("CustomizeTabs_font"));
	customizetab.click();
	Thread.sleep(2000);
	WebElement contentdropdown=driver.findElement(By.xpath("//select[@id='p4']"));
	Select content=new Select(contentdropdown);
	Thread.sleep(2000);
	content.selectByVisibleText("Salesforce Chatter");
	Thread.sleep(3000);
	WebElement report=driver.findElement(By.xpath("//option[@value='report']"));
	report.click();
	WebElement addbutton=driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
	addbutton.click();
	WebElement savebutton=driver.findElement(By.xpath("//input[@name='save']"));
	savebutton.click();
	report.isDisplayed();
	
	
	}
 static void Email() throws InterruptedException {
	 WebElement email=driver.findElement(By.id("EmailSetup_font"));
	 email.click();
	 WebElement myemailsetting=driver.findElement(By.xpath("//span[contains(text(),'My Email Settings')]"));
	 myemailsetting.click();
	 WebElement emailname=driver.findElement(By.id("sender_name"));
	 emailname.clear();
	 emailname.sendKeys("Roshni ABCD");
	 WebElement emailaddress=driver.findElement(By.id("sender_email"));
	 emailaddress.clear();
	 emailaddress.sendKeys("patel.roshni668@gmail.com");
	 Thread.sleep(2000);
	 WebElement automaticbcc=driver.findElement(By.xpath("//input[@id='auto_bcc1']"));
	 automaticbcc.click();
	 WebElement save=driver.findElement(By.xpath("//input[@class='btn primary']"));
	 save.click();
 }
 static void calander()
 {
	 WebElement Calender=driver.findElement(By.id("CalendarAndReminders_font"));
	 Calender.click();
	WebElement Activityremiander=driver.findElement(By.xpath("//span[contains(text(),'Activity Reminders')]"));
	Activityremiander.click();
	WebElement TestRemainder=driver.findElement(By.id("testbtn"));
	TestRemainder.click();
	System.out.println("Sample event pop window is dispayed.");
	
	
	
 }

}