package COM.HRMS.TESTSCRIPT;
import org.testng.annotations.Test;
import COM.HRMS.LIB.General;
public class TC002 {
	@Test
	public void e() {
	//public static void main(String args[]){
		   //Test Steps
		General obj = new General();
		obj.openapp();
		obj.login();
		obj.logout();
		obj.closeApplication();
		}
}
