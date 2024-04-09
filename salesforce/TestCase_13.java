package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumtraning.DragAndDrop;

public class TestCase_13 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		logintosalesforce();
		accounts();
		mergeaccounts();
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
		WebElement newtab=driver.findElement(By.xpath("//input[@value=' New ']"));
		newtab.click();
		WebElement AccountName=driver.findElement(By.xpath("//input[@id='acc2']"));
		AccountName.sendKeys("Roshni Patel");
		WebElement typedropdown=driver.findElement(By.xpath("//select[@id='acc6']"));
		Select type=new Select(typedropdown);
		type.selectByValue("Technology Partner");
		Thread.sleep(2000);
		WebElement customerdropdown=driver.findElement(By.xpath("//select[@id='00Nak0000011nPX']"));
		Select prority=new Select(customerdropdown);
		prority.selectByVisibleText("High");
		WebElement save=driver.findElement(By.xpath("//input[@value=' Save ']"));
		save.click();
		Thread.sleep(2000);
		
	}	
	
	static void mergeaccounts() throws InterruptedException
	{	
		WebElement Accounts=driver.findElement(By.id("Account_Tab"));
		Accounts.click();
		Thread.sleep(2000);
		WebElement Mergeacc=driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
		Mergeacc.click();
		WebElement findacctext=driver.findElement(By.xpath("//input[@id=\"srch\"]"));
		findacctext.sendKeys("Roshni");
		Thread.sleep(2000);
		
		WebElement findbtn=driver.findElement(By.xpath("//input[@value='Find Accounts']"));
		findbtn.click();
		WebElement checkbox1=driver.findElement(By.xpath("//input[@title='Select row 0']"));
		checkbox1.click();
		Thread.sleep(2000);
		WebElement checkbox2=driver.findElement(By.xpath("//input[@title='Select row 1']"));
		checkbox2.click();
		Thread.sleep(2000);
		WebElement next=driver.findElement(By.xpath("//input[@value=' Next ']"));
		next.click();
		WebElement merge=driver.findElement(By.xpath("//input[@title='Merge']"));
		merge.click();
		driver.switchTo().alert().accept();
		System.out.println("Account is merged ");
	}
	
	
}	