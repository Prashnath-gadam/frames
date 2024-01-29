package COM.HRMS.LIB;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class ADDEMP2_GENERAL extends addemp1 {
	public void openApplicationemp() {
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");
		}
		
		public void loginemp() {
		driver.findElement(By.name(txt_loginname)).sendKeys(username);
		driver.findElement(By.name(txt_password)).sendKeys(password);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
		}
		 
		public void logoutemp() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		}
		
		public void closeApplicationemp() {
			driver.quit();
			System.out.println("Application closed");
			}
		}
