package pagesOfYasasiiWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class MastersSpecimenYasassiWeb extends PageFactoryInitYasasiiWeb {
	
	public MastersSpecimenYasassiWeb(WebDriver driver) {

		super(driver);
	}
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[2]")
	public WebElement mastericon;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[6]/a[1]")
	public WebElement Service;
	
	@FindBy(xpath = "//span[contains(text(),'Specimen Master')]")
	public WebElement SpecimenMaster;	
	
	@FindBy(xpath = "//input[@id='lookupvalue']")
	public WebElement SpecimenName;	
	
	@FindBy(xpath = "//input[@id='field1']")
	public WebElement Code;	
	
	@FindBy(xpath = "//input[@id='field2']")
	public WebElement SpecimenCodeType;
	
	@FindBy(xpath = "//li[contains(text(),'P Code')]")
	public WebElement SpecimenCodeTypeSelect;
	
	@FindBy(xpath = "//button[@id='specimenmastersave']")
	public WebElement Save;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-specimenmaster[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement Search;
	
	@FindBy(xpath = "//span[@id='specimencontainersearch']")
	public WebElement SearchIcon;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-specimenmaster[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement SelectSpecimen;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-specimenmaster[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement Edit;
	
	@FindBy(xpath = "//textarea[@id='comments']")
	public WebElement Description;
	
	@FindBy(xpath = "//button[@id='specimenmasterupdate']")
	public WebElement Update;
	
	
	
public void SpecimenMasterSelect(String  specimenname) throws InterruptedException{
///////////Create the specimen master		
		Thread.sleep(1000);
		Menutoggle.click();
		Thread.sleep(3000);
		mastericon.click();
		Thread.sleep(3000);
		Service.click();
		Thread.sleep(500);
		SpecimenMaster.click();
		Thread.sleep(500);
		SpecimenName.sendKeys(specimenname);
		Code.sendKeys("CZ01146");
		SpecimenCodeType.click();
		SpecimenCodeTypeSelect.click();
		Save.click();
		Thread.sleep(1000);
/////////////////Edit the create dspecimen master
		Search.sendKeys(specimenname);
		SearchIcon.click();
		SelectSpecimen.click();
		Edit.click();
		Thread.sleep(500);
		Description.sendKeys("Specimen Master");
		Thread.sleep(500);
		Update.click();
		
		
}

}