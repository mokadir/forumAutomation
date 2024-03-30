package digitalpoint.tech.forumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T1_homepageValidation {
	
	public static WebDriver driver;

	@BeforeMethod
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mskad\\EclipseWorkspaces\\devops\\forumAutomation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public static void homepage() {
		driver.get("https://forum.digitalpoint.tech/");
	}
	
	
	@AfterMethod
	public static void closeBrowser() {
		driver.close();
	}
}
