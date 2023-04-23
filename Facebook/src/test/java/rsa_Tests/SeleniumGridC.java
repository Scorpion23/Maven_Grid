package rsa_Tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridC {

	@Test

	public void homepagecheckC() throws MalformedURLException {


		String remote_url = "http://localhost:4444";
		ChromeOptions options = new ChromeOptions();
		RemoteWebDriver driver = new RemoteWebDriver(new URL(remote_url), options);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Sachin");
		driver.quit();

	}

}
