package review;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitSDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //declaration
        Wait<WebDriver> myWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofSeconds(2))
                                .ignoring(NoSuchElementException.class);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement textusername = myWait.until(new Function<WebDriver, WebElement>() {
            public  WebElement apply(WebDriver driver){
               WebElement textusername =  driver.findElement(By.xpath("//input[@placeholder='Username']"));
               return  textusername;
            }
        });
        textusername.sendKeys("Admin");


    }

}
