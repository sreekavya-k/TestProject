package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JenkinsTest {
public WebDriver driver;
@Test
public void openBlog() {
	driver.get("https://www.softwaretestingmaterial.com");
}
//Before class
@BeforeClass
public void beforeClass() {
	System.setProperty("webdriver.gecko.driver", "E:\\Library\\geckodriver-v0.28.0-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
}

@AfterClass
public void afterClass() {
	driver.quit();
}
}





















