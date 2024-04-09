package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
public class TestCase_12 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		logintosalesforce();
		accounts();
		newview();
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
		WebElement viewdropdn=driver.findElement(By.id("fcf"));
		Select name=new Select(viewdropdn);
		name.selectByVisibleText("Patel");
		Thread.sleep(2000);

		WebElement edit=driver.findElement(By.linkText("Edit"));
		edit.click();
		WebElement viewname=driver.findElement(By.id("fname"));
		viewname.clear();
		viewname.sendKeys("Patel");
		Thread.sleep(2000);
		WebElement uniqueviewname=driver.findElement(By.xpath("//input[@id='devname']"));
		uniqueviewname.clear();
		uniqueviewname.sendKeys("r123");
//		WebElement save=driver.findElement(By.xpath("//input[@value=' Save ']"));
//		save.click();

	}
	
	static void newview() throws InterruptedException{
//		Thread.sleep(2000);
//		WebElement viewdrpdwn=driver.findElement(By.id("fcf")); //exception
//		Select viewdp=new Select(viewdrpdwn);
//		viewdp.selectByValue("00Bak000004s0xw");
//		 WebDriverWait wait = new WebDriverWait(driver, 10);
//		Thread.sleep(2000);
//		    WebElement viewdrpdwn=driver.findElement(By.xpath("//select[@id='00Bak000004s0yX_listSelect']"));
//		    Select viewdp = new Select(viewdrpdwn);
//		    viewdp.selectByVisibleText("Recently Viewed Accounts");
//		Thread.sleep(2000);
		 
		Thread.sleep(2000);
		//WebElement field=driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[2]/div[2]/div[2]/table[2]/tbody/tr[1]/th[2]"));
		WebElement field=driver.findElement(By.xpath("//select[@title='Search By 1']"));
		Select field1=new Select(field);
		field1.selectByVisibleText("Account Name");
		Thread.sleep(2000);
		
		//WebElement Operatore=driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[2]/div[2]/div[2]/table[2]/tbody/tr[1]/th[3]"));
		WebElement Operatore=driver.findElement(By.xpath("//select[@title='Operator 1']"));
		Select operatore1=new Select(Operatore);
		operatore1.selectByVisibleText("contains");
		Thread.sleep(4000);
		//WebElement value=driver.findElement(By.xpath("//*[@id=\"fval1\"]"));
		WebElement value=driver.findElement(By.xpath("//input[@title='Value 1']"));
		value.clear();
		value.sendKeys("Patel");
		Thread.sleep(2000);
		WebElement availableFields=driver.findElement(By.xpath("//select[@id='colselector_select_0']"));
	Actions actions = new Actions(driver);
		actions.moveToElement(availableFields).build().perform();
		
		WebElement dnbcompany=driver.findElement(By.xpath("//*[@id=\"colselector_select_0\"]/option[14]"));
		dnbcompany.click();
		Thread.sleep(2000);
		WebElement addbutton=driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
		addbutton.click();
		WebElement savebutton=driver.findElement(By.xpath("//input[@name='save']"));
		savebutton.click();
		
		System.out.println("View will have D&B company column added and the data of the list will have all account names");
	}
		
		
		
		
		
		
		
		
		
		
		
		

}
	
