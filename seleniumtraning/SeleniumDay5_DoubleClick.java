package seleniumtraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDay5_DoubleClick {
	static WebDriver driver;
	static Actions actions;
	

	public static void main(String[] args) throws InterruptedException {
		logintoApplication();
		homeTab();
		InteractionsTab();
		//doubleClick();
		//singleClick();
		ToolTip();
	}
	static void logintoApplication() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/home.html");
		WebElement email=driver.findElement(By.id("email_field"));
		email.sendKeys("admin123@gmail.com");
		WebElement password=driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		login.click();
		Thread.sleep(2000);
			}
	static void homeTab() throws InterruptedException {
		  Thread.sleep(3000);
		   WebElement home = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		   home.click();
			}
	static void InteractionsTab() throws InterruptedException {
		
		WebElement interaction = driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
		actions = new Actions(driver);
		actions.moveToElement(interaction).build().perform();
		Thread.sleep(1000);
		
			}
	static void doubleClick() throws InterruptedException {
	
	driver.findElement(By.xpath("//a[contains(text(),'Double Click')]")).click();
	
	WebElement btnDoubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double Click')]"));
	actions = new Actions(driver);
	actions.doubleClick(btnDoubleClick).build().perform();
	Thread.sleep(2000);
	}
	static void singleClick() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'Double Click')]")).click();
	WebElement sngclick=driver.findElement(By.xpath("//button[contains(text(),'single Click')]"));
	actions=new Actions(driver);
	actions.click(sngclick).build().perform();
	Thread.sleep(2000);
	
	}
	static void ToolTip() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'Tool Tip')]")).click();
		WebElement right=driver.findElement(By.className("tooltipr"));
		actions=new Actions(driver);
		actions.moveToElement(right).build().perform();
		Thread.sleep(2000);
		WebElement righttooltip = driver.findElement(By.className("tooltiptextr"));
		
		String actualText = righttooltip.getText();
		String ExpectedToolTip = "Right";
		System.out.println(actualText);
	}
													
}