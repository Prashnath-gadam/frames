package COM.HRMS.TESTSCRIPT;

import org.testng.annotations.Test;

import COM.HRMS.LIB.addempgeneral;
public class addemp_testscript {
  @Test
  public void m() {
//public static void main(String[] args) {
	addempgeneral obj = new addempgeneral();

	obj.openapp();
	obj.loginapp();
	obj.frameentered();
	obj.empadded();
	obj.exit();
	}

}
