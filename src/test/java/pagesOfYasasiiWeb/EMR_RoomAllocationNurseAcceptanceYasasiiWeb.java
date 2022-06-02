package pagesOfYasasiiWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMR_RoomAllocationNurseAcceptanceYasasiiWeb  extends PageFactoryInitYasasiiWeb{
	
	public EMR_RoomAllocationNurseAcceptanceYasasiiWeb(WebDriver driver) {

		super(driver);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}

	@FindBy(xpath = "//div[@class='multi-action']//i[@class='ki ki-ellipsis-v']")
	public WebElement threedots;
	
	@FindBy(xpath = "//div[contains(text(),'New Transfer')]")
	public WebElement newtransfer;
		
	@FindBy(xpath = "//input[@id='bedcategory']")
	public WebElement roomcategory;
	
	@FindBy(xpath = "//li[normalize-space()='ROOM']")
	public WebElement selectRoom;	
		
	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement roomtype;
	
	@FindBy(xpath = "//li[normalize-space()='Delux(14)']")
	public WebElement selectroomtype;
		
	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement bedno;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[5]/form[1]/div[1]/div[2]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[6]/li[1]")
	public WebElement selectbed;		
		
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement sendrequest;
	
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement mylocation;
		
	@FindBy(xpath = "//li[normalize-space()='IP']")
	public WebElement selectIP;
	
	@FindBy(xpath = "//i[@title='Click to change view as Card View']")
	public WebElement changetogridview;	
		
	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement uparrow;
	
	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement lock;
		
	@FindBy(xpath = "//label[@class='icon adtview']")
	public WebElement adt;
	
	@FindBy(xpath = "//button[@id='acceptpatadtbutton']")
	public WebElement accept;
	
//	@FindBy(xpath = "")
//	public WebElement enterMRNo;
//	
//	@FindBy(xpath = "")
//	public WebElement ClickOnSearch;
//		
//	@FindBy(xpath = "")
//	public WebElement enterMRNo;
//	
//	@FindBy(xpath = "")
//	public WebElement ClickOnSearch;	
//		
//	@FindBy(xpath = "")
//	public WebElement enterMRNo;
//	
//	@FindBy(xpath = "")
//	public WebElement ClickOnSearch;
//		
//	@FindBy(xpath = "")
//	public WebElement enterMRNo;
//	
//	@FindBy(xpath = "")
//	public WebElement ClickOnSearch;
//	
//	@FindBy(xpath = "")
//	public WebElement enterMRNo;
//	
//	@FindBy(xpath = "")
//	public WebElement ClickOnSearch;
//		
//	@FindBy(xpath = "")
//	public WebElement enterMRNo;
//	
//	@FindBy(xpath = "")
//	public WebElement ClickOnSearch;	
//		
//	@FindBy(xpath = "")
//	public WebElement enterMRNo;
//	
//	@FindBy(xpath = "")
//	public WebElement ClickOnSearch;
//		
//	@FindBy(xpath = "")
//	public WebElement enterMRNo;
//	
//	@FindBy(xpath = "")
//	public WebElement ClickOnSearch;
		
public void transfer() throws InterruptedException
{
	
	threedots.click();
	Thread.sleep(800);
	newtransfer.click();
	Thread.sleep(800);
	roomcategory.click();
	Thread.sleep(800);
	selectRoom.click();
	Thread.sleep(800);
	roomtype.click();
	Thread.sleep(800);
	selectroomtype.click();
	Thread.sleep(800);
	bedno.click();
	Thread.sleep(800);
	selectbed.click();
	Thread.sleep(1000);
	sendrequest.click();
	Thread.sleep(1000);
}
public void nurseloginandAccept(String MRNo) throws InterruptedException
{
//////////////Nurse Duty Roster / Plan. This nurse can only see the IP patients(In my location) in their nursing location
	Thread.sleep(10000);	
	mylocation.click();
	Thread.sleep(800);
	selectIP.click();
	Thread.sleep(1000);
	changetogridview.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[contains(text(),'" + MRNo + "')]")).click();
	Thread.sleep(1500);
	uparrow.click();
	Thread.sleep(800);
	lock.click();
	Thread.sleep(1000);
	adt.click();
	Thread.sleep(1000);
	accept.click();
	Thread.sleep(1500);	

		
	}
	
	
	
	


}
