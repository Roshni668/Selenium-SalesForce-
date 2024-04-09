package seleniumtraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDay4 {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.globalsqa.com/demo-site/select-elements/");
	Thread.sleep(3000);
	WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(frame);
	driver.findElement(By.xpath("//li[contains(text(),'Item 2')]")).click();
	
	driver.close();
	
	

	}

}
