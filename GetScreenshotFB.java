package TakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class GetScreenshotFB {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("13gkjvjfytf");
		driver.findElement(By.id("pass")).sendKeys("ronajvjvjj@ldo");
		driver.findElement(By.name("login")).click();
		WebElement title=driver.findElement(By.xpath("//div[@class='_9ay7']"));
		String text = title.getText();
		System.out.println(title);
		String expectedTitle="The email address or mobile number you entered isn't connected to an account. ";
		if(expectedTitle.equals(text)) {
			System.out.println("Test case pass");
		}
		else {
			TakesScreenshot tk=(TakesScreenshot)driver;
			File source=tk.getScreenshotAs(OutputType.FILE);
			String path="D:\\SeleniumTool\\Screenshots\\Facebook2.png";
			File Destination=new File(path);
			
			FileHandler.copy(source, Destination);
			System.out.println("test case fail");
		}
	
	}

}
