package orangehrm.testcases;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class AdminLoginTesWithValidInputs {
	
	public static void main(String[] args) {
		
		AppUtils.LaunchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp=new LoginPage();
		lp.login("fffffff","55555555");
		
		
		boolean admin=lp.isAdminLoginDisplayed();
		if(admin)
		{
			System.out.println("test pass");
		}else
		{
			System.out.println("test fail");
		}
		
		lp.logout();
		
		
		boolean res=lp.ifErrMsgDisplay();
		if(res)
		{
			System.out.println("test pass");
			
		}else
		{
			System.out.println("test fail");
		}
		AppUtils.closeApp();

	}
}
