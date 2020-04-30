package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderdemo {
	@Test(dataProvider = "datas")
	public void fetch(String uname,String pass ,String third) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.get("https://login.yahoo.com/account/create?lang=&done=https%3A%2F%2Fin.mail.yahoo.com%2F%3Fguce_referrer%3DaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8%26guce_referrer_sig%3DAQAAACz43hFz0HlysBIr1eNa5yqFmiLB1APjR0IeLR1uzQ--vC027HcbjUq5sh_o9bp3wkW67H9rHYeyj0V9x1jPmeV6mZQHgbisXdiAH-3QxKXwgOEqTjACCihQSOecYlpTgi96cDBkwYH916KdwHlR4vYdnwQMQANDE8jbndTLMkUN&src=ym&specId=yidReg");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstName")).clear();
		driver.findElement(By.name("firstName")).sendKeys(uname);
		driver.findElement(By.name("lastName")).clear();
		driver.findElement(By.name("lastName")).sendKeys(pass);
		driver.findElement(By.name("yid")).clear();
		driver.findElement(By.name("yid")).sendKeys(third);
		//driver.findElement(By.id("u_0_b")).click();
		System.out.println("success");
	}

	@DataProvider(name = "datas")
	public String[][] engine() {
		//Object d[][] = new Object[3][2];
		String d[][]=new String[2][3];
		d[0][0] = "admin1";
		d[0][1] = "admin1";
		d[0][2]="vishnu";
		d[1][0] = "vishnuchoksi@gmail.com";
		d[1][1] = "vishnu";
		d[1][2]="raj";
		return d;
	}
}
