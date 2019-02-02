package Objectclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass {
	
	public LoginClass(WebDriver driver) {
	PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="email")
	public WebElement emailid;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	public WebElement submitbutton;
	
	
	
	public void Login(String id, String pwd){
				
		emailid.sendKeys(id);
		password.sendKeys(pwd);
		submitbutton.click();
				
		System.out.println("Login Successfully");
	}
	
}
