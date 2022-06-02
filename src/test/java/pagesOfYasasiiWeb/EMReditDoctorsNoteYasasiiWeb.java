package pagesOfYasasiiWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMReditDoctorsNoteYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMReditDoctorsNoteYasasiiWeb(WebDriver driver) {

		super(driver);
	}
	
	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement diagnosisplan;
	
	@FindBy(xpath = "//span[contains(text(),'IP Recommendation')]")
	public WebElement iprecommendation;
	
	
	@FindBy(xpath = "//span[@class='checkmark active-label']")
	public WebElement patientforadmissioncheckbox;
	
	@FindBy(xpath = "//input[@id='categoryid']")
	public WebElement priority;
	
	@FindBy(xpath = "//input[@id='admntypeid']")
	public WebElement admtype;
	
	@FindBy(xpath = "//body/app-root/app-layout[@class='ng-star-inserted']/main[@class='page-body']/app-emr-homescreen[@class='ng-star-inserted']/div[@class='page-container']/div[@class='ng-star-inserted']/div[@class='note-layout action-locked']/div[@class='notelayoutcontainer']/app-emrtemplateloader[@class='ng-star-inserted']/div[@class='pat-note-entry']/div[@class='pat-current-temp']/div[@class='temp-container']/div[@id='noterightregion']/div[@id='section_TMH37']/div[@id='component_TMH37']/app-diagnosis-plan/form[@class='ng-valid ng-dirty ng-touched']/div[@class='card-container card-prev-info']/div[@class='row']/div[@class='col-md-6 mbl-pl8']/div[@class='card card-right']/div[@class='card-body form-inputs']/div[@class='tab-container sm']/tabset[@class='tab-container']/div[@class='tab-content']/tab[@id='2']/div[@class='tab-body ng-valid ng-dirty ng-touched']/div[@class='row']/div[@class='col-md-12']/ki-textarea-control[@id='diagnosisremarks']/div[@class='form-group ng-star-inserted']/textarea[1]")
	public WebElement remarks;
	
	@FindBy(xpath = "//span[@class='icon emrpreview']")
	public WebElement emreditpreview;
	
	@FindBy(xpath = "//span[@class='icon emrsave']")
	public WebElement emrsave;
	
	@FindBy(xpath = "//input[@id='bedid']")
	public WebElement emrroomtype;
	
	@FindBy(xpath = "//li[contains(text(),'ICU')]")
	public WebElement emrroomtypeselect;
	
	
	
	
public void EMReditIPRecommendation() throws InterruptedException {
//////////Edit the doctor note and add IP recommendation and save it
	//docemrnote.click();
	Thread.sleep(3000);
	diagnosisplan.click();
	Thread.sleep(1000);
	iprecommendation.click();
	Thread.sleep(3000);
	patientforadmissioncheckbox.click();
	priority.click();
	driver.findElement(By.xpath("//li[contains(text(),'Elective')]")).click();
	Thread.sleep(1000);
	admtype.click();
	driver.findElement(By.xpath("//li[contains(text(),'Day Case Admission')]")).click();
	Thread.sleep(500);
	emrroomtype.click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//li[contains(text(),'Deluxe')]")).click();
	Thread.sleep(500);
	remarks.sendKeys("admit the patient");
	Thread.sleep(1000);
	emreditpreview.click();
	Thread.sleep(1000);
	emrsave.click();
	Thread.sleep(3000);
	
}
}
