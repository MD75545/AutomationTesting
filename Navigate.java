package Navigation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigate {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		URL link=new URL("https://www.instagram.com/");
		driver.navigate().to(link);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
