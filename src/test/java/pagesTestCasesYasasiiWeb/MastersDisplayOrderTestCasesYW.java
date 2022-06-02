package pagesTestCasesYasasiiWeb;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.MastersDisplayOrderYasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class MastersDisplayOrderTestCasesYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateDO() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "KAmeda123$", "KIMSHEALTH TVM");
	Thread.sleep(8000);
	
}

@Test
public void displayorder() throws InterruptedException {
		Thread.sleep(5000);
		
		MastersDisplayOrderYasassiWeb display = new MastersDisplayOrderYasassiWeb(driver);
		display.DOSelect();
		}


@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}




}
