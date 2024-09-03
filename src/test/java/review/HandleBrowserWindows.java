package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindows {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> windowIDs = driver.getWindowHandles();

        /*approach1

        List<String> windowList = new ArrayList<>(windowIDs);
        String parentID = windowList.get(0);
        String ChildID = windowList.get(1);

        driver.switchTo().window(ChildID); // by switching it will focus on the window we desire

        System.out.println(driver.getTitle()); // driver focus on title window even a child window is open
        */

        //approach2
        for(String windID:windowIDs){

            String title = driver.switchTo().window(windID).getTitle();

            if (title.equals("OrangeHRM")){
                System.out.println(driver.getCurrentUrl());
            }

        }





    }

}
