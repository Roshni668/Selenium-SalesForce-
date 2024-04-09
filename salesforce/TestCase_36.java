package salesforce;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_36 {
	 static WebDriver driver;

	    public static void main(String[] args) throws InterruptedException {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://login.salesforce.com/");
	        logintosalesforce();
	        clickHomeTab();
	        time();
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
		WebElement timelink8pm = driver.findElement(By.xpath("//*[@id=\"p:f:j_id25:j_id61:28:j_id64\"]/a"));
		timelink8pm.click();
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
	   
   // driver.switchTo().defaultContent();
    WebElement endtime=driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
   endtime.clear();
    endtime.sendKeys("9:00PM");
//    Select etime=new Select(endtime);
//    etime.selectByValue("9:00 PM");    
    WebElement savebtn=driver.findElement(By.xpath("//input[@value=' Save ']"));
    savebtn.click();
    System.out.println("The 'Calendar for FirstName LastName' page should be displayed with 'Other' event in the time slot 8:00PM to 9:00PM, as a link.");
	   }
	   

}