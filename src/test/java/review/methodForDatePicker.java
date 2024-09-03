package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class methodForDatePicker {

    static  void SelectMonthAndYear(WebDriver driver, String month, String year){

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

    static void  Selectdate(WebDriver driver,String day){


        List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

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

    }

}
