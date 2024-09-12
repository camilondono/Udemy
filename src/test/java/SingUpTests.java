import org.testng.annotations.Test;

public class SingUpTests {

    @Test(priority = 1, groups = {"regression"})
    void signByEmail(){
        System.out.println("Sign by email");
    }

    @Test(priority = 2, groups = {"regression"})
    void signByFacebook(){
        System.out.println("Sign by Facebook");
    }

    @Test(priority = 3, groups = {"regression"})
    void signByTwitter(){
        System.out.println("Sign by Twitter");
    }

}
