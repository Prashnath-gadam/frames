package COM.HRMS.LIB;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class GN extends G{

 public void openapp(){
driver =new ChromeDriver();
driver.get(url);
System.out.println("app opened");
}
 public void closeapp() {
	 driver.close();
	 System.out.println("app closed");
 }
  public void loginapp() {
	  driver.findElement(By.name(txt_urname)).sendKeys(ur);
	  driver.findElement(By.name(txt_ps)).sendKeys(ps);
	  driver.findElement(By.name(btn_login )).click();
	  System.out.println("login complited");
	  
  }
  public void logoutapp() {
	
	  driver.findElement(By.linkText(logout_linkText)).click();
  System.out.println("logout complieted");
  }
  }