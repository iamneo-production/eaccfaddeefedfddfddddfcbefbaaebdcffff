import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

public class FlipkartLinksTest {
    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Set up WebDriver (assuming you're using Chrome)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testFlipkartLinks() {
        // Navigate to Flipkart website
        driver.get("https://www.flipkart.com");

        // Find all the links on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Print the count of links
        System.out.println("Number of links on Flipkart homepage: " + links.size());

        // Print link text and URLs
        for (WebElement link : links) {
            String linkText = link.getText();
            String linkUrl = link.getAttribute("href");
            System.out.println("Link Text: " + linkText + " - URL: " + linkUrl);
        }
    }

    @AfterTest
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
