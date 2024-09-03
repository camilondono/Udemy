package review;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationalCommands {

    public static void main(String[] args) throws MalformedURLException {

        WebDriver driver = new ChromeDriver();

        //driver.get("https://demo.nopcommerce.com/"); accepts url only in string format


        //driver.navigate().to("https://demo.nopcommerce.com/"); passed a URL object
        //URL myurl = new URL("https://demo.nopcommerce.com/");
        //driver.navigate().to(myurl);  mostly use in development point of view but not for automation

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();



    }

}
