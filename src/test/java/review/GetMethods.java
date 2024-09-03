package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethods {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        //get url - opens the url on the browser
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);

        //getTitle() - returns title of the page
        System.out.println(driver.getTitle()); //OrangeHRM

        //getCurrentURL - returns URL of the page
        System.out.println(driver.getCurrentUrl()); //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

        //getPageSource() - returns source code of the page
        //System.out.println(driver.getPageSource());

        //getWindowHandle() - returns ID of the single browser window
        //String windowId = driver.getWindowHandle();
        //System.out.println("Window ID "+ windowId);

        driver.findElement(By.linkText("OrangeHRM, inc")).click(); // this will open a new browser window
        Set<String> windowids = driver.getWindowHandles();
        System.out.println(windowids);

    }
}
