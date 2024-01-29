package COM.HRMS.TESTSCRIPT;


import COM.HRMS.LIB.General;
public class TC001 {

	public static void main(String args[]){
	   //Test Steps
	General obj = new General();
	obj.openapp();
	obj.login();
	obj.logout();
	obj.closeApplication();
	}
	}

