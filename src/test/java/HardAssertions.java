import org.testng.Assert;

public class HardAssertions {

    void test(){


        //Assert.assertEquals("xyz","xyz");
        //Assert.assertEquals("xyz","xyz1");
        //Assert.assertEquals("xyz","xyz");
        //Assert.assertNotEquals(123,345); //passed expected not equals
        //Assert.assertTrue(true); //passed
       // Assert.assertTrue(1==2); //failed
        // Assert.assertTrue(1==1); //passed

        //Assert.assertFalse(1==2);//passed
        // Assert.assertFalse(1==1); //failed

        //Assert.fail(); // this method will intentionally fail the test

        //Hard assertions will directly access form assert class
        //there are limitations in hard assertions therefore its better to use soft assertions


    }

}
