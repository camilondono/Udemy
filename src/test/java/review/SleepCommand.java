package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SleepCommand {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        //implicit wait
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        /*
        * single time one statement
        * it will not wait till max time if element is available
        * applicable for all the elements
        * easy to use
        * */

        //explicitWait
        /*
        * works based on the time and condition
        * conditional based, it will work more effectively
        * finding elements is inclusive(for some conditions)
        * it will wait for condition to be true, then consider the time
        * we need to write multiple statements for multiple elements
        * */

        WebDriverWait myWait= new WebDriverWait(driver,Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement textUserName = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        textUserName.sendKeys("Admin");

        WebElement loginButton=myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='login]")));
        loginButton.click();

        //driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");



    }

}
