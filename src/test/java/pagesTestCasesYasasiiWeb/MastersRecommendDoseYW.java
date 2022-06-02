package pagesTestCasesYasasiiWeb;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.MastersRecommendDoseYasasiiWeb;

public class MastersRecommendDoseYW extends TestBaseYasasiiWeb  {
			public static LoginPageYasasiiWeb login;
		public static HomePageYasasiiWeb hm;
		

		@BeforeClass
		public void navigateERPage() throws InterruptedException {
			
			this.login =new LoginPageYasasiiWeb(driver) ;
			this.hm = login.enterloginDetails("admin", "KAmeda123$", "KIMSHEALTH TVM");
			Thread.sleep(8000);
			
		}
		@Test
		   public void servicemaster() throws InterruptedException {
				Thread.sleep(5000);
				
				MastersRecommendDoseYasasiiWeb recommenddose = new MastersRecommendDoseYasasiiWeb(driver);
				recommenddose.RecommSelect();
				}
		
		
		@AfterClass
		public void logout() throws Exception
		{
			this.hm.clickLogout();
		}
	

}

