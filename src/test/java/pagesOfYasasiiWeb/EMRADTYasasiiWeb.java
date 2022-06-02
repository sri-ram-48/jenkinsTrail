package pagesOfYasasiiWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMRADTYasasiiWeb extends PageFactoryInitYasasiiWeb {
	
	public EMRADTYasasiiWeb(WebDriver driver) {

		super(driver);
	}
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientNme;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
	public WebElement SelectPatientNme;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement UpArrow;
	
	@FindBy(xpath = "//span[@class='icon adtview']")
	public WebElement ADT;
	
	@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']")
	public WebElement JustClick;
	
	@FindBy(xpath = "//input[@id='admittype']")
	public WebElement ER;
	
	@FindBy(xpath = "//li[normalize-space()='Day Case Admission']")
	public WebElement DayCaseAdmission;
	
	@FindBy(xpath = "//div[normalize-space()='Recommended Date']")
	public WebElement RecommendedDateClick;
	
	@FindBy(xpath = "//div[contains(@class,'card-body form-inputs')]//div[contains(@class,'row')]//textarea[@id='remarks']")
	public WebElement EnterRemarks;
	
	@FindBy(xpath = "//input[@id='bedcategory']")
	public WebElement RoomCategory;
	
	@FindBy(xpath = "//li[contains(text(),'ROOM')]")
	public WebElement RoomCategorySelection;
	
	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement RoomType;
	
	@FindBy(xpath = "//li[contains(text(),'Deluxe')]")
	public WebElement SelectRoomType;
	
	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement Bed;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-adt[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[3]/li[1]")
	public WebElement SelectBed;
	
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement Save;
	
	
	public void AdtSelectionn(String firstname,String gender,String age,String encounter,String MRNo) throws InterruptedException{
//////////////////Admit the patient		
		Thread.sleep(1000);
		EnterPatientNme.sendKeys(MRNo);
		Thread.sleep(800);
		SelectPatientNme.click();
		Thread.sleep(1000);
		UpArrow.click();
		Thread.sleep(700);
		ADT.click();
		Thread.sleep(500);
		//JustClick.click();
		Thread.sleep(700);
		ER.click();
		DayCaseAdmission.click();
		Thread.sleep(1000);
		RecommendedDateClick.click();
		Thread.sleep(5000);
		EnterRemarks.sendKeys("Admitting the Patient");
//		RoomCategory.click();
//		RoomCategorySelection.click();
//		RoomType.click();
//		Thread.sleep(1000);
//		SelectRoomType.click();
		Thread.sleep(1000);
		Bed.click();
		Thread.sleep(1000);
		SelectBed.click();
		Thread.sleep(3000);
		Save.click();
	}

}
