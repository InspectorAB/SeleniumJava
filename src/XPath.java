import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        
        // 1. Basic XPath using attribute
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

        // 2. XPath with multiple attributes (AND condition)
        driver.findElement(By.xpath("//input[@id='password' and @name='password']")).sendKeys("secret_sauce");

        // 3. XPath using `contains()` function
        driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();

        // 4. XPath using `starts-with()`
        WebElement logo1 = driver.findElement(By.xpath("//div[starts-with(@class,'login_logo')]"));
        System.out.println("Logo text: " + logo1.getText());

        // 5. XPath using text() exact match
        WebElement productHeader = driver.findElement(By.xpath("//div[text()='Products']"));
        System.out.println("Page Header: " + productHeader.getText());

        // 6. XPath using contains(text())
        WebElement header2 = driver.findElement(By.xpath("//div[contains(text(),'Product')]"));
        System.out.println("Partial Text Match: " + header2.getText());

        // 7. XPath using position (e.g., first item)
        WebElement firstAddToCart = driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]"));
        firstAddToCart.click();

        // 8. XPath using last()
        WebElement lastAddToCart = driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[last()]"));
        lastAddToCart.click();

        // 9. XPath using index
        WebElement thirdItemName = driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[3]"));
        System.out.println("Third item: " + thirdItemName.getText());

        // 10. XPath using parent
        WebElement parentOfPrice = driver.findElement(By.xpath("//div[@class='inventory_item_price']/parent::div"));
        System.out.println("Parent of price div: " + parentOfPrice.getAttribute("class"));

        // 11. XPath using ancestor
        WebElement ancestor = driver.findElement(By.xpath("//div[@class='inventory_item_price']/ancestor::div[@class='inventory_item']"));
        System.out.println("Ancestor container class: " + ancestor.getAttribute("class"));

        // 12. XPath using following-sibling
        WebElement sibling = driver.findElement(By.xpath("//div[@class='inventory_item_name'][1]/following-sibling::div[@class='inventory_item_desc']"));
        System.out.println("Description of first item: " + sibling.getText());

        // 13. XPath using preceding-sibling
        WebElement priceLabel = driver.findElement(By.xpath("//button[text()='ADD TO CART']/preceding-sibling::div[@class='inventory_item_price']"));
        System.out.println("Price of item: " + priceLabel.getText());

        // 14. XPath using self
        WebElement selfElement = driver.findElement(By.xpath("//div[@class='inventory_item_name']/self::div"));
        System.out.println("Self text: " + selfElement.getText());

        // 15. XPath using descendant
        WebElement descendant = driver.findElement(By.xpath("//div[@class='inventory_item'][1]/descendant::button"));
        System.out.println("Descendant button text: " + descendant.getText());

        // Close the browser
        driver.quit();
	}

}
