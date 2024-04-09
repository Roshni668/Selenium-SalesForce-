package seleniumtraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

			WebElement imageframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
			driver.switchTo().frame(imageframe);
			Thread.sleep(2000);
			
			Actions actions = new Actions(driver);
			WebElement srcElement=driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
			WebElement destElement=driver.findElement(By.id("trash"));
			actions.dragAndDrop(srcElement, destElement).build().perform();
			Thread.sleep(3000);
			driver.close();
			
	}

}
