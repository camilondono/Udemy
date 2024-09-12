
/*
* Login --@BeforeMethod
* Search -- @Test
* Logout --@AfterMethod
* Login
* advanced Search-- @Test
* Logout
* */


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo1 {


    @BeforeMethod
    void Login(){
        System.out.println("this is Login");
    }
    @Test(priority = 1)
    void search(){
        System.out.println("this is search...");
    }
    @Test(priority = 2)
    void advancedsearch(){
        System.out.println("Advanced search...");
    }


    @AfterMethod
    void logout(){
        System.out.println("this is logout");
    }


}
