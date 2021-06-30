package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VytrackUtil {

    //Vytrack truck driver 151 login method
    public static void truckDriver151Login(WebDriver driver){

        WebElement userInput = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        WebElement passInput = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        userInput.sendKeys("user151");
        passInput.sendKeys("UserUser123");
        button.click();
    }

    //Vytrack truck driver 152 login method
    public static void truckDriver152Login(WebDriver driver){

        WebElement userInput = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        WebElement passInput = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        userInput.sendKeys("user152");
        passInput.sendKeys("UserUser123");
        button.click();
    }

    // method to go to the Cars page
    public static void carsPage(WebDriver driver){

        WebElement fleetModule = driver.findElement(By.xpath("//span[@class='title title-level-1']"));
        BrowserUtil.seconds(2);
        fleetModule.click();

        WebElement vehicle = driver.findElement(By.xpath("//span[@class='title title-level-2']"));
        vehicle.click();
        BrowserUtil.seconds(2);

    }

    // method to test the calendar access
    public static boolean calendarAccessTester(){
        Driver.getDriver().findElement(By.xpath("//a[@class='dropdown-toggle'][1]")).click();
        BrowserUtil.seconds(1);
        Driver.getDriver().findElement(By.xpath("//a[.='My Calendar']")).click();

        WebElement myCalendarHeader = Driver.getDriver().findElement(By.xpath("//h1[.='My Calendar']"));
        return myCalendarHeader.isDisplayed();

    }


}
