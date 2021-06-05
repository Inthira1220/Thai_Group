package nadirProject3;
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
    @AfterClass
    public void tearDown(){
        driver.close();
    }
    @Test //(priority = 1)
    public void logIn(){

    }


}
