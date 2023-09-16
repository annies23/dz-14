import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Buttons {
    public static void main(String[] args) {
        System.setProperty("web-driver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/elements");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement overlayElement = driver.findElement(By.id("fixedban"));
        js.executeScript("arguments[0].remove();", overlayElement);

        WebElement footerElement = driver.findElement(By.tagName("footer"));
        js.executeScript("arguments[0].style.display='none';", footerElement);

        WebElement buttonsTab = driver.findElement(By.xpath("//span[text()='Buttons']"));
        buttonsTab.click();

        WebElement clickMeButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        clickMeButton.click();

        WebElement message = driver.findElement(By.id("dynamicClickMessage"));
        System.out.println("Site message: " + message.getText());

        driver.quit();
    }

}


