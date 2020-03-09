package pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c_search {
	WebDriver driver;
	By assignedto=By.name("assign_to");
	By project=By.name("project_id");
	By priority=By.name("priority_id");
	By status=By.name("status_id");
	By type=By.name("type_id");
	By search=By.name("DoSearch");
	
	
	public void launch2()
	{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	System.out.println(driver.getTitle());
	}
	
	
	public void open2()
	{
		driver.get("http://examples.codecharge.com/TaskManager/Default.php?assign_to=&project_id=&priority_id=&status_id=&type_id=");
	}
	
	
	public void filter()
	{
		driver.findElement(assignedto).click();
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[1]/td/select/option[20]")).click();
		driver.findElement(project).click();
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[2]/td/select/option[4]")).click();
		driver.findElement(priority).click();
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[3]/td/select/option[3]")).click();
		driver.findElement(status).click();
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[4]/td/select/option[5]")).click();
		driver.findElement(type).click();
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[5]/td/select/option[5]")).click();
	}
	
	
	public void click2()
	{
		By search=By.name("DoSearch");
		driver.findElement(search).click();
	}
	
}
