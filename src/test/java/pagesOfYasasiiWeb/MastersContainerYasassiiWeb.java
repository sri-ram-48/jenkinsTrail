package pagesOfYasasiiWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class MastersContainerYasassiiWeb extends PageFactoryInitYasasiiWeb {
	
	public MastersContainerYasassiiWeb(WebDriver driver) {

		super(driver);
	}
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[2]")
	public WebElement mastericon;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[6]/a[1]")
	public WebElement Service;
	
	@FindBy(xpath = "//span[contains(text(),'Container Master')]")
	public WebElement ContainerMaster;	

	@FindBy(xpath = "//input[@id='container']")
	public WebElement ContainerName;
	
	@FindBy(xpath = "//input[@id='colorpicker']")
	public WebElement Colour;	
	
//	@FindBy(xpath = "//span[contains(text(),'Container Master')]")
//	public WebElement colourSelect;	
	
	@FindBy(xpath = "//button[@id='containermastersave']")
	public WebElement Save;	
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-container[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement Search;	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-container[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/span[1]/i[1]")
	public WebElement searchicon;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-container[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement selectContainer;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-container[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement edit;
	@FindBy(xpath = "//button[@id='containermasterupdate']")
	public WebElement update;
	
public void SpecimenContainerSelect(String  containername) throws InterruptedException{
//////////Create a container	
		Thread.sleep(3000);
		Menutoggle.click();
		Thread.sleep(1000);
		mastericon.click();
		Thread.sleep(1000);
		Service.click();
		Thread.sleep(500);
		ContainerMaster.click();
		Thread.sleep(500);
		ContainerName.sendKeys(containername);
		Colour.click();
		//colourSelect.click();
		Save.click();
//////////Edit the created container
		Search.sendKeys(containername);
		searchicon.click();
		selectContainer.click();
		edit.click();
		Thread.sleep(500);
		update.click();
}
}
