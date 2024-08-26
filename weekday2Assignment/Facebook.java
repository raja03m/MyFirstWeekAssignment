package weekday2Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://en-gb.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			Thread.sleep(5000);

			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rakkeesh");
			Thread.sleep(5000);

			driver.findElement(By.name("lastname")).sendKeys("RR");
			Thread.sleep(5000);

			driver.findElement(By.name("reg_email__")).sendKeys("95555555555");
			driver.findElement(By.id("password_step_input")).sendKeys("Maahhee@31");
			WebElement day = driver.findElement(By.id("day"));
			WebElement month = driver.findElement(By.id("month"));
			WebElement year = driver.findElement(By.id("year"));

			Select Month = new Select(month);
			Select Day = new Select(day);
			Select Year =  new Select(year);
			
			Day.selectByIndex(4);
			Month.selectByIndex(4);
			Year.selectByIndex(4);
			
			driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
			driver.findElement(By.xpath("//button[@name='websubmit']")).click();

	}

}
