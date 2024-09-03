package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

public class DatePickerDemo2 {

    //user define function for converting month from string -------> Month
    static Month convertMonth(String month) {
        HashMap<String, Month> monthMap = new HashMap<String, Month>();

        monthMap.put("January", Month.JANUARY);
        monthMap.put("February", Month.FEBRUARY);
        monthMap.put("March", Month.MARCH);
        monthMap.put("April", Month.APRIL);
        monthMap.put("May", Month.MAY);
        monthMap.put("June", Month.JUNE);
        monthMap.put("July", Month.JULY);
        monthMap.put("August", Month.AUGUST);
        monthMap.put("September", Month.SEPTEMBER);
        monthMap.put("October", Month.OCTOBER);
        monthMap.put("November", Month.NOVEMBER);
        monthMap.put("December", Month.DECEMBER);

        Month vmonth = monthMap.get(month);
        if (vmonth == null) {
            System.out.println("Invalid Month...");

        }
        return vmonth;
    }

    static void selectDate(WebDriver driver, String requiredYear, String requiredMonth, String requireDate)
    {

        //select Year
        WebElement yearDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select selectYear = new Select(yearDropDown);
        selectYear.selectByVisibleText(requiredYear);

        //select month

        while (true) {
            String displayMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

            //convert requiredMonth and displayMonth into Month Objects
            Month expectedMonth = convertMonth(requiredMonth);
            Month currentMonth = convertMonth(displayMonth);


            //compare months
            int result = expectedMonth.compareTo(currentMonth);

            // 0 months are equal
            //>0 future month
            //<0 past

            if (result < 0) //past month
            {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();

            } else if (result > 0) //future
            {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            } else {
                break;
            }

        }
        //date
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
        for (WebElement dt : allDates) {
            if (dt.getText().equals(requireDate)) {
                dt.click();
                break;
            }
        }



    }




    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("//https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //input DOB
        String requiredYear = "2021";
        String requiredMonth = "December";
        String requiredDate = "16";

        driver.switchTo().frame("frame-one796456169");
        driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();

        selectDate(driver,requiredYear,requiredMonth,requiredDate);



    }


}

