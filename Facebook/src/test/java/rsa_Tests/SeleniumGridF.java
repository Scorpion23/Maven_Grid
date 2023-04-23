package rsa_Tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridF {

	@Test

	public void HomepagecheckF() throws MalformedURLException {

		String remote_url = "http://localhost:4444";
		FirefoxOptions options = new FirefoxOptions();
		RemoteWebDriver driver = new RemoteWebDriver(new URL(remote_url), options);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Sachin");
		driver.quit();
	}
}
