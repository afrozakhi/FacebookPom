package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountModel1 extends BaseModel{ 
	
	public CreateAccountModel1(WebDriver d) {
		super(d);
	}

	
	public WebElement getFirstname() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(13, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement s=driver.findElement(By.xpath("//input[@name='firstname']"));
		   return s;
	}
		  
		  
	 public WebElement getLastname(){
				WebElement s1=driver.findElement(By.xpath("//input[@aria-label='Last name']"));
				   return s1;
	 }
	 public WebElement getEmail(){
			WebElement s1=driver.findElement(By.xpath("//input[@aria-label='Mobile number or email'] "));
			   return s1;
} 
	 

	 public WebElement getPassword() {
			WebElement s2=driver.findElement(By.xpath(" //input[@data-type='password']"));
			   return s2;
}
	 public WebElement getMonthOfBirth() {
			WebElement s2=driver.findElement(By.xpath(" //select[@name='birthday_month']"));
			   return s2;
}
	 public WebElement getDateofBirth() {
			WebElement s2=driver.findElement(By.xpath("//select[@aria-label='Day'] "));
			   return s2;
}
	 
	 public WebElement getYearOfBirth() {
			WebElement s2=driver.findElement(By.xpath("//select[@aria-label='Year']"));
			   return s2;
}
	 public WebElement getgenderFemale() {
		 WebElement w2=driver.findElement(By.xpath("//input[@value='1']"));
		   return w2;
		 
	 
	
	 }
	 public WebElement getgendermale() {
		 WebElement w3=driver.findElement(By.xpath("//input[@value='2']"));
		   return w3;
	 }
	 public WebElement getgendercustom() {
		 WebElement w4=driver.findElement(By.xpath("//input[@value='3']"));
		   return w4;
	 }
		 
	
	 
	

	 public WebElement getLink() {
			WebElement s2=driver.findElement(By.xpath("//a[@id='non-users-notice-link']"));
			   return s2;
}
	
	 
	
	
	
	
	}



