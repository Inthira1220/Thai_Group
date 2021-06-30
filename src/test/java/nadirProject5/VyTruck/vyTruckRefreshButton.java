package nadirProject5.VyTruck;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class vyTruckRefreshButton {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");
    }
    @Test(priority = 0)
    public void logIn() {
        WebElement loginVyTruck = driver.findElement(By.xpath("//input[@type='text']"));
        loginVyTruck.sendKeys("user151");
        WebElement passwordVyTruck = driver.findElement(By.xpath("//input[@type='password']"));
        passwordVyTruck.sendKeys("UserUser123", Keys.ENTER);

    }

    @Test(priority = 1)
    public void fleetSelector() {
        WebElement fleetSelectFirst = driver.findElement(By.xpath("//li[@class='dropdown dropdown-level-1']"));
        fleetSelectFirst.click();
        WebElement selectedFleet = driver.findElement(By.xpath("//span[@class='title title-level-2']"));
        selectedFleet.click();

    }
    @Test(priority = 3)
    public void refreshButton() throws InterruptedException {
        WebElement refreshTheButton = driver.findElement(By.xpath("//i[@class='fa-repeat']"));
        Thread.sleep(1000);
        refreshTheButton.click();

        String expectedRefreshButton = refreshTheButton.getText();
        String actualRefreshButton = "Refresh";
        Assert.assertTrue(refreshTheButton.isDisplayed());
    }
}
