package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //this opens new browser

        Thread.sleep(5000);
        //driver.close(); // closes parent window
        driver.quit(); // closes all windows

        //    https://testautomationpractice.blogspot.com/

    }

}
