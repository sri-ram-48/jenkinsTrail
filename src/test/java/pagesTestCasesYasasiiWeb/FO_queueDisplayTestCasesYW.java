package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.FO_queueDisplayYasassiweb;

public class FO_queueDisplayTestCasesYW  extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	@BeforeClass
	public void navigateemradt() throws InterruptedException {
		
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
		Thread.sleep(8000);
		
	}
	
	@Test//(dataProvider="getData")
	public void  queuemaster ()throws InterruptedException, IOException, AWTException {
			Thread.sleep(5000);
			
			FO_queueDisplayYasassiweb  token = new FO_queueDisplayYasassiweb(driver);
			token.tokenview();
			}
	
	@AfterClass
	public void logout() throws Exception
	{
		//this.hm.clickLogout();
		driver.quit();
	}
	
	

}