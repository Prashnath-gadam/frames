package COM.HRMS.TESTSCRIPT;

import COM.HRMS.LIB.ADDEMP2_GENERAL;
public class ADDEMPLOYEES_TESTSCRIPT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ADDEMP2_GENERAL ojb = new ADDEMP2_GENERAL();
ojb.openApplicationemp();
ojb.loginemp();
ojb.logoutemp();
	}
}
