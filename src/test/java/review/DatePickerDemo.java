package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePickerDemo {

    //two methods were created to get month and year and another one for day

    //select month and year method static void to be called in same class with 3 parameters

    static  void SelectMonthAndYear(WebDriver driver,String month,String year){

        while(true)
        {
            String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); //actual month
            String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); //actual year

            if (currentMonth.equals(month) && currentYear.equals(year))
            {
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // next button

        }

    }
    //select the day
    static void  Selectdate(WebDriver driver,String day){


        List<WebElement>allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

        for (WebElement dt :allDates)
        {
            if (dt.getText().equals(day))
            {
                dt.click();
                break;
            }
        }

    }



    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        //switch frame
        driver.switchTo().frame(0);

        //methos 1: using sendkeys
       // driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024");

        //method 2: using datepicker
        String year = "2025";
        String month = "May";
        String day = "16";

        driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // opens date picker

        SelectMonthAndYear(driver,month,year);
        Selectdate(driver,day);


    }

}
