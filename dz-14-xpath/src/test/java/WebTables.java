import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
    public static void main(String[] args) {
        System.setProperty("web-driver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/webtables");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement addsElement = driver.findElement(By.id("google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0__container__"));
        js.executeScript("arguments[0].remove();", addsElement);

        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();

        WebElement firstNameField = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
        firstNameField.sendKeys("Sailor");

        WebElement lastNameField = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
        lastNameField.sendKeys("Moon");

        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
        emailField.sendKeys("sailor.moon@magic.com");

        WebElement ageField = driver.findElement(By.xpath("//*[@id=\"age\"]"));
        ageField.sendKeys("23");

        WebElement salaryField = driver.findElement(By.xpath("//*[@id=\"salary\"]"));
        salaryField.sendKeys("60000");

        WebElement departmentField = driver.findElement(By.xpath("//*[@id=\"department\"]"));
        departmentField.sendKeys("IT");

        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        submitButton.click();

        WebElement editButton = driver.findElement(By.xpath("//*[@id=\"edit-record-4\"]"));
        editButton.click();

        WebElement editedFirstNameField = driver.findElement(By.id("firstName"));
        editedFirstNameField.clear();
        editedFirstNameField.sendKeys("Mindy");

        WebElement updateButton = driver.findElement(By.id("submit"));
        updateButton.click();

        driver.quit();
    }
}
