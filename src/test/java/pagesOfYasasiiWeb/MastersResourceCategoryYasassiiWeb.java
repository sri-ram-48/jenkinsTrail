package pagesOfYasasiiWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class MastersResourceCategoryYasassiiWeb extends PageFactoryInitYasasiiWeb {
	
	public MastersResourceCategoryYasassiiWeb(WebDriver driver) {

		super(driver);
	}
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]/div[2]")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement mastericon;
	
	@FindBy(xpath = "//body/app-root/app-layout[@class='ng-star-inserted']/main[@class='page-body']/app-asideleftbar/aside[@class='left-sidebar open']/div[@class='menu-container']/div[@class='child bottom module-list in-down']/ul[@class='sidebarnav ng-star-inserted']/li[4]/a[1]/span[1]")
	public WebElement Resource;
	
	@FindBy(xpath = "//span[contains(text(),'Resource Category')]")
	public WebElement ResourceCategory;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-categorycreation[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement EnterCategory;
	
	@FindBy(xpath = "//input[@id='field6']")
	public WebElement ResourceType;
	
	@FindBy(xpath = "//li[contains(text(),'All')]")
	public WebElement ResourceTypeSelect;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-categorycreation[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement CheckAppoinment;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-categorycreation[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement Site;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement Save;
	
	@FindBy(xpath = "//lib-searchbar-head/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement Search;
	
	@FindBy(xpath = "//lib-searchbar-head/div[1]/div[1]/div[1]/div[1]/span[1]/i[1]")
	public WebElement SearchIcon;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-categorycreation[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement clickonName;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-categorycreation[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement Edit;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-categorycreation[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement EnterComments;
	
	@FindBy(xpath = "//button[contains(text(),'Update')]")
	public WebElement clickonUpdate;
	
	
public void ResourceMasterSelect() throws InterruptedException{
////////////////Click on resource category screen 		
		Thread.sleep(1000);
		Menutoggle.click();
		Thread.sleep(3000);
		mastericon.click();
		Thread.sleep(3000);
		Resource.click();
		ResourceCategory.click();
		EnterCategory.sendKeys("XRay Machine1");
		ResourceType.click();
		ResourceTypeSelect.click();
		CheckAppoinment.click();
		Site.click();
		Save.click();
		Thread.sleep(5000);
////////Edit created category
		Search.sendKeys("XRay Machine1");
		SearchIcon.click();
		Thread.sleep(500);
		clickonName.click();
		Thread.sleep(500);
		Edit.click();
		EnterComments.sendKeys("Alphabets");
		Thread.sleep(500);
		clickonUpdate.click();
		
}
}

