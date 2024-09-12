import org.testng.annotations.*;

/*
* Login ---@BeforeClass
* Search --@Test
* Adv Search ---@Test
* Logout ---@fterClass
* */




public class AnnotationsDeme2 {

    @BeforeClass
    void Login(){
        System.out.println("this is Login");
    }
    @AfterClass
    void logout() {
        System.out.println("this is logout");
    }
    @Test(priority = 1)
    void search(){
        System.out.println("this is search...");
    }
    @Test(priority = 2)
    void advancedsearch(){
        System.out.println("Advanced search...");
    }



}



