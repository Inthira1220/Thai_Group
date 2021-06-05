package nadirProject3;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utility.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class project3vyTruck {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
       driver= WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       driver.get("https://qa3.vytrack.com/user/login");
    }
//    @AfterClass
//    public void tearDown(){
//        driver.close();
//    }
    @Test (priority = 1)
    public void logIn(){
        WebElement loginVyTruck =driver.findElement(By.xpath("//input[@type='text']"));
        loginVyTruck.sendKeys("user151");
        WebElement passwordVyTruck =driver.findElement(By.xpath("//input[@type='password']"));
        passwordVyTruck.sendKeys("UserUser123", Keys.ENTER);

    }
    @Test (priority = 2)
    public void fleetSelector (){
        WebElement fleetSelectFirst = driver.findElement(By.xpath("//li[@class='dropdown dropdown-level-1']"));
        fleetSelectFirst.click();
        WebElement selectedFleet = driver.findElement(By.xpath("//span[@class='title title-level-2']"));
        selectedFleet.click();
    }



}
