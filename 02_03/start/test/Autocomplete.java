import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "\\Users\\MJM\\Downloads\\geckodriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement auto = driver.findElement(By.id("autocomplete"));
        auto.sendKeys("7750 Manarat Al Faizin");
        Thread.sleep(1000);

        WebElement result = driver.findElement(By.className("pac-item"));
        result.click();

        driver.quit();
    }
}
