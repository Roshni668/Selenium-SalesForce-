package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_35 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		logintosalesforce();
		Alltab();
		Logout();
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
		WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
		
	}
	static void Alltab() throws InterruptedException {
		WebElement Accounts=driver.findElement(By.id("AllTab_Tab"));
		Accounts.click();
		WebElement custmizemytab=driver.findElement(By.className("btnImportant"));
		custmizemytab.click();
		WebElement selectedtabs=driver.findElement(By.id("duel_select_1"));
		
		Select tabtoremove=new Select(selectedtabs);
		tabtoremove.selectByVisibleText("Contacts");
		tabtoremove.selectByVisibleText("Accounts");
		tabtoremove.selectByVisibleText("Leads");
		WebElement removebtn=driver.findElement(By.id("duel_select_0_left"));
		removebtn.click();
		Thread.sleep(2000);
		WebElement savebtn=driver.findElement(By.xpath("//input[@class='btn primary']"));
		savebtn.click();
		System.out.println("The tab removed is displayed in the tab bar.");
		
	}
	static void  Logout() throws InterruptedException {
		
		WebElement RoshniPatel = driver.findElement(By.id("userNavLabel"));
		Actions action = new Actions(driver);
		action.moveToElement(RoshniPatel).build().perform();
		RoshniPatel.click();
		WebElement logout = driver.findElement(By.xpath("//a[@title='Logout']"));
		logout.click();
		
		//again i have to add button 
 }

}