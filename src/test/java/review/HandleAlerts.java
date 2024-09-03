package review;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        /*1 normal alert with OK button
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

        Thread.sleep(5000);
        // driver.switchTo().alert().accept();

        //you can also store it in a variable and perform your action
        Alert myalert = driver.switchTo().alert();
        myalert.accept();*/

        /*2 confirmation alert OK & cancel
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS confirm']")).click();
        driver.switchTo().alert().accept(); // this closes allert window using OK button
        //driver.switchTo().alert().dismiss();// closes alert window using Cancel button
        */

        //3 Prompt alert-input box
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Alert myalert = driver.switchTo().alert();

        System.out.println("Text msg on alert: "+myalert.getText());

        myalert.sendKeys("Welcome");
        myalert.accept();

        String res=driver.findElement(By.xpath("//p[@id='result']")).getText();
        if(res.contains("Welcome")){
            System.out.println("Test Passed");
        }
        else{
            System.out.println("Test Failed");
        }




    }

}
