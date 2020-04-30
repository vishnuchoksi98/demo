package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class first {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		// String name = driver.getTitle();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	}

	@Test()
	//@Parameters({"a","b"})  
	public void googleTitleTest(int a,int b) {
		driver.findElement(By.name("email")).sendKeys("");
		System.out.println("data is sent succesfully: ");
		//String d = driver.getTitle();
		//System.out.println("this is title group");
	}

	@Test(priority = 1, groups = "linktest")
	public void gmailLink() {
		 boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
		//System.out.println("this is something ");
	}

	@Test(priority = 2, groups = "title")
	public void googleTitle() {
		System.out.println("this is title group");
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
