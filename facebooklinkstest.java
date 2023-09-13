package BrokenLink;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class facebooklinkstest {

	public static void main(String[] args) {
		int verifiedlink=0;
		int invalid=0;
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement>obj=driver.findElements(By.tagName("a"));
		
	
	 int size=obj.size();
	 System.out.println(size);
	 for (int i = 0; i <size; i++) {
		 WebElement a=obj.get(i);
		String text=a.getAttribute("href");
		System.out.println(i);
		System.out.println(text);
	 
        try {
        	URL URLLINK=new URL(text);
        	HttpURLConnection http=(HttpURLConnection)URLLINK.openConnection();
        	http.setConnectTimeout(3000);
        	http.setRequestMethod("GET");
        	http.connect();
        	int status=http.getResponseCode();
        	http.connect();
        	http.getResponseCode();
        	System.out.println(status);
        	if(status==200)
            {
        		verifiedlink++;
//            	System.out.println("the valid link are  "+text);
            }
            else {
            	invalid++;
//            	System.out.println("invalid links are"+text);
            }
        	
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
       }
	 System.out.println("total count of valid links"+verifiedlink);
	 System.out.println("total count of invalid links"+invalid);

	}

}
