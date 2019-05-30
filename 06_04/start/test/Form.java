import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "\\Users\\MJM\\Downloads\\geckodriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        formPage formpage = new formPage();

        formpage.submitForm(driver);

        ConfirmationPage confirmation = new ConfirmationPage();

        confirmation.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", confirmation.getAlertBannerText(driver));

        driver.quit();
    }




}
