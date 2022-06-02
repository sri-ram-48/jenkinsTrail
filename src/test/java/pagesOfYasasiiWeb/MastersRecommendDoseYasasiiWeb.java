package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class MastersRecommendDoseYasasiiWeb extends PageFactoryInitYasasiiWeb {
	
	public MastersRecommendDoseYasasiiWeb(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement mastericon;
	
	@FindBy(xpath = "//body/app-root/app-layout[@class='ng-star-inserted']/main[@class='page-body']/app-asideleftbar/aside[@class='left-sidebar open']/div[@class='menu-container']/div[@class='child bottom module-list in-down']/ul[@class='sidebarnav ng-star-inserted']/li[6]/a[1]/span[1]")
	public WebElement Pharmacy;
	
	@FindBy(xpath = "//span[contains(text(),'Recommend Dose')]")
	public WebElement RecommendDose;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-recommend-dose-master[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/input[1]")
	public WebElement Search;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-recommend-dose-master[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/span[1]/i[1]")
	public WebElement Searchicon;
	
	@FindBy(xpath = "//div[contains(text(),'Ultracet Tab')]")
	public WebElement BrandSelect;
	
	@FindBy(xpath = "//div[@class='searchbar-container default locked']//div[2]//div[1]//div[1]//div[1]//div[2]//label[1]//i[1]")
	public WebElement EditIcon;
	
	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement Frequency;
	
	@FindBy(xpath = "//li[contains(text(),'Days')]")
	public WebElement FrequencySelect;
	
	@FindBy(xpath = "//input[@id='duration']")
	public WebElement EnterDuration;
	
	@FindBy(xpath = "//input[@id='durationunitid']")
	public WebElement DurationUnit;
	
	@FindBy(xpath = "//li[contains(text(),'Day(s)')]")
	public WebElement SelectDurationUnit;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-recommend-dose-master[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement EnterRemarks;
	
	@FindBy(xpath = "//input[@id='calculationdose']")
	public WebElement RequiredDose;
	
	@FindBy(xpath = "//input[@id='calculationunitid']")
	public WebElement RequiredDoseUnit;
	
	@FindBy(xpath = "//li[contains(text(),'BSA')]")
	public WebElement RequiredDoseUnitSelect;
	
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement Add;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement Save;
	
	@FindBy(xpath = "//input[@id='sortby']")
	public WebElement Searchgeneric;
	
	@FindBy(xpath = "//li[contains(text(),'Generic')]")
	public WebElement Genericselect;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-recommend-dose-master[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]")
	public WebElement Genericname;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-recommend-dose-master[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/span[1]/i[1]")
	public WebElement Searchicn;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-recommend-dose-master[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement SelectGeneric;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-recommend-dose-master[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement editicn;
	
	@FindBy(xpath = "//input[@id='mindose']")
	public WebElement EnterDose;
	
	@FindBy(xpath = "//input[@id='doseunitid']")
	public WebElement DoseUnit;
	
	@FindBy(xpath = "//li[contains(text(),'Mg')]")
	public WebElement SelectDoseUnit;
	
	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement freq;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-recommend-dose-master[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/ul[1]/app-list-item[1]/li[1]")
	public WebElement FreqSelect;
	
	@FindBy(xpath = "//input[@id='duration']")
	public WebElement Enterduration;
	
	@FindBy(xpath = "//input[@id='durationunitid']")
	public WebElement duratunit;
	
	@FindBy(xpath = "//li[contains(text(),'Day(s)')]")
	public WebElement duratnunitselect;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-recommend-dose-master[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement EnterRema;
	
	@FindBy(xpath = "//input[@id='routeid']")
	public WebElement route;
	
	@FindBy(xpath = "//li[contains(text(),'Intra-articular')]")
	public WebElement routeselect;
	
	@FindBy(xpath = "//input[@id='formid']")
	public WebElement form;
	
	@FindBy(xpath = "//li[contains(text(),'Injection')]")
	public WebElement formselect;
	
	@FindBy(xpath = "//input[@id='calculationdose']")
	public WebElement EnterReqdose;
	
	@FindBy(xpath = "//input[@id='calculationunitid']")
	public WebElement dosunit;
	
	@FindBy(xpath = "//li[contains(text(),'BSA')]")
	public WebElement dosunitselect;
	
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement add;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement save;
	

public void RecommSelect() throws InterruptedException{
/////////////////Select recommend dose screen	and create recommend dose for brand medicine	
		Thread.sleep(3000);
		Menutoggle.click();
		Thread.sleep(3000);
		mastericon.click();
		Thread.sleep(3000);
		Pharmacy.click();
		Thread.sleep(800);
		RecommendDose.click();
		Thread.sleep(500);
		Search.sendKeys("ultr");
	    Searchicon.click();	
	    Thread.sleep(500);
	    BrandSelect.click();
	    EditIcon.click();
	    Frequency.click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-recommend-dose-master[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/ul[1]/app-list-item[1]/li[1]")).click();
	    Thread.sleep(500);
//	    EnterDuration.sendKeys("4");
//	    DurationUnit.click();
//	    SelectDurationUnit.click();
	    EnterRemarks.sendKeys("Take before food");
//	    Thread.sleep(1000);
//		{
//			JavascriptExecutor js=(JavascriptExecutor)driver;
//			WebElement element = driver.findElement(By.xpath("//input[@id='calculationunitid"));
//			js.executeScript("arguments[0].scrollIntoView(true);", element);
//			}
//	    RequiredDose.sendKeys("250");
//    	RequiredDoseUnit.click();
//    	RequiredDoseUnitSelect.click();
	    Add.click();
	    Save.click();
	Thread.sleep(1000);
	Searchgeneric.click();
	Genericselect.click();
	WebElement l=driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-recommend-dose-master[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
	l.clear();
	Thread.sleep(500);
/////////////////Create recommend dose for generic master
	Genericname.sendKeys("paracet");
	Searchicn.click();
//	SelectGeneric.click();
	WebElement GenSelect = driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-recommend-dose-master[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
	act.moveToElement(GenSelect).click().build().perform();
	editicn.click();
	EnterDose.sendKeys("500");
	DoseUnit.click();
	SelectDoseUnit.click();
	Thread.sleep(500);
	route.click();
	routeselect.click();
	form.click();
	formselect.click();
	freq.click();
	FreqSelect.click();
	Enterduration.sendKeys("8");
	duratunit.click();
	duratnunitselect.click();
	EnterRema.sendKeys("test remarks");
//	Thread.sleep(1000);
//	{
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		WebElement element = driver.findElement(By.xpath("//input[@id='calculationdose']"));
//
//		js.executeScript("arguments[0].scrollIntoView(true);", element);
//		}
//	EnterReqdose.sendKeys("250");
	driver.findElement(By.xpath("//input[@id='calculationdose']")).sendKeys("2");
	
	add.click();
	Thread.sleep(500);
	save.click();
	
	

}
}
