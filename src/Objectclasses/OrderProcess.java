package Objectclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderProcess {

	WebDriver driver;
	
	public OrderProcess(WebDriver driver) {
		
		PageFactory.initElements(driver, this);		
		this.driver = driver;
		
	}	
	
	public void processorder() throws InterruptedException {
	
	driver.get("https://demo.opencart.com/index.php?route=product/product&product_id=47&search=HP+LP3065");
	
	WebElement Addtocart  = driver.findElement(By.xpath("//*[@id=\"button-cart\"]"));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].scrollIntoView()", Addtocart);
	
	Addtocart.click();
	
	Thread.sleep(2000);
	
	WebElement opencartoption;
	opencartoption = driver.findElement(By.xpath("//*[@id=\"cart\"]/button"));
	opencartoption.click();
	
	Thread.sleep(2000);
	
	WebElement check_out;
	check_out = driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong"));
	check_out.click();
	

	WebDriverWait wait2 = new WebDriverWait(driver,20);
	wait2.until(ExpectedConditions.presenceOfElementLocated(By.id("button-payment-address")));

	
	WebElement Billing_details  = driver.findElement(By.xpath("//*[@id=\"button-payment-address\"]"));
	JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	jse2.executeScript("arguments[0].scrollIntoView()", Billing_details);
	
	Billing_details.click();
	
	Thread.sleep(4000);
	
	WebElement Delivery_Details  = driver.findElement(By.xpath("//*[@id=\"button-shipping-address\"]"));
	JavascriptExecutor jse3 = (JavascriptExecutor)driver;
	jse3.executeScript("arguments[0].scrollIntoView()", Delivery_Details);
	
	Delivery_Details.click();
	
	Thread.sleep(4000);
		
	WebElement Delivery_Method  = driver.findElement(By.xpath("//*[@id=\"button-shipping-method\"]"));
	JavascriptExecutor jse4 = (JavascriptExecutor)driver;
	jse4.executeScript("arguments[0].scrollIntoView()", Delivery_Method);
	
	Delivery_Method.click();
	
	Thread.sleep(4000);
	
	WebElement Payment_Method   = driver.findElement(By.xpath("//*[@id=\"button-payment-method\"]"));
	JavascriptExecutor jse5 = (JavascriptExecutor)driver;
	jse5.executeScript("arguments[0].scrollIntoView()", Payment_Method);
		
	WebElement select_checkbox = driver.findElement(By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]"));
	select_checkbox.click();
	
	Payment_Method.click();
		
	WebElement select_checkbox2 = driver.findElement(By.xpath("//*[@id=\"button-payment-method\"]"));
	select_checkbox2.click();
	
	Thread.sleep(4000);
	
	WebElement select_checkbox3 = driver.findElement(By.xpath("//*[@id=\"button-confirm\"]"));
	JavascriptExecutor jse6 = (JavascriptExecutor)driver;
	jse6.executeScript("arguments[0].scrollIntoView()", select_checkbox3);
	select_checkbox3.click();
	
	WebDriverWait wait3 = new WebDriverWait(driver,20);
	wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div/a")));
	
	System.out.println("Order Successfully Placed"); 
	
	}
	
}
