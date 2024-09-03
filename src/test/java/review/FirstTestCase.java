package review;
import  org.openqa.selenium.chrome.ChromeDriver;
/*
 test case
 lauch browser chrome
 open url
 validate title
 close browser

 */

public class FirstTestCase {

    public static void main(String[] args){
       // either approach is correct
       //launch the browser
       ChromeDriver driver = new ChromeDriver();
        //WebDriver driver = new ChromeDriver();
        //WebDriver driver = new EdgeDriver();
        //open the url
        driver.get("https://demo.opencart.com/");

        // validate title should be "your store"

        String act_title=driver.getTitle();

        if(act_title.equals("Your Store")){
            System.out.println("Test Passed");
        }
        else{
            System.out.println("Test Failed");
        }

        // closed browser
        driver.close();



    }

}
