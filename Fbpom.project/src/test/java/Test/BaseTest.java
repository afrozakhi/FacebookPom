package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import Page.CreateAccountPage1;
import Page.HomePage;

public class BaseTest {
	static WebDriver driver;
	static HomePage hp;
	static CreateAccountPage1 cap;

	@BeforeSuite
	public void SetUp() {

		//driver.manage().timeouts().implicitlyWait(13, TimeUnit.SECONDS);
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.Facebook.com");
		
		
	}
	public void gethomepage() {
		hp=new HomePage(driver);
	
		
	}

	public void getaccountpage() {
		cap=new CreateAccountPage1(driver);
	
		
	}
}
