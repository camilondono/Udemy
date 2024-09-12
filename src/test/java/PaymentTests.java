import org.testng.annotations.Test;

public class PaymentTests {

    @Test(priority = 1,groups = {"sanity","regression","functional"})
    void paymentInDollars(){
        System.out.println("Payment in Dollars");
    }

    @Test(priority = 1,groups = {"sanity","regression","functional"})
    void paymentInEruos(){
        System.out.println("Payment in Euros");
    }

    @Test(priority = 1,groups = {"sanity","regression","functional"})
    void paymentInPesos(){
        System.out.println("Payment in Pesos");
    }

}
