package AutomationApps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.Assert;
import org.testng.annotations.Test;

public class MyWebApp {
	@Test
	public void verifyTitle() throws InterruptedException {
		
		//ChromeOptions chromeoption = new ChromeOptions();
		//chromeoption.addArguments("--headless");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://azurebuilddemo.azurewebsites.net/mywebProject/");

		String title = driver.getTitle();

		System.out.println("Title is " + title);

		//Assert.assertEquals(title, "Login Page");

		Thread.sleep(2000);

		driver.quit();
	}
}
