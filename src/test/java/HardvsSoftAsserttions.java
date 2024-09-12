import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAsserttions {
    //@Test
    void test_hardAsserions(){
        System.out.println("testing....");
        System.out.println("testing....");

        Assert.assertEquals(1,2); //hard assertion

        System.out.println("testing....");
        System.out.println("testing....");

        //if we run this test only the first two will execute and last 2 will be ignore

    }
    @Test
    void test_softAssertion(){

        // will access from object of seft asserts
        System.out.println("testing....");
        System.out.println("testing....");

        SoftAssert sa = new SoftAssert();

        sa.assertEquals(1,1); //hard assertion

        System.out.println("testing....");
        System.out.println("testing....");

        sa.assertAll(); // this is mandatory

    }


}
