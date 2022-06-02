package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMR_ERBedAllocation;
import pagesOfYasasiiWeb.FO_AppoinmenrCreationYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class FO_AppoinmentCreationTestCasesYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("Mithu01", "KAmeda123$", "KIMSHEALTH TVM");
	Thread.sleep(8000);
	
}

//Register ER Patient 

@Test(dataProvider="getData")
public void FOAppoinment(String MRNo,String Name,String doctor,String sitename,String doctor1) throws Exception {
		Thread.sleep(5000);
		
		FO_AppoinmenrCreationYasasiiWeb Schedule1 = new FO_AppoinmenrCreationYasasiiWeb(driver);
		Schedule1.Appoinment(MRNo,Name,doctor);
		Schedule1.encounterCheckIn();
	//	Schedule1.othersite(sitename,doctor1);
		}

@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}
@DataProvider
public Object[][] getData() throws Exception {

	Object[][] data = readExcel("Appoinment");
	return data;
}

}
