package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMR_TwoBabyRegistration_yasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class EMR_TwoBabyRegistration_TestCaswYW  extends TestBaseYasasiiWeb {
	
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass
	public void navigateemradt() throws InterruptedException {
		
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("DOCAS", "Kameda321", "KIMSHEALTH TVM");
		Thread.sleep(3000);
		
	}

	@Test(dataProvider="getData"  , priority=0)
	public void BirthReg(String Name,String AadharNumber,String MRNo, String Provider , String MRNo1, String ADTprovider,String nurseUser, String password , String depUser , String RADuser , String meduser, String AdminUser , String AdminPassword,String DOCuser , String DOCpassword , String MRNo2) throws InterruptedException, IOException {
			Thread.sleep(5000);
			
			 EMR_TwoBabyRegistration_yasassiWeb Schedule1 = new  EMR_TwoBabyRegistration_yasassiWeb(driver);
			Schedule1.enterFOpatientBirthRegistrationSelectn(Name, AadharNumber, MRNo, Provider , ADTprovider);
			}

	@Test(dataProvider="getData" , priority =1)
	public void Doctornote(String Name,String AadharNumber,String MRNo, String Provider , String MRNo1, String ADTprovider,String nurseUser, String password , String depUser , String RADuser , String meduser, String AdminUser , String AdminPassword,String DOCuser , String DOCpassword , String MRNo2) throws InterruptedException, IOException {
			Thread.sleep(5000);
			
			 EMR_TwoBabyRegistration_yasassiWeb Schedule1 = new  EMR_TwoBabyRegistration_yasassiWeb(driver);
			Schedule1.pregnantNOTE(Name, MRNo,Provider,DOCuser,DOCpassword);
			Schedule1 .DeliveryNOTE();
			Schedule1.Birthreg(MRNo, Provider, ADTprovider, MRNo1);
			Schedule1.Birthreg2(MRNo, Provider, ADTprovider, MRNo1);
			}

	@Test(dataProvider="getData" , priority=2)
	public void babynote(String Name,String AadharNumber,String MRNo, String Provider , String MRNo1, String ADTprovider,String nurseUser, String password , String depUser , String RADuser , String meduser, String AdminUser , String AdminPassword,String DOCuser , String DOCpassword , String MRNo2) throws InterruptedException, IOException {
			Thread.sleep(5000);
			
			 EMR_TwoBabyRegistration_yasassiWeb Schedule1 = new  EMR_TwoBabyRegistration_yasassiWeb(driver);
			
			Schedule1.babyNote(MRNo1,MRNo2,DOCuser,DOCpassword);
			}

	@Test(dataProvider="getData" , priority=3)
	public void Babydischarge1(String Name,String AadharNumber,String MRNo, String Provider , String MRNo1, String ADTprovider,String nurseUser, String password , String depUser , String RADuser , String meduser, String AdminUser , String AdminPassword,String DOCuser , String DOCpassword , String MRNo2) throws InterruptedException, IOException {
			Thread.sleep(5000);
			
			 EMR_TwoBabyRegistration_yasassiWeb Schedule1 = new  EMR_TwoBabyRegistration_yasassiWeb(driver);
			
			Schedule1.dischargeRecommendationBaby1(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			Schedule1.dischargeApprovalBaby1(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			Schedule1.LaboratoryClearanceBaby1(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			Schedule1.radiologyClearanceBaby1(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			Schedule1.medicalClearanceBaby1(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			Schedule1.pharmacyClearanceBaby1(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			Schedule1.ADTapproval1(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			Schedule1.financialClearance1(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			Schedule1.physicalDischarge1(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword ,DOCuser , DOCpassword);
	}

	
	@Test(dataProvider="getData" , priority=4)
	public void Babydischarge2(String Name,String AadharNumber,String MRNo, String Provider , String MRNo1, String ADTprovider,String nurseUser, String password , String depUser , String RADuser , String meduser, String AdminUser , String AdminPassword,String DOCuser , String DOCpassword , String MRNo2) throws InterruptedException, IOException {
			Thread.sleep(5000);
			
			 EMR_TwoBabyRegistration_yasassiWeb Schedule1 = new  EMR_TwoBabyRegistration_yasassiWeb(driver);
			
			Schedule1.dischargeRecommendationBaby2(MRNo2, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			Schedule1.dischargeApprovalBaby2(MRNo2, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			Schedule1.LaboratoryClearanceBaby2(MRNo2, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			Schedule1.radiologyClearanceBaby2(MRNo2, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			Schedule1.medicalClearanceBaby2(MRNo2, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			Schedule1.pharmacyClearanceBaby2(MRNo2, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			Schedule1.ADTapproval2(MRNo2, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			Schedule1.financialClearance2(MRNo2, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			Schedule1.physicalDischarge2(MRNo2, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword ,DOCuser , DOCpassword);
	}
	
	
	
	
	@Test(dataProvider="getData" , priority=5)
	public void MOMdischarge(String Name,String AadharNumber,String MRNo, String Provider , String MRNo1, String ADTprovider,String nurseUser, String password , String depUser , String RADuser , String meduser, String AdminUser , String AdminPassword,String DOCuser , String DOCpassword , String MRNo2) throws InterruptedException, IOException {
			Thread.sleep(5000);
			
			 EMR_TwoBabyRegistration_yasassiWeb Schedule = new  EMR_TwoBabyRegistration_yasassiWeb(driver);
			
			Schedule.dischargeRecommendationMOM(MRNo, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			Schedule.dischargeApprovalMOM(MRNo, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			Schedule.laboratoryclearanceMOM(MRNo, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			Schedule.RadiologyclearanceMOM(MRNo, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			Schedule.MedicalclearanceMOM(MRNo, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			Schedule.pharmacyClearanceMOM(MRNo, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			Schedule.ADTapprovalMOM(MRNo, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			Schedule.financialClearanceMOM(MRNo, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			Schedule.physicalDischargeMOM(MRNo, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
			
			
			}


	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	}

	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("2baby");
		return data;	
	}


	
	
	

}

