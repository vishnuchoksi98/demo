package first;

import org.testng.annotations.Test;

public class timeout {
	@Test(timeOut = 1000)
	public void display() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("this is timeout method exmaple");
	}
	@Test(dependsOnMethods = {"display"})
	public void display1() throws InterruptedException {
		System.out.println("this is not timeout method");
	}
}
