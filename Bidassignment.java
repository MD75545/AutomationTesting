package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bidassignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&prevRID=5SQNBD9DGVNWXKW0H0PT&openid.assoc_handle=inflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement driver2=driver.findElement(By.id("ap_customer_name"));
		driver2.sendKeys("Cristiano Ronaldo");
		WebElement driver3=driver.findElement(By.id("ap_phone_number"));
		driver3.sendKeys("7304373810");
		WebElement driver4=driver.findElement(By.id("ap_email"));
		driver4.sendKeys("Ronaldo7@gmail.com");
		
		WebElement driver5=driver.findElement(By.id("ap_password"));
		driver5.sendKeys("cristiano@554577");
	}

}
