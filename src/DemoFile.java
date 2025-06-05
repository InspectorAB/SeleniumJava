import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driverr = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		//driverr.get("https://www.google.com/");
	}

}
