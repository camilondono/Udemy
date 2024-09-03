package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StaticTable {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //find total number of rows in a table
        int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("number of rows: "+rows);

        //find total number of columns


        int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("Number of coluns is: "+cols);

        //read data from specific row and column ex(5th row and 1st column)


        String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
        System.out.println(bookName);// Master in Selenium

        String bookName2 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[3]")).getText();
        System.out.println(bookName2);// Javascript

        //read the data from all rows and colums


        /*for (int r=2;r<=rows;r++)
        {
            for (int c=1;c<=cols;c++)
            {
            String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
                System.out.print(value+"\t"); // to print data in table for \t stands for tab back slash
            }
            System.out.println();
        }

         */

        //Print book names whose author is Mukesh
        /*for(int r=2;r<=rows;r++){
            String autherNames=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
            if(autherNames.equals("Mukesh"))
            {
                String BookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
                System.out.println(BookName+"\t"+autherNames);
            }
        }*/

        // Find total price of all the books

        int total=0;
        for(int r=2;r<=rows;r++) {
            String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[4]")).getText();
            total=total+Integer.parseInt(price);

        }
        System.out.println("Total price of all books is: "+total);


    }

}
