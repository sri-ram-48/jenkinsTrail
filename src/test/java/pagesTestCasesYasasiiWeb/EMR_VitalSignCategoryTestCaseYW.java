package pagesTestCasesYasasiiWeb;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMR_VitalSignCategoryYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;


public class EMR_VitalSignCategoryTestCaseYW extends TestBaseYasasiiWeb  {
	
	public static LoginPageYasasiiWeb login;
    public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateDO() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("TVM00001", "KAmeda123$", "KIMSHEALTH TVM");
	Thread.sleep(8000);
	
}

@Test
public void emrvitals() throws InterruptedException {
		Thread.sleep(5000);
		
		EMR_VitalSignCategoryYasasiiWeb step = new EMR_VitalSignCategoryYasasiiWeb(driver);
		step.action();
		}




@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}




}
