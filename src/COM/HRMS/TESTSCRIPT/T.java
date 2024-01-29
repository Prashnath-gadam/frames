package COM.HRMS.TESTSCRIPT;

import COM.HRMS.LIB.GN;

public class T {
public static void main(String[]args){
 GN obj = new GN();
 obj.openapp();

 obj.loginapp();
 obj.logoutapp();
 obj.closeapp();
}
}