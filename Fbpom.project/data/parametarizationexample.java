package Selenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parametarizationexample {
	@Test(dataProvider="fb")
	public void fbtest(String f,String f1) {

		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/reg");
		 WebElement s=  driver.findElement(By.xpath(" //input[@name='firstname']"));
		 s.clear();
	      s.sendKeys(f);
	      
	      WebElement s1=  driver.findElement(By.xpath("//input[@aria-label='Last name']"));
			 s1.clear();
		      s1.sendKeys(f1);
	     
		

		
	}
	@DataProvider(name="fb")
		public Object[][] getData(){
		Object[][]x={
		{"joe","Biden"},
		{"kamala","haris"},
		{"Bladimir","putin"}
			
		};
		return x;
		
	}
}
