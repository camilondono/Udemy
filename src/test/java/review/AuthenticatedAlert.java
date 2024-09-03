package review;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedAlert {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        //driver.get("https://the-internet.herokuapp.com/basic_auth");
        //syntax
        // https://username:password@the-internet.herokuapp.com/basic_auth
        //injection process

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");


        driver.manage().window().maximize();


    }

}
