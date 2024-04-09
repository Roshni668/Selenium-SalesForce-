package salesforce;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_37 {
	static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        logintosalesforce();
        clickHomeTab();
        time();
        recurrence();
    }

    static void logintosalesforce() throws InterruptedException {
    	WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("roshni@patel.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Pankti123");
		WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
    }

    static void clickHomeTab() throws InterruptedException {
    	Thread.sleep(2000);
    	WebElement Hometab=driver.findElement(By.xpath("//a[@title='Home Tab']"));
		Hometab.click();
		Thread.sleep(2000);
		//WebElement datelink=driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span/span/a"));
		//WebElement datelink=driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div/div[2]/span[2]/a"));
		WebElement datelink=driver.findElement(By.xpath("//span[@class='pageDescription']/a"));
		datelink.click();
		
	}
   static void time() throws InterruptedException {
	WebElement timelink4pm = driver.findElement(By.xpath("//*[@id=\"p:f:j_id25:j_id61:20:j_id64\"]/a"));
	timelink4pm.click();
	WebElement subjectcomboicon = driver.findElement(By.className("comboboxIcon"));
	subjectcomboicon.click();

		Set<String> handles = driver.getWindowHandles();
		String parentWindow= driver.getWindowHandle();
		// Switch to new window
		for (String handle : handles) {
			if (!handle.equals(driver.getWindowHandle())) {
				driver.switchTo().window(handle);
    
		WebElement otherlink =driver.findElement(By.xpath("//a[contains(text(),'Other')]"));
        otherlink.click();
        }
}
	driver.switchTo().window(parentWindow);
	WebElement endtime=driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
	endtime.clear();
	endtime.sendKeys("7:00 PM");
}
   public static void recurrence()
   {
	   WebElement Recurrencecheckbox=driver.findElement(By.xpath("//input[@id='IsRecurrence']"));
	   Recurrencecheckbox.click();
	  WebElement weeklybtn=driver.findElement(By.xpath("//input[@value='ftw']"));
	  weeklybtn.click();
	  WebElement recurrenceEndDate=driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']"));
	  recurrenceEndDate.clear();
	  recurrenceEndDate.sendKeys("4/17/2024");
	  WebElement savebtn=driver.findElement(By.xpath("//input[@value=' Save ']"));
	  savebtn.click();
	  WebElement monthview=driver.findElement(By.className("monthViewIcon"));
	  monthview.click();
	  System.out.println("Month View page is displayed. ");
   } 
   }
