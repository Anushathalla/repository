package FileUploadDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoItDemo1
{
	@Test
	public void autoIt() throws IOException, InterruptedException
	{
		
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/user/Downloads/FileUploadDemo1.html");
	WebElement fileupload = driver.findElement(By.xpath("//input[@id ='RBG']"));
	fileupload.click();
	Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\FrameWork\\AutoItDemo");
	System.out.println("Done");
}
}



