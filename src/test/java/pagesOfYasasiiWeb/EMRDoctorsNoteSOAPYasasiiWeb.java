package pagesOfYasasiiWeb;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMRDoctorsNoteSOAPYasasiiWeb extends PageFactoryInitYasasiiWeb{
	public EMRDoctorsNoteSOAPYasasiiWeb(WebDriver driver) {
		super(driver);
	}

		@FindBy(xpath = "//*[@id=\"emrtemplateid\"]")
	public WebElement TemplateSOAP;
				
	
	@FindBy(xpath = "(//li)[23]")
	public WebElement SOAP;
	
	@FindBy(xpath = "//*[@class='btn btn-dark-green active']")
	public WebElement clickOK ;
	
//	@FindBy(xpath = "//div[@class='fr-element fr-view']//p")
//	public WebElement EnterHPI;
	
	@FindBy(xpath = "//textarea[@id='dynamic_textarea_HTF114']")
	public WebElement EnterHPI;
	
	
	
//	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='History']")
//	public WebElement History;
//	
	@FindBy(xpath = "//textarea[@id='dynamic_textarea_HTF197']")
	public WebElement PresentHistory;
	
	@FindBy(xpath = "//textarea[@id='dynamic_textarea_HTF198']")
	public WebElement SocialHistory;
	
	@FindBy(xpath = "//textarea[@id='dynamic_textarea_HTF199']")
	public WebElement FamilyHistory;
	
	@FindBy(xpath = "(//div[@class='item-name'][normalize-space()='History'])[1]")
	public WebElement History;
	
	@FindBy(xpath = "//app-medical[@medicalflag='medicalhistoryFlag']//div[@class='ng-star-inserted']//div[@class='row']//div[@class='col-md-12']//div[@class='empty-card-info md']//div//button[@type='button'][normalize-space()='Add New']")
	public WebElement medicalhistory ;
	
	@FindBy(xpath = "//input[@id='diagnosis']")
	public WebElement meddiagnosis;
	
	@FindBy(xpath = "//input[@id='onset']")
	public WebElement onset;
	
	
	@FindBy(xpath = "//input[@id='onsetuomtext']")
	public WebElement onsettext;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-medical[1]/div[1]/form[1]/div[2]/div[1]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement remarks;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-medical[1]/div[1]/form[1]/div[3]/div[1]/button[1]")
	public WebElement medicalhisadd;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/app-family[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	public WebElement familyhistorynew;
	
	@FindBy(xpath = "//input[@id='relationid']")
	public WebElement relation;
	
	@FindBy(xpath = "//textarea[@id='genetics']")
	public WebElement genetics;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/app-family[1]/div[1]/form[1]/div[3]/div[1]/div[1]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement famremarks;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/app-family[1]/div[1]/form[1]/div[4]/div[1]/button[1]")
	public WebElement familyhisadd;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[2]/app-surgical[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	public WebElement surgerynewadd;
	
	@FindBy(xpath = "//input[@id='servicename']")
	public WebElement surgeryname;
	
	@FindBy(xpath = "//input[@id='onsetid']")
	public WebElement onsetid;

	
	
	@FindBy(xpath = "//div[@class='col-md-12 ta-r']//button[@type='button'][normalize-space()='Add']")
	public WebElement surgeryadd;
	
	@FindBy(xpath = "/html/body/app-root/app-layout/main/app-emr-homescreen/div[2]/div/div/div[1]/app-emrtemplateloader/div[1]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div")
	public WebElement Vitalsigns;

	@FindBy(xpath = "//input[@id='vital020']")
	public WebElement Height;

	@FindBy(xpath = "//input[@id='vital050']")
	public WebElement Weight;
	
	@FindBy(xpath = "//input[@id='vital090']")
	public WebElement temperature;
	
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/app-vitalsigns[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[6]/app-vitalfields[1]/div[1]/div[1]/form[1]/span[1]/img[1]")
	public WebElement temperatureremarks;
	
	@FindBy(xpath = "//input[@id='propertyrefid']")
	public WebElement temperatureproperty;
	
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[2]/div[2]/button[1]")
	public WebElement temperaturepropertyok;
	
	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Allergy']")
	public WebElement Allergy;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	public WebElement addnewallergy ;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/ki-radio-list[1]/label[2]")
	public WebElement genericradiobutton;

	@FindBy(xpath = "//input[@id='drugclassname']")
	public WebElement AddNewdrugclass;
	
	@FindBy(xpath = "//input[@id='severityname']")
	public WebElement drugseverity;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement reaction;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/div[1]/a[3]/span[1]/span[1]/span[1]/i[1]")
	public WebElement vomiting ;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/div[1]/a[4]/span[1]/span[1]/span[1]/i[1]")
	public WebElement diarrhia ; 
	
	@FindBy(xpath = "//textarea[@id='description']")
	public WebElement description ;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[6]/div[1]/button[1]")
	public WebElement allergyadd ;
	
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	public WebElement otherallergy ;

	@FindBy(xpath = "//input[@id='otherallergyname']")
	public WebElement otherallergyname ;

	@FindBy(xpath = "//*[@class='form-control ng-pristine ng-valid ng-star-inserted ng-touched']")
	public WebElement SEArch ;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/div[1]/button[1]")
	public WebElement otherallergyADD;

	@FindBy(xpath = "//div[contains(text(),'Clinical Warning')]")
	public WebElement ClinicalWarning;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[1]/app-clinicalwarning[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement SignificantMedicalProblemBD;

	@FindBy(xpath = "/html/body/modal-container/div/div/div[4]/div[2]/span[1]")
	public WebElement SignificantMedicalProblemADD;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[1]/app-clinicalwarning[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[8]/div[1]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement VisitSpecificProblem;

	@FindBy(xpath = "//modal-container[@role='dialog']//div[4]//div[2]//span[1]")
	public WebElement VisitSpecificProblemOk;

	
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[4]/div[2]/span[1]")
	public WebElement clinicalwarnOK ;
	
	@FindBy(xpath = "//div[text()='Diagnosis and Plan']")
	public WebElement DiagnosisAndPlan;

	@FindBy(xpath = "//input[@id='fav']")
	public WebElement diagnosisSearcH;

	@FindBy(xpath = "//*[@id=\"component_TMH37\"]/app-diagnosis-plan/form/div/div/div[1]/div/div[1]/div/label[2]/i")
	public WebElement SearcHButton;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/app-diagnosis-plan[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	public WebElement diagnosisDisease;
	
	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Referral/Handover/Handoff']")
	public WebElement referral;
	
	@FindBy(xpath = "//input[@id='rhtodeptname']")
	public WebElement referraldepartment;
	
	@FindBy(xpath = "//input[@id='timeframeid']")
	public WebElement timeframe;
	
	@FindBy(xpath = "//textarea[@id='reason']")
	public WebElement reasonremarks;
	
	@FindBy(xpath = "//button[normalize-space()='Add']")
	public WebElement addreferral;
	
	
	@FindBy(xpath = "//label[contains(text(),'CPOE Service')]")
	public WebElement CPOEService ;
	
	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement CPOEsearch;
	
	@FindBy(xpath = "//div[normalize-space()='Edit']")
	public WebElement CPOEedit;
	
	@FindBy(xpath = "//textarea[@id='clinicalindication']")
	public WebElement CPOEclinicalindication;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-cpoe-service-orderdetails[1]/form[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/div[3]/app-cpoe-diagnosis-list[1]/div[1]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement CPOEservicediagnosis;
	
	@FindBy(xpath = "//button[normalize-space()='Update']")
	public WebElement CPOEupdate;
	
	@FindBy(xpath = "//label[contains(text(),'CPOE Pharmacy')]")
	public WebElement CPOEPharmacy;
	
	@FindBy(xpath = "//input[@placeholder='Search with Favorites']")
	public WebElement CPOEPharmacysearch;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]")
	public WebElement AddNoCurrentMedication;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]")
	public WebElement AddReconcillation;
	
			
	@FindBy(xpath = "//button[contains(text(),'Close')]")
	public WebElement dssclose;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[1]/div[2]/label[5]/label[1]/span[1]/i[1]")
	public WebElement Recon;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[1]/div[2]/label[3]/label[2]/span[1]/i[1]")
	public WebElement Reconcilationicon;
	
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement ReconcilationConfirmation;
	
	
	
	@FindBy(xpath = "//*[@id=\"component_cpoe\"]/app-cpoe-container/div/div/div[1]/div[2]/div/div/div[1]/app-cpoe-pharmacy-list/form/div/div[2]/div/div/div[1]")
	public WebElement SelectMedicine;
	
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicine;
	
	@FindBy(xpath = "//input[@id='recommeddose']")
	public WebElement recommendeddose;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[2]/div[1]/ul[1]/app-list-item[3]/li[1]")
	public WebElement recommendeddoseselection;

	
	
	@FindBy(xpath = "//span[@class='icon emrpreview']")
	public WebElement emrpreview;
	
	@FindBy(xpath = "//span[@class='icon emrsave']")
	public WebElement emrsave;
	
	
	
	
	public void medicalhistory(String pasth,String presenth,String sh,String fh,String md,String fhn,String gen,String fam,String sn)throws InterruptedException{
///////Enter History		
		clickOK.click();
		EnterHPI.sendKeys(pasth);
		PresentHistory.sendKeys(presenth);
		SocialHistory.sendKeys(sh);
		FamilyHistory.sendKeys(fh);
		History.click();
		medicalhistory.click();
		meddiagnosis.sendKeys(md);
		Thread.sleep(600);
		meddiagnosis.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-medical[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		onset.sendKeys("2");
		//onsettext.click();
		//driver.findElement(By.xpath("//li[contains(text(),'Months')]")).click();
		remarks.sendKeys("patient is suffering from severe Sarcoidosis of lung disease" );
		medicalhisadd.click();
		familyhistorynew.click();
		meddiagnosis.sendKeys(fhn);
		Thread.sleep(800);
		meddiagnosis.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/app-family[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		relation.click();
		driver.findElement(By.xpath("//li[contains(text(),'Others')]")).click();
		onset.sendKeys("5");
		onsettext.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Year(s)']")).click();
		Thread.sleep(300);
		genetics.sendKeys(gen);
		famremarks.sendKeys(fam);
		familyhisadd.click();
		surgerynewadd.click();
		surgeryname.sendKeys(sn);
		onsetid.sendKeys("7");
		onsettext.click();
		driver.findElement(By.xpath("//li[normalize-space()='Month(s)']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", surgeryadd);
	//	 js.executeScript("window.scrollBy(1588,660)");
		Thread.sleep(3000);
		surgeryadd.click();
		Thread.sleep(3000);
	}
	public void vitals(String ht,String wt,String temp)throws InterruptedException{
////////////Enter vitals		
		Vitalsigns.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/app-vitalsigns[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/label[1]/i[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[contains(text(),'Default View')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Add new')]")).click();
		Thread.sleep(800);
		
		Height.sendKeys(ht);
		Weight.sendKeys(wt);
		temperature.sendKeys(temp);
	//	temperatureremarks.click();
	//	temperatureproperty.click();
	//	driver.findElement(By.xpath("//li[contains(text(),'Oral')]")).click();
		Thread.sleep(500);
	//	temperaturepropertyok.click();
	}
	
	public void allergy(String addnd,String des,String oa)throws InterruptedException{
///////////Enter allergy details		
		Allergy.click();
		Thread.sleep(500);
		addnewallergy.click();
		Thread.sleep(500);
		genericradiobutton.click();
		AddNewdrugclass.sendKeys(addnd);
		AddNewdrugclass.sendKeys(Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@id='list0']")).click();
		drugseverity.click();
		driver.findElement(By.xpath("//li[contains(text(),'Medium')]")).click();
		reaction.click();
		vomiting.click();
		diarrhia.click();
		reaction.click();
		description.sendKeys(des);
		allergyadd.click();
		
		otherallergy.click();
		otherallergyname.sendKeys(oa);
		otherallergyname.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='list0']")).click();
		drugseverity.click();
		driver.findElement(By.xpath("//li[contains(text(),'Medium')]")).click();
//		reaction.click();
//		vomiting.click();
		otherallergyADD.click();
		
	}
	public void clinicalwarning(String cdes)throws InterruptedException{
//////////////////Enter clinical warning
		ClinicalWarning.click();
		SignificantMedicalProblemBD.click();
		onset.sendKeys("3");
		onsettext.click();
		driver.findElement(By.xpath("//li[contains(text(),'Month(s)')]")).click();
		description.sendKeys(cdes );
		clinicalwarnOK.click();
//		VisitSpecificProblem.click();	
//		onset.sendKeys("3");
//		onsettext.click();
//		driver.findElement(By.xpath("//li[contains(text(),'Month(s)')]")).click();
//		description.sendKeys("patient remarks" );
//		VisitSpecificProblemOk.click();
	}
	
	public void diagnosisandplan(String dig)throws InterruptedException{
///////////Enter diagnosis and plan		
		Thread.sleep(5000);
		DiagnosisAndPlan.click();
		diagnosisSearcH.sendKeys(dig);
		Thread.sleep(500);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/app-diagnosis-plan[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
		//IPrecommendation.click();
		//Thread.sleep(5000);
		//diagnosisDisease.click();
		Thread.sleep(3000);
	}
	
	public void referral(String ref,String reremarks)throws InterruptedException{
///////////Select referral		
		referral.click();
		referraldepartment.sendKeys(ref);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='Cardiology']")).click();
		Thread.sleep(2000);
		timeframe.click();
		driver.findElement(By.xpath("//li[contains(text(),'Within 1 Week')]")).click();
		Thread.sleep(2000);
		reasonremarks.sendKeys(reremarks);
		addreferral.click();
		Thread.sleep(3000);
	}
	
	public void cpoeservice(String search)throws InterruptedException{
/////////////////Add services		
		CPOEService.click();
//		CPOEsearch.sendKeys("Complete");
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//div[@id='cpoeservicelist_0']//label[@class='item-name']")).click();
//		Thread.sleep(3000);
//		//CPOEsearch.clear();
//		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-cpoe-service-list[1]/div[1]/div[1]/div[2]/span[3]/i[1]")).click();
//		CPOEsearch.clear();
		CPOEsearch.sendKeys(search);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Sodium')]")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//i[@class='fa fa-ellipsis-v']")).click();
//		Thread.sleep(3000);
//		CPOEedit.click();
//		Thread.sleep(3000);
//		CPOEclinicalindication.click();
//		CPOEclinicalindication.sendKeys("TEST Clinical Indication");
//		//CPOEservicediagnosis.click();
//		Thread.sleep(3000);
//		CPOEupdate.click();
	}
	
//	public void  cpoepharmacy(String phsearch)throws InterruptedException{
		
		
	public EMRHSLogYasasiiWeb cpoepharmacy(String phsearch)throws InterruptedException{
//////////////////Add pharmacy		
		CPOEPharmacy.click();
		Thread.sleep(900);
		CPOEPharmacysearch.sendKeys(phsearch);
		Thread.sleep(1000);
//    	AddNoCurrentMedication.click();
//    	AddReconcillation.click();
       	driver.findElement(By.xpath("//div[contains(text(),'by Oral')]")).click();
    	Thread.sleep(2000);
    //	dssclose.click();
//    	Recon.click();
//		Reconcilationicon.click();
//		Thread.sleep(2000);
//		ReconcilationConfirmation.click();
		ADDMedicine.click();
		//CPOEPharmacy.clear();
//		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[1]/div[2]/span[4]/i[1]")).click();
//		CPOEPharmacy.sendKeys("amoxicillin");
//		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
//	 	recommendeddose.click();
//		recommendeddoseselection.click();
//		ADDMedicine.click();
/////////////////Save the doctor note		
	    emrpreview.click();
	    Thread.sleep(3000);
	    emrsave.click();
	    Thread.sleep(10000);
	   return new EMRHSLogYasasiiWeb(driver);
		
	}
}