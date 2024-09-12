package testNGudemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterstest {

    WebDriver driver;

    @BeforeClass
    @Parameters({"browser"}) // see xml file
    void setup(String br){
        switch (br){
            case "chrome" : driver = new ChromeDriver(); break;
            case "edge" : driver = new EdgeDriver(); break;
            case "firefox" : driver = new FirefoxDriver(); break;
            default: System.out.println("Invalid Browser"); return;

        }
        //driver= new ChromeDriver();
        driver.get("https://opensaource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

    }

    @Test(priority = 1)
    void testLogo(){

        boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertEquals(status,true);

    }
    @Test(priority = 2)
    void testTitle(){
    Assert.assertEquals(driver.getTitle(),"OrangeHRM");


    }

    @Test(priority = 3)
    void testURL(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensaource-demo.orangehrmlive.com/web/index.php/auth/login");


    }
    @AfterClass
    void tearDown(){
    driver.close();

    }


}
