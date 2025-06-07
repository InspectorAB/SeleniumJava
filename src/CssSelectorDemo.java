import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");

        // 1. ID selector
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");

        // 2. Class selector
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");

        // 3. Attribute selector
        driver.findElement(By.cssSelector("input[id='login-button']")).click();

        // 4. Tag + ID combination
        WebElement logo = driver.findElement(By.cssSelector("div#login_button_container"));
        System.out.println("Container ID: " + logo.getAttribute("id"));

        // 5. Tag + class combination
        WebElement logoText = driver.findElement(By.cssSelector("div.login_logo"));
        System.out.println("Logo Text: " + logoText.getText());

        // 6. Multiple classes (chained)
        WebElement passwordInput = driver.findElement(By.cssSelector("input.form_input[type='password']"));
        passwordInput.clear();
        passwordInput.sendKeys("secret_sauce");

        // 7. Substring match: starts with (^)
        WebElement startsWithInput = driver.findElement(By.cssSelector("input[id^='user']"));
        startsWithInput.clear();
        startsWithInput.sendKeys("standard_user");

        // 8. Substring match: ends with ($)
        WebElement endsWithInput = driver.findElement(By.cssSelector("input[id$='name']"));
        endsWithInput.clear();
        endsWithInput.sendKeys("standard_user");

        // 9. Substring match: contains (*)
        WebElement containsInput = driver.findElement(By.cssSelector("input[id*='user']"));
        containsInput.clear();
        containsInput.sendKeys("standard_user");

        // 10. Direct child (parent > child)
        WebElement parentChild = driver.findElement(By.cssSelector("form > input[type='submit']"));
        System.out.println("Submit Button Type: " + parentChild.getAttribute("type"));

        // 11. Adjacent sibling (+)
        // Example not directly available on SauceDemo; this is for reference
        // driver.findElement(By.cssSelector("label + input"));

        // 12. General sibling (~)
        // Same here, for reference only
        // driver.findElement(By.cssSelector("label ~ input"));

        // Close the browser
        driver.quit();
    }
}
