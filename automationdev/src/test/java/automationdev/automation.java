package automationdev;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class automation {

	@Test
	public void login() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aysha Areej\\Downloads\\Compressed\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://dev.iscuw.org/portal/users/sign_in");
	WebElement username=driver.findElement(By.id("user_username"));
	WebElement password=driver.findElement(By.id("user_password"));
	WebElement login=driver.findElement(By.name("commit"));
	username.sendKeys("director@iscuw.org");
	password.sendKeys("LLCopexA123&*");
	login.click();
	driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[2]/ul/li[5]/a/img")).click();
	WebElement date=driver.findElement(By.xpath("//*[@id=\"week_week_ending\"]"));
	date.click();

   
	}
	

	}
