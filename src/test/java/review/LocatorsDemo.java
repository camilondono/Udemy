package review;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");

        //WebElement searchBox = driver.findElement(By.name("search"));
        //searchBox.sendKeys("MacBook");

        //driver.findElement(By.name("search")).sendKeys("MacBook"); single step

        //id
        //WebElement logo = driver.findElement(By.id("logo"));
       // boolean status=logo.isDisplayed();

       //boolean status=driver.findElement(By.id("logo")).isDisplayed();
       //System.out.println("Display status "+ status);

       //linkText & partialLinkText -- only for link

       //driver.findElement(By.linkText("Tablets")).click(); linkText preferable
       //driver.findElement(By.linkText("Tab")).click(); partiallinkText

       //classname use for a group of elements
        //List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
        //System.out.println(headerLinks.size());  //7

        //tagname
        //List<WebElement> links = driver.findElements(By.tagName("a"));
        //System.out.println(links.size());

        //List<WebElement> images = driver.findElements(By.tagName("img"));
        //System.out.println(images.size()); //18









    }

}

