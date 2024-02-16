package FileUploadDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadDemo2 
{	
	@Test
	public void fileUploadDemo()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/user/Downloads/FileUploadDemo2.html");
		WebElement fileupload = driver.findElement(By.xpath("//input[@id ='RBG']"));
		fileupload.sendKeys("C:\\Users\\user\\Pictures\\pics.jpg");
		System.out.println("Done");
	}
}

