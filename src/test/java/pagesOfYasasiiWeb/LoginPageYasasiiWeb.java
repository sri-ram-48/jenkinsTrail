package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;

public class LoginPageYasasiiWeb extends PageFactoryInitYasasiiWeb {
	public LoginPageYasasiiWeb(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement username;
	
	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement password;
		
	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement loginsite;
	
	@FindBy(xpath="//button[@class=\"btn btn-login\"]")
	public WebElement login;
	
	@FindBy(xpath = "//*[@id=\"loginsite\"]/div/span/span")
	public WebElement warningMessage;
	
	
	
	//public WebElement warningredMessage;
	
	public boolean iswarningPresent() {
		if(warningMessage.isDisplayed())
		return true ;
		else
		return false;
	}

	
	public HomePageYasasiiWeb enterloginDetails(String myusername,String mypassword,String mysite)
	{
///////////////Login credentials
		username.clear();
		username.sendKeys(myusername);
		password.clear();
		password.sendKeys(mypassword);
		loginsite.click();
		driver.findElement(By.xpath("//app-list-item/li[contains(text(),\""+mysite+"\")]")).click();;
		login.click();
		return new HomePageYasasiiWeb(driver);
	}
	
    
	
	

}
