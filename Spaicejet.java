package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Spaicejet {

	public static void main(String[] args) throws InterruptedException 
 {
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.linkText("Mumbai (BOM)")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction")).click();
		driver.findElement(By.linkText("Delhi (DEL)")).click();
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("19"))).build().perform();
		driver.findElement(By.linkText("19")).click();
		
//	act.moveToElement(driver.findElement(By.linkText("25"))).build().perform();
	//driver.findElement(By.linkText("25")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
	Select sel=new	Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		sel.selectByValue("USD");
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		
		
	}

}
