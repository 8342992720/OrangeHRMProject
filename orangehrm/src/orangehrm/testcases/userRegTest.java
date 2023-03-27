package orangehrm.testcases;

import orangehrm.library.LoginPage;
import orangehrm.library.Users;
import utils.AppUtils;

public class userRegTest {
public static void main(String[] args) throws InterruptedException 
{
	
	AppUtils.LaunchApp("http://orangehrm.qedgetech.com");
	LoginPage lp=new LoginPage();
	lp.login("Admin","Qedge123!@#");
	
	Users u=new Users();
	boolean b=u.userReg("ESS","Bala Narasimhudu","balasp4321","Siku@54321");
	if(b)
	{
		System.out.println("test pass");
	}else
	{
		System.err.println("test fail");
	}
	
	lp.logout();
	
	AppUtils.closeApp();
	
	
	
	
	
	
	
}
}
