package review;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        // preferibly use relative xpath ex: //*[@nsme="search"]
        /*
        Absolute xpath traverse through each node till it finds elements
        Relative Xpath directly jump and finds the element by using attribute
        Syntax
        //tagname[@attribute='value']
        //*[@attribute='value']
        */

        //Xpath w/ single attribute
        //driver.findElement(By.xpath("//input[@placeholder='Search;]")).sendKeys("TShirts");

        //Xpath w/ multiple attributes
        //driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Tshirt");

        /*Xpath w/ and or operators
        * //input[@name='Search' and @placeholder='Search']
        * //input[@name='Search' or @placeholder='Search']
        * */

        //xpath with and operator
        //driver.findElement(By.xpath("//input[@name='Search' and @placeholder='Search']")).sendKeys("tshirts");
        //driver.findElement(By.xpath("//input[@name='Search' or @placeholder='Search']")).sendKeys("tshirts");

        // xpath w/ inner text -text()
        //a[text()='Desktops']
        //a[text()='MacBook']

        /* <a href="https://xyz.com"> Click Me </a>
        * linkedtext = yes
        * inner text = yes
        * <div>welcome</div>
        * linktext=no
        * innertext=yes
        * */

        //driver.findElement(By.xpath("//*text()='MacBook'")).click();

       // boolean displaystatus=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
        //System.out.println(displaystatus);

        //String value=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
       // System.out.println(value);

        /*xpath with contains()
        //input[contains(@placeholder,'Sea')]
       */

        //driver.findElement(By.xpath("input[contains(@placeholder,'Sea')]")).sendKeys("Tshirt");
        //driver.findElement(By.xpath("input[starts-with(@placeholder,'Sea')]")).sendKeys("Tshirt");

        /*Handling dynamci attributes
        ----------------
        //*[@id='start' or @id='stop']
        //*[contains(@id,'st')]
        //*[starts-with(@id,'st')]
         */


        //chained xpath
        //div[@id='logo']/a/omg
        /*
        * <div[contains(text(),'')
        * //[contains(.,'')]
        *
        * */



}
}