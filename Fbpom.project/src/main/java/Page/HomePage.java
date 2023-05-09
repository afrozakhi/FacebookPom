package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Model.HomeModel;

public class HomePage extends HomeModel{
	public HomePage(WebDriver h) {
		super(h);
		
	}
	public void ClickOnButton() {
	WebElement g=Getbutton();
	g.click();
	}

}
