package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleFrames {

    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        //WebElement Approach frame1
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");

        //before going to frame2 we need to focus to the main page and than switch to the next frame
        driver.switchTo().defaultContent();

        //frame2
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("automation");

        //frame 3
        driver.switchTo().defaultContent();

        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Programming");

        //Switch to inner frame (part of frame3)
        driver.switchTo().frame(0);  //switch to inner frame

        driver.findElement(By.xpath("//div[@id='i5']//div[@class='AB7Lab Id5V1']")).click();








    }

}
