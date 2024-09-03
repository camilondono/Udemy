package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RadioButtons {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

       WebElement male_rd = driver.findElement(By.xpath("//input[@id='male']"));
       WebElement female_rd = driver.findElement(By.xpath("//input[@id='female']"));

        System.out.println("select status of male radio button "+ male_rd.isSelected());
        System.out.println("select status of male radio button "+ female_rd.isSelected());

        male_rd.click();

        System.out.println("select status of male radio button "+ male_rd.isSelected());
        System.out.println("select status of male radio button "+ female_rd.isSelected());




    }

}
