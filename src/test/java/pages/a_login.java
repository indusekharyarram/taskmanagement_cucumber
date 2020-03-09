package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a_login {
	WebDriver driver;
	By Username=By.name("login");
	By Password=By.name("password");
	By Login=By.name("DoLogin");
	
	public void launch()
	{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	System.out.println(driver.getTitle());
	}
	public void open()
	{
		driver.get("http://examples.codecharge.com/TaskManager/Login.php?Logout=True");
		/*driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());*/
	}
	/*public void ()
	{
		WebElement a=driver.findElement(By.xpath("/html/body/center/table/tbody/tr/td/form/table[2]/tbody/tr[1]/td[2]/input"));
		WebElement b=driver.findElement(By.xpath("/html/body/center/table/tbody/tr/td/form/table[2]/tbody/tr[2]/td[2]/input"));
		WebElement c=driver.findElement(By.xpath("/html/body/center/table/tbody/tr/td/form/table[2]/tbody/tr[3]/td/input"));
		/*Actions  move=new Actions(driver);
		move.moveToElement(a);
		move.moveToElement(b).click().perform();
	}*/
	public void enter() throws InterruptedException, IOException
	{
	
		/*FileInputStream file=new FileInputStream("C:\\Users\\BLTuser.BLT78\\Desktop\\projectsheet.xlsx");
	
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		System.out.println("HIIII");
		int count=sheet.getLastRowNum();
	    System.out.println(count);*/

		/*for(int i=1;i<=count;i++)
		{
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell=row.getCell(0);
			String un=cell.getStringCellValue();
			XSSFCell cell1=row.getCell(1);
			String pwd=cell1.getStringCellValue();*/
			driver.findElement(Username).sendKeys("admin");
			driver.findElement(Password).sendKeys("admin");
		}

	public void click()
	{
		driver.findElement(Login).click();
	}
	}
