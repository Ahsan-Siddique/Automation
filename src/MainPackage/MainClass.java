package MainPackage;

import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Objectclasses.LoginClass;
import Objectclasses.LogoutClass;
import Objectclasses.OrderProcess;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class MainClass {

	public static void main(String[] args) throws IOException, InterruptedException, BiffException {

		FileInputStream fs = new FileInputStream("C:\\Users\\Selenium\\Desktop\\PageObjectClass\\Test.xls");
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet User_Login = wb.getSheet("User_Login");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selenium\\Desktop\\Selenium Setup & Libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		for (int x=1; x<=3; x++)
		{
		
		LoginClass loginobjects = new LoginClass (driver);
		loginobjects.Login("mytc5@gmail.com","123456789");
		
		Thread.sleep(2000);

		
		//OrderProcess processorder = new OrderProcess (driver);
		//processorder.processorder();
	
		//Thread.sleep(2000);
		
		LogoutClass logout = new LogoutClass (driver);
		logout.logout();
		
		Thread.sleep(2000);
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		}
//		LoginClass loginobjects1 = new LoginClass (driver);
//		loginobjects1.Login("random12@opencart.com","opencart12");
//		
//		LogoutClass logout1 = new LogoutClass (driver);
//		logout1.logout();
//		
//		Thread.sleep(2000);
//		
//		
//		//driver.close();
//		//driver.quit();
		
	}

}
