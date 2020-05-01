package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterdemo {
	@Test
	@Parameters({ "email" })
	public void display(String email) {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys(email);
		System.out.println("success");
	}
	@Test
	public void added() {
		System.out.println("wonderful");
	}
}

