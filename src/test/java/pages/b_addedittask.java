package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class b_addedittask {
	WebDriver driver;
	/*WebElement element;*/
	
	public void abc() {
		// TODO Auto-generated method stub
		By Username=By.name("login");
		By Password=By.name("password");
		By Login=By.name("DoLogin");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.get("http://examples.codecharge.com/TaskManager/Login.php?Logout=True");
		driver.findElement(Username).sendKeys("admin");
		driver.findElement(Password).sendKeys("admin");
		driver.findElement(Login).click();
	}
	public void Add_Task()
	{
	By AddTask=By.xpath("/html/body/table[1]/tbody/tr[2]/td[2]/a/img");
	driver.findElement(AddTask).click();
	}
	public void Add_Details()
	{
		By Task=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[1]/td/input");
		By Description=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[2]/td/textarea");
		By Project=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[3]/td/select/option[2]");
		By Priority=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[4]/td/select/option[2]");
		By Status=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[5]/td/select/option[2]");
		By Type=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[6]/td/select/option[2]");
		By AssignedTo=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[7]/td/select/option[5]");
		
		/*By Start_Date=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[8]/td/a");
		WebElement element=(WebElement) By.xpath("/html/body/center/table");
		Actions act=new Actions(driver);
		act.moveToElement(element);
		By Start_Date_1= By.xpath("/html/body/center/table/tbody/tr/td/table/tbody/tr[4]/td[3]/a");
		By Finish_Date=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[9]/td/a");
		By Finish_Date_1= By.xpath("/html/body/center/table/tbody/tr/td/table/tbody/tr[5]/td[6]/a");*/
	driver.findElement(Task).sendKeys("TaskManagement");
	driver.findElement(Description).sendKeys("TaskManagement Website");
	driver.findElement(Project).click();
	driver.findElement(Priority).click();
	driver.findElement(Status).click();
	driver.findElement(Type).click();
	driver.findElement(AssignedTo).click();
	/*driver.findElement(Start_Date).click();
	driver.findElement(Start_Date_1).click();
	driver.findElement(Finish_Date).click();
	driver.findElement(Finish_Date_1).click();*/
	}
	public void Send()
	{
		By Add=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[10]/td/input[1]");
		driver.findElement(Add).click();
		
	}
	
	}

