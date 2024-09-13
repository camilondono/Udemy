package testNGudemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeHRM {

    WebDriver driver;

    @BeforeClass
    void setup() throws InterruptedException {
       driver = new ChromeDriver();
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       driver.manage().window().maximize();
       Thread.sleep(3000);

    }
    @Test(priority = 1)
    void testlogo(){
        boolean status = driver.findElement(By.xpath("//img[@a;t='cpmpany-branding']")).isDisplayed();
        Assert.assertEquals(status,true);
    }

    @Test(priority = 2)
    void testAppUrl(){
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/");
    }
    @Test(priority = 3,dependsOnMethods = {"testAppUrl"})
    void testHomePageTitle(){
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }

}
