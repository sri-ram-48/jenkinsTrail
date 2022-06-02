package pagesOfYasasiiWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_PharmacyBilling_YasassiWeb  extends PageFactoryInitYasasiiWeb{
	public FO_PharmacyBilling_YasassiWeb(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement SearchField;
	
	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	public WebElement patientSelect;
	
	
	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;
	
	@FindBy(xpath = "//i[contains(@class,'ki ki-plus')]")
	public WebElement EncounterAdd;
	
	
	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;
	//button[@id='billingsave']
	
	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;
	
	@FindBy(xpath = "//span[@class='user-name']")
	public WebElement username;
	
	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//span[@class='item-name '][normalize-space()='Logout']")
	public WebElement logout;
	
	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//a[@class='logout list-item ']")
	public WebElement logout1;
	
	
	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/ki-dialog-common[1]/div[2]/div[1]/div[3]/button[1]")
	public WebElement logoutConfirm;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement userid;
	
	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;
	
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement Hamberger;
	
	@FindBy(xpath = "//a[@title='EMRHomeScreen']//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRhomescreen;
	
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement mainCategory;
	
	@FindBy(xpath = "//li[normalize-space()='ER']")
	public WebElement ER;
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Searchfield;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
	public WebElement patientSelect1;

//    /html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]
	
	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement UParrow;
	
	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement Lock;
	
	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement DoctorNote;
	
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")    //input[@id='chiefcomplainttext']
	public WebElement cheifComplaint;
	
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;
	
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement tempOk;
	
	@FindBy(xpath = "//label[normalize-space()='CPOE Service']")
	public WebElement cpoeService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement cpoeServiceSearch;
	
	@FindBy(xpath = "//label[normalize-space()='CPOE Pharmacy']")
	public WebElement cpoePharmacy;
	
	@FindBy(xpath = "//input[@placeholder='Search Medicines']")
	public WebElement medicineSearch;
	
	
	@FindBy(xpath = "//body//app-root//app-cpoe-pharmacy-list//img[1]")
	public WebElement uncheckStar;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]")
	public WebElement medicineSelect;
	
	@FindBy(xpath = "//app-cpoe-pharmacy-prescription//ki-select-control[@id='routeid']//input[1]")
	public WebElement Route;
	
	@FindBy(xpath = "//input[@id='formid']")
	public WebElement Form;
	
	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement Frequency;
	
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement AddMedicine;
	
	@FindBy(xpath = "//input[@id='mindose']")
	public WebElement DoseLevel;
	
	@FindBy(xpath = "//input[@id='doseunitid']")
	public WebElement Doseunit;
	
	@FindBy(xpath = "//input[@id='durationunitid']")
	public WebElement DurationUnit;
	
	@FindBy(xpath = "//input[@id='antibioticorderingreasonid']")
	public WebElement reason;
	
	
	@FindBy(xpath = "//label[contains(@class,'icon emrsave')]")
	public WebElement EMRsave;
	
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement toggle;
	
	@FindBy(xpath = "//span[normalize-space()='Pharmacy Panel']")
	public WebElement Pharmacypanel;
	
	@FindBy(xpath = "//span[normalize-space()='OP Panel']")
	public WebElement opPanel;
	
	@FindBy(xpath = "//input[@id='locationid']")
	public WebElement pharloc;
	
	@FindBy(xpath = "//input[@id='callerid']")
	public WebElement callerID;
	
	@FindBy(xpath = "//div[@class='modal-footer']//button[@type='button'][normalize-space()='OK']")
	public WebElement pharlocOK;
	
	@FindBy(xpath = "//input[@id='searchText']")
	public WebElement counterSearch;
	
	@FindBy(xpath = "//div[@class='plt-prt-5 col-md-8']//i[@class='ki ki-search']")
	public WebElement counterSearchicon;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/lib-order-list[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement patientSearch2;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[2]/div[1]/div[1]/div[1]/lib-pharmacy-card[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement medicineCheck;
	
	@FindBy(xpath = "//button[@id='confirmsave']")
	public WebElement medicineSaveconfirm;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")//button[normalize-space()='OK']
	public WebElement confirmOK;
	
	@FindBy(xpath = "//div[@class='form-group min-clear-bottom ki-dropdown']//input[@id='undefined']")
	public WebElement status;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[2]/div[1]/div[1]/div[1]/lib-pharmacy-card[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement medicineCheck1;
	
	@FindBy(xpath = "//button[@id='billholdsave']")
	public WebElement holdbillSave;
	
	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement BILLsave;
	
	@FindBy(xpath = "//div[normalize-space()='Dispensing']")
	public WebElement dispensing;
	
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[1]/div[1]/div[1]/app-dispense[1]/div[1]/div[2]/div[1]/button[1]")
	public WebElement dispensed;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[1]/div[1]/div[1]/app-dispense[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement checkMedicine;
	
	@FindBy(xpath = "//div[@class='pat-name']")
	public WebElement PATientselect;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/lib-order-list[1]/div[2]/div[2]/div[1]/span[1]/i[1]")
	public WebElement counterIcon2;
	
	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;
	
	public void pharmacybill(String MRNo , String PROVIDER , String CHEIFCOMPLAINT , String MEDICINE) throws InterruptedException {
		
		
//		//////Encounter
//			SearchField.click();
//			Thread.sleep(1000);
//			SearchField.sendKeys(MRNo);
//			Thread.sleep(2000);
//			SearchIcon.click();
//			Thread.sleep(2000);
//			patientSelect.click();
//			Thread.sleep(4000);
//			
//			
//			
//			
//			WebElement inputBox = driver.findElement(By.xpath("//input[@id='EncBillingproviders']"));
//			String textInsideInputBox = inputBox.getAttribute("value");
//
//			// Check whether input field is blank
//			if(textInsideInputBox.isEmpty())
//			{
//			   System.out.println("Input field is empty");
//			   providerName.click();
//				Thread.sleep(1000);
//				providerName.sendKeys(PROVIDER);
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//*[contains(text(),'" + PROVIDER + "')]")).click();
//			}
//			else {
//				clear.click();
//				Thread.sleep(1000);
//				providerName.click();
//				Thread.sleep(1000);
//				providerName.sendKeys(PROVIDER);
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//*[contains(text(),'" +PROVIDER + "')]")).click();
//				
//			}
//			/* providerName.clear();
//			 Thread.sleep(1000);
//			 providerName.sendKeys(PROVIDER);
//			 driver.findElement(By.xpath("//li[normalize-space()='Rohit Sharma']")).click();
//			 Thread.sleep(1000);*/
//			 EncounterAdd.click();
//			 Thread.sleep(1000);
//			 EncounterSave.click();
//			 Thread.sleep(2000);
//			 SAvesuccess.click();
//			 Thread.sleep(2000);
//		////////logout
//				
//				username.click();
//				logout.click();
//				Thread.sleep(2000);
//				logoutConfirm.click();
//			 
//		////////login
//				Thread.sleep(5000);
//				userid.click();
//				userid.sendKeys("3");
//				Thread.sleep(1000);
//				password.click();
//				password.sendKeys("KAmeda123$");
//				Thread.sleep(1000);
//				site.click();
//				driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
//				Thread.sleep(2000);
				
				/////doctornote
				Thread.sleep(1000);
				Hamberger.click();
				Thread.sleep(1000);
				EMRhomescreen.click();
				Thread.sleep(1000);
				Searchfield.click();
				Thread.sleep(1000);
				Searchfield.sendKeys(MRNo);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[contains(text(),'" + MRNo + "')]")).click();
				
				patientSelect1.click();
				Thread.sleep(1000);
				UParrow.click();
				Lock.click();
				Thread.sleep(1000);
				DoctorNote.click();
				Thread.sleep(1000);
				List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));
				
				if(dynamicElement.size() !=0)
				{
					driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
				}
				  Thread.sleep(800); 
				 cheifComplaint.clear();
				cheifComplaint.sendKeys(CHEIFCOMPLAINT);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
				template.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
				tempOk.click();
				Thread.sleep(1000);
				
				cpoePharmacy.click();
				Thread.sleep(1000);
				uncheckStar.click();
				Thread.sleep(2000);
				medicineSearch.click();
				Thread.sleep(1000);
				medicineSearch.sendKeys(MEDICINE);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//body/app-root/app-layout/main[@class='page-body']/app-emr-homescreen/div[@class='page-container']/div[@class='note-layout ng-star-inserted layout-2 ab-locked']/div[@class='notelayoutcontainer']/app-emrtemplateloader[@class='ng-star-inserted']/div[@class='pat-note-entry']/div[@class='pat-current-temp']/div[@class='temp-container']/div[@id='noterightregion']/div[@id='section_cpoe']/div[@id='component_cpoe']/app-cpoe-container/div[@class='card-container']/div[@class='row']/div[@class='col-md-7 mbl-pr5']/div[@class='ng-star-inserted']/div/div[@class='ng-star-inserted']/div/div/app-cpoe-pharmacy-list/form[@class='ng-valid ng-touched ng-dirty']/div[@class='card card-left list-container pharmacy-list']/div[@class='card-body item-list-container']/div[2]/div[1]/div[1]")).click();
				//medicineSelect.click();
				Thread.sleep(1000);
			    Frequency.click();
			    Thread.sleep(1000);
			    driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
			    AddMedicine.click();
			    Thread.sleep(1000);
			    EMRsave.click();
			 
		////////logout
				Thread.sleep(2000);
				username.click();
				 Thread.sleep(1000);
				 logout1.click();
				Thread.sleep(1000);
				logoutConfirm.click();
			    
			 ///login
				Thread.sleep(2000);
				userid.click();
				Thread.sleep(1000);
				userid.sendKeys("admin");
				Thread.sleep(1000);
				password.click();
				password.sendKeys("kameda321");
				site.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
				Thread.sleep(3000);
			 
				toggle.click();
				 Thread.sleep(1000);
				Pharmacypanel.click();
				 Thread.sleep(1000);
				opPanel.click();
				 Thread.sleep(1000);
				pharloc.click();
				 Thread.sleep(1000);
				driver.findElement(By.xpath("//li[normalize-space()='7 th Level Pharmacy']")).click();
				 Thread.sleep(1000);
				callerID.click();
				 Thread.sleep(1000);
				driver.findElement(By.xpath("//li[normalize-space()='2nd Level Pharmacy-2nd Counter']")).click();
				pharlocOK.click();
				 Thread.sleep(1000);
				counterSearch.click();
				 Thread.sleep(1000);
				counterSearch.sendKeys(MRNo);
				 Thread.sleep(1000);
				counterSearchicon.click();
				 Thread.sleep(1000);
				 patientSearch2.click();
				 Thread.sleep(1000);
				 medicineCheck.click();	
				 Thread.sleep(1000);
				 medicineSaveconfirm.click();
				 Thread.sleep(2000);
				 confirmOK.click(); Thread.sleep(1000);
				 status.click();
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//li[normalize-space()='Confirmed'] ")).click();
				 Thread.sleep(1000);
				 patientSearch2.click();
				 Thread.sleep(1000);
				 medicineCheck1.click();
				 Thread.sleep(1000);
				 holdbillSave.click();
				 Thread.sleep(2000);
				 confirmOK.click();
				 Thread.sleep(1000);
				 status.click();
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//li[normalize-space()='Bill Hold']")).click();
				 Thread.sleep(1000);
				 patientSearch2.click();
				 Thread.sleep(1000);
				 BILLsave.click();
				 Thread.sleep(2000);
				 confirmOK.click();
				 Thread.sleep(1000);
				 dispensing.click();
				 Thread.sleep(1000);
				 counterSearch.click();
				 Thread.sleep(1000);
					counterSearch.sendKeys(MRNo);
					counterIcon2.click();
					PATientselect.click();
					 checkMedicine.click();
					 dispensed.click();
					 confirmOK.click();
				 
				 
				 
				 
				 
				 
				 
				 
				 
		
	}
	
	
	
	
	
	
	

}
