package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCTEST1 {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.hdfcbank.com/personal/ways-to-bank/online-banking/net-banking");
			String currenturl=driver.getCurrentUrl();
			String expectedUrl="https://www.hdfcbank.com/personal/ways-to-bank/online-banking/net-banking";
			if(currenturl.equals(expectedUrl))
			{
			System.out.println("test case pass");
		    }
			else {
		    System.out.println("test case fail");
	       }
		}

	}
