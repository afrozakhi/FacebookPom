package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeModel extends BaseModel {
  
	   public HomeModel(WebDriver g) {
		   super(g);
		  
			   
		   }
	   public WebElement Getbutton() {
		   WebElement s=driver.findElement(By.xpath("//a[text()='Create new account']"));
		   return s;
	
		   
		   
	   }
   }

	


