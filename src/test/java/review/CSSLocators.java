package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {
    public static void main(String[]args){


        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize(); // to maximaize window

        // tag id tag#id
        // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
        //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");

        //tag class  tag.classname
        //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
        //remove tag but leave the dot. multiple elements may not have same tag
        //driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");

        //tag attribute                                  no double quotes inside double quotes
        //driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
        //down below tag is optional
       // driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-shirts");

        //tag class attribute
        driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("T-shirts");











    }


}
