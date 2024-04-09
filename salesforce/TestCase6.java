package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase6 {
	static WebDriver driver;
	 public static void main(String[] args) throws InterruptedException {
			logintosalesforce();
			RoshniPatel();
			EditProfie();
			 postonpage();
			fileupload();
			uploadphoto();
			
		}
	 static void logintosalesforce() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://login.salesforce.com/");
		 WebElement username=driver.findElement(By.id("username"));
			username.sendKeys("roshni@patel.com");
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Pankti123");
			//driver.findElement(By.id("rememberUn")).click();
			WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
			login.click();
			Thread.sleep(3000);
}
	 static void  RoshniPatel() throws InterruptedException {
			
			WebElement RoshniPatel = driver.findElement(By.id("userNavLabel"));
			Actions action = new Actions(driver);
			action.moveToElement(RoshniPatel).build().perform();
			RoshniPatel.click();
			driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
			
			Thread.sleep(2000);
			
}
	 static void EditProfie() throws InterruptedException
	 {
WebElement edit=driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']"));
	edit.click();
	WebElement iframeditprofile=driver.findElement(By.id("contactInfoContentId"));
	driver.switchTo().frame(iframeditprofile);
	WebElement abouttab=driver.findElement(By.xpath("//a[contains(text(),'About')]"));
	abouttab.click();
	WebElement lastname=driver.findElement(By.id("lastName"));
	lastname.clear();
	lastname.sendKeys("ABCD");
	Thread.sleep(2000);
	WebElement savebtn=driver.findElement(By.xpath("//input[@value='Save All']"));
	savebtn.click();
	System.out.println("UserProfilePage with changed lastname is displayed");
	Thread.sleep(2000);
	}
	 
	static void postonpage() throws InterruptedException {
		
	driver.switchTo().defaultContent();
	WebElement post=driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']"));
	Thread.sleep(2000);
	post.click();
	
	WebElement Frame= driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
	driver.switchTo().frame(Frame);
	//WebElement Textarea=driver.findElement(By.id("cke_43_contents"));
	WebElement Textarea=driver.findElement(By.xpath("//body[contains(text(),'Share an update, @mention someone...')]"));
	Textarea.sendKeys("Hi.. How are you?");
	driver.switchTo().defaultContent();
	WebElement share=driver.findElement(By.id("publishersharebutton"));
	share.click();
	}
	static void fileupload() throws InterruptedException
	{
		//driver.switchTo().defaultContent();
	driver.findElement(By.id("publisherAttachContentPost")).click();
	WebElement uploadfile=driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"));
	uploadfile.click();
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	WebElement choosefile=driver.findElement(By.xpath("//*[@id=\"chatterFile\"]"));
	Thread.sleep(3000);
	choosefile.sendKeys("C:\\Users\\hypat\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-03-21 085206.png");
	Thread.sleep(3000);
	WebElement share=driver.findElement(By.id("publishersharebutton"));
	share.click();
	
	
	}
	static void uploadphoto() throws InterruptedException {
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement moderator=driver.findElement(By.className("moderatorBadge"));
		moderator.click();
		Thread.sleep(2000);
		WebElement photofram=driver.findElement(By.id("uploadPhotoContentId"));
		driver.switchTo().frame(photofram);
		WebElement choosephoto=driver.findElement(By.className("fileInput"));
		
		Thread.sleep(2000);;
		choosephoto.sendKeys("C:\\Users\\hypat\\OneDrive\\Desktop\\bunny.jpg");
		Thread.sleep(2000);
		//WebElement save=driver.findElement(By.id("j_id0:uploadFileForm:save"));
		WebElement save=driver.findElement(By.id("j_id0:uploadFileForm:uploadBtn"));
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
		WebElement save1= driver.findElement(By.id("j_id0:j_id7:save"));
		Thread.sleep(3000);
		save1.click();
		System.out.println("Photo uploaded ,posted Text, uploaded file");
	}
	
} 
