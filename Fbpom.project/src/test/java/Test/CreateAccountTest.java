package Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Library.ExcelRead;

public class CreateAccountTest extends BaseTest {
	@Test(dataProvider="fb")
	public void createaccounttest(String f1,String f2,String f3,String f4,String f5,String f6,String f7,String f8 ) throws InterruptedException {
		gethomepage();
		hp.ClickOnButton();
		getaccountpage();
		cap.typeFirstName(f1);
		cap.typeLastName(f2);
		cap.typeEmail1(f3);
		cap.typePassword(f4);
		cap.typeMonthOfBirth(f5);
		cap.typeDateOfBirth(f6);
		cap.typeYearofBirth(f7);
		cap.typeGender(f8);
		cap.typeLink();
		
	}
	@DataProvider(name="fb")
	public Object[][] getData() throws IOException{
	Object[][]t;
	String filename="data/Fb.xlsx";
	String Sheetname="sheet2";
	ExcelRead er=new ExcelRead(filename,Sheetname);
	t=er.excelToArray();
	
	
	return t;
	
}
	

}
