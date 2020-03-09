package pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class d_print {
	WebDriver driver;
	public void launch3()
	{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	System.out.println(driver.getTitle());
}
	public void open3()
	{
		driver.get("http://examples.codecharge.com/TaskManager/Default.php");
	}
	public void print() throws IOException
	{
		TakesScreenshot ts=((TakesScreenshot)driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Eclipse\\taskmanager_cucumber\\src\\test\\resources\\print\\print1.jpg"));	
	}
	
}