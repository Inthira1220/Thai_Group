package nadirProject3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utility.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class project3vyTruck {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");
    }

    //    @AfterClass
//    public void tearDown(){
//        driver.close();
//    }
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
    public void clickGridInfo() throws InterruptedException {
        WebElement clickDisplay = driver.findElement(By.xpath("//tr[@class='grid-row row-click-action']"));
        Thread.sleep(500);
        clickDisplay.click();


        String expectedClickDisplay = "Car - Entities - System - Car - Entities - System";
        String actualClickDisplay = driver.getTitle();
        Assert.assertEquals(expectedClickDisplay, actualClickDisplay);

    }
//    @Test(priority = 4)
    public void addEvent(){
        WebElement selectAddEvent = driver.findElement(By.xpath("//a[@class='btn icons-holder-text no-hash']"));
        selectAddEvent.click();
    }
    @Test(priority = 5)
    public void fillEventText() throws InterruptedException {

        //WebElement addTextBox1 = driver.findElement(By.xpath("//input[@required='required']"));
        WebElement addTextBox1 = driver.findElement(By.xpath("//input[@data-validation='{\"NotBlank\":{\"message\"" +
                ":\"This value should not be blank.\",\"payload\":null},\"Length\":{\"maxMessage\":\"This value " +
                "is too long. It should have {{ limit }} character or less.|This value is too long. It should have " +
                "{{ limit }} characters or less.\",\"minMessage\":\"This value is too short. It should have {{ limit }}" +
                " character or more.|This value is too short. It should have {{ limit }} characters or more.\",\"exactMessage" +
                "\":\"This value should have exactly {{ limit }} character.|This value should have exactly {{ limit }} " +
                "characters.\",\"charsetMessage\":\"This value does not match the expected {{ charset }} charset.\",\"max\"" +
                ":255,\"min\":null,\"charset\":\"UTF-8\",\"payload\":null}}']"));

        addTextBox1.sendKeys("keada123456");
        Thread.sleep(1000);
        WebElement addTextBox1Save = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        Thread.sleep(1000);
        addTextBox1Save.click();


    }
}