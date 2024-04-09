package seleniumtraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasicDay2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		WebElement store=driver.findElement(By.className("MV3Tnb"));
		store.click();
		
//		WebElement searchBox=driver.findElement(By.name("q"));
//		searchBox.sendKeys("selenium");
		//Thread.sleep(5000);
		//WebElement searchbutton=driver.findElement(By.className("gNO89b"));
		//searchbutton.click();
	//	WebElement linkAbout=driver.findElement(By.linkText("About"));
		//linkAbout.click();
		Thread.sleep(3000);
		driver.close();
		
	}
}

