package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleCheckBoxes {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        //1 select check box
       // driver.findElement(By.xpath("//input[@id='sunday']")).click();

        //2 capturing all checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        System.out.println("Number of Checkboxes "+ checkboxes.size());

        //3 selecting all checkboxes
        /* for(int i=0; i<checkboxes.size();i++){
            checkboxes.get(i).click();

        }*/

        /*for(WebElement chkbox:checkboxes){
            chkbox.click();

        }*/

        //4 select last 3 checkboxes
        //total number of checkboxes - boxes to select = starting index

        /*for(int i=4; i< checkboxes.size();i++){
            checkboxes.get(i).click();
        }*/

        //5 slect first 3 checkboxes
        /*for(int i=0;i<3;i++){
            checkboxes.get(i).click();
        }*/
        Thread.sleep(5000);

        //6 select/unselect checkboxes
        for(WebElement chkbox:checkboxes){
            if (chkbox.isSelected()){
                chkbox.click();
            }
            else {
                chkbox.click();
            }
            chkbox.click();
        }

        //7 select specific checkbox randomly
        for(int i=0; i<checkboxes.size();i++){
            if(i==1 || i==3 || i==6){
                checkboxes.get(i).click();

            }
        }




    }

}
