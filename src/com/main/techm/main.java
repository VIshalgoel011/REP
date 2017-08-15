package com.main.techm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		
		WebDriver driver = new InternetExplorerDriver(capabilities);
		
		driver.navigate().to("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
	    element.sendKeys("Cheese!\n"); // send also a "\n"
	    //element.submit();
	    driver.quit();
		
	}

}
