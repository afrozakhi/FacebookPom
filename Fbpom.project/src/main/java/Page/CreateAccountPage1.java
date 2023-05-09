package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Model.CreateAccountModel1;


public class CreateAccountPage1  extends CreateAccountModel1{
	public CreateAccountPage1(WebDriver d) {
		super(d);
	}
	public void typeFirstName(String b) throws InterruptedException {
		WebElement s=getFirstname();
	    s.sendKeys(b);
	} 
	
	public void typeLastName(String c) {
		WebElement s1=getLastname();
		    s1.sendKeys(c);
	}
	
	public void typeEmail1(String q) {
		WebElement s2=getEmail();
		    s2.sendKeys(q);
	}
	public void typePassword(String u) {
		WebElement s2=getPassword();
		    s2.sendKeys(u);
	}
	public void typeMonthOfBirth(String y) {
		WebElement s2=getMonthOfBirth();
		 Select sel=new Select(s2);
	        sel.selectByVisibleText(y);
	}
	public void typeDateOfBirth(String t) {
		WebElement s3=getDateofBirth();
		 Select sel=new Select(s3);
	        sel.selectByVisibleText(t);
	}
	public void typeYearofBirth(String o) {
		WebElement s4=getYearOfBirth();
		Select sel=new Select(s4);
        sel.selectByVisibleText(o);
}
		    
	
	public void typeGender(String w) {
		 if(w.toLowerCase().equals("male")) {
			WebElement t=getgendermale();
			t.click();
			 }
		 else if(w.equals("Female")){

			WebElement t1=getgenderFemale();
			t1.click();
			 
		 }
		 else {
			 WebElement t2=getgendercustom();
			 t2.click();
			 
		 }

		
	}
	public void typeLink() {
		WebElement s6=getLink();
		    s6.click();
	}

	
	
}
		
	
	
		
	


