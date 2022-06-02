package pagesTestCasesYasasiiWeb;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.MastersResouceMasterYasassiiWeb;
import pagesOfYasasiiWeb.MastersResourceMappingYasassiiWeb;

public class MastersResourceMappingTestCasesYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateresoursemap() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "KAmeda123$", "KIMSHEALTH TVM");
	Thread.sleep(8000);
	
}

@Test
public void ResourseMap() throws InterruptedException {
		Thread.sleep(5000);
		
		MastersResourceMappingYasassiiWeb ResMap = new MastersResourceMappingYasassiiWeb(driver);
		ResMap.ResourceMasterSelect();
		}


@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}



}