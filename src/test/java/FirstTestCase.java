
/*
1 open app
2 login
3logout
*
* */


import org.testng.annotations.Test;

public class FirstTestCase {
    @Test(priority = 1)
    void openApp()
    {
        System.out.println("opening APP");
    }
    @Test(priority = 2)
    void logIn()
    {
        System.out.println("Login to APP");

    }
    @Test(priority = 3)
    void logOut()
    {
        System.out.println("logout from APP");

    }
}
