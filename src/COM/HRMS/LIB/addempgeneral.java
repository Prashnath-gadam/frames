package COM.HRMS.LIB;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
 
public class addempgeneral extends empaddglobal {
 
	public void openapp() {
	driver = new ChromeDriver();
	driver.get(url);
System.out.println("app opened");
 }
 
 public void loginapp() {
driver.findElement(By.name(txt_urname)).sendKeys(ur);	 
driver.findElement(By.name(txt_password)).sendKeys(ps);	
driver.findElement(By.name(btn_login)).click(); 
 System.out.println("login complited");
 }
 
  public void frameentered() {
	  driver.switchTo() .frame(enteframes);
	  System.out.println("enter into frames");

	}
	public void empadded (){
	  driver.findElement(By.xpath(addemp)).click();
	  driver.findElement(By.name(lasttname)).sendKeys(ltname);
	  driver.findElement(By.name(fristtname)).sendKeys(frname);
	  driver.findElement(By.id(save_btn)).click();
  }
  
	public void exit() {  
	driver.switchTo().defaultContent();
	System.out.println("exited form frames");
		driver.findElement(By.linkText(logout_btn)).click();
		 System.out.println("logout from app ");
		 driver.close();
	 
  }
}
