
/*
* 1- open app
* 2- test logo presence
* 3-login
* 4- close
*
* */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRMTest{

    WebDriver driver;

    @Test(priority = 1)
    void openApp(){

       // WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

    }
    @Test(priority = 2)
    void testLogo(){

        Boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        System.out.println("Logo is displayed: "+status);

    }
    @Test(priority = 3)
    void  testLogin(){

        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();



    }
    @Test(priority = 4)
    void closeApp(){

        driver.quit();


    }


}
