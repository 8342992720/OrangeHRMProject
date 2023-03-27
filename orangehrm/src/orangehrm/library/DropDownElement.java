package orangehrm.library;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utils.AppUtils;

public class DropDownElement
{
	public static WebDriver driver;
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://amazon.com");
	
	Select cat=new Select(driver.findElement(By.id("searchDropdownBox")));
	List<WebElement> list=cat.getOptions();
	 Boolean ordered=true;
	 
	 for(int i=1;i<list.size();i++)
	 {
		 String cat1=list.get(i-1).getText();
		 String cat2=list.get(i).getText();
		 
		 if (cat2.compareToIgnoreCase(cat1)<0) {
			ordered=false;
			break;
		}
		if (ordered) {
			System.out.println("test pass");
		}else
		{
			System.out.println("test fail");
		}
		
		
		
		
		
		
		
		
	}
	}
}














































