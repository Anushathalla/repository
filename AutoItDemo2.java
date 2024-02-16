package FileUploadDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoItDemo2
{
	@Test
	public void autoIt() throws  InterruptedException, IOException
	{
		
	WebDriver driver = new ChromeDriver();
	driver.get("C:\\Users\\user\\Downloads\\FileUploadDemo1.html");
	WebElement fileupload = driver.findElement(By.xpath("//input[@id ='RBG']"));
//	fileupload.click();
	Thread.sleep(10000);
	
	Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\FrameWork\\AutoItDemo\\FileUpolad.exe");
	System.out.println("Done");
}
}



