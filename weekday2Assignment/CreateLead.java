package weekday2Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("xxyy");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("yy");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("zz");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("kk");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(4000);
		String checkTitile = "View Lead | opentaps CRM";
		String title = driver.getTitle();
		if(checkTitile.equals(title))
			System.out.println("Title matches");
		else
			System.out.println("Title not matches");
		Thread.sleep(3000);

	}

}
