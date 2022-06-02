package pagesOfYasasiiWeb;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMR_ViewingMultiplePatientInDifferentTabYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMR_ViewingMultiplePatientInDifferentTabYasasiiWeb(WebDriver driver) {

		super(driver);

}
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamburger;
	@FindBy(xpath = "//i[@class='ki ki-sthethescope']")
	public WebElement EMR;
	@FindBy(xpath = "//a[@title='EMRHomeScreen']//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
	public WebElement PatientSelection;

	
	
	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement myusername;
	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement mypassword;
	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement myloginsite;
	@FindBy(xpath="//li[contains(text(),'KIMSHEALTH TVM')]")
	public WebElement siteselect;
	@FindBy(xpath="//button[@class=\"btn btn-login\"]")
	public WebElement login;
	
	
	
	
	
public void DifferentTab() throws InterruptedException, IOException {
//////Login and select a patient and view the doctor note		
	    Thread.sleep(1000);
		Hamburger.click();
		EMR.click();
		EMRHomeScreen.click();
		PatientSelection.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body//app-root//div[@class='ng-star-inserted']//div[@class='ng-star-inserted']//div[@class='ng-star-inserted']//div[1]//div[1]//div[2]//div[1]//div[3]//label[1]//span[2]")).click();
		Thread.sleep(3000);
//////////////Login in another tab and view the patient's doctor note		
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(1000);
		driver.get("http://uathis.kimshealth.org");
		Thread.sleep(1000);
		
		
	//	myusername.clear();
		myusername.sendKeys("TVM00001");
	//	mypassword.clear();
		mypassword.sendKeys("KAmeda123$");
		myloginsite.click();
		siteselect.click();
		login.click();
		Thread.sleep(1000);
		Hamburger.click();
		EMR.click();
		EMRHomeScreen.click();
		PatientSelection.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body//app-root//div[@class='ng-star-inserted']//div[@class='ng-star-inserted']//div[@class='ng-star-inserted']//div[1]//div[1]//div[2]//div[1]//div[3]//label[1]//span[2]")).click();
		Thread.sleep(4000);		
		driver.switchTo().window(tabs.get(0));
	//	Thread.sleep(3000);	
		driver.quit();	

	
}
}
