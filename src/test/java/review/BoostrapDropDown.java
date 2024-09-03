package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BoostrapDropDown {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

        //select single option

        // driver.findElement(By.xpath("//input[@value='Java']")).click();


        // capture all options and get size

       List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
        System.out.println("number of optios "+options.size());

        /* printing options from dropdown
        /for (WebElement op:options) {
            System.out.println(op.getText());
        } */

        // select multiple options
        for (WebElement op:options) {
            String option=op.getText();

            if (op.getText().equals("Java") || op.getText().equals("Python") || op.getText().equals("MySQL")){

                op.click();

            }

        }



    }
}
