package COM.HRMS.LIB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class General extends Global {
                                           
	//std rule: To provide all re-usable fun:/methods: related to whole application
	
	public void openapp() {
	driver = new FirefoxDriver();
	driver.navigate().to(url);
	System.out.println("Application Opened");
	}
	public void closeApplication() {
	driver.quit();                                                                                                                                                                                                                
	System.out.println("Application closed");
	}
	public void login() {
	driver.findElement(By.name(txt_loginname)).sendKeys(username);
	driver.findElement(By.name(txt_password)).sendKeys(password);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("Login completed");
	}
	public void logout() {
	driver.findElement(By.linkText(link_logout)).click();
	System.out.println("Logout completed");
	}
	}
	
	

