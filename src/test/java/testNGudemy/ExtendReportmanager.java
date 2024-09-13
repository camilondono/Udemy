package testNGudemy;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtendReportmanager implements ITestListener {

    public ExtentSparkReporter sparkReporter; //UI of the report
    public ExtentReports extent;//populate common info on the report
    public ExtentTest test; //creating test case entries in the report and update status of the test methods

    public void onStart(ITestContext context){
        sparkReporter= new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");
        sparkReporter.config().setDocumentTitle("Automation Report");
        sparkReporter.config().setTheme(Theme.DARK);

        extent= new ExtentReports();
        extent.attachReporter(sparkReporter);

        extent.setSystemInfo("Computer Name","localHost");
        extent.setSystemInfo("Enviroment","QA");
        extent.setSystemInfo("Tester Name","Camilo");
        extent.setSystemInfo("os", "Windows11");
        extent.setSystemInfo("Browser Name","Chrome");

    }

    public void onTestSuccess(ITestResult result){
        test = extent.createTest(result.getName()); // creates new entry in the report
        test.log(Status.PASS, "Testcase is: "+result.getName()); //updates status p/f/s

    }

    public void onTestFailure(ITestResult result){
        test=extent.createTest(result.getName());
        test.log(Status.FAIL,"Test case is: "+result.getName());
        test.log(Status.FAIL, "Test case Failed because is: "+result.getThrowable());

    }

    public void onTestSkipped(ITestResult result){
        test=extent.createTest(result.getName());
        test.log(Status.SKIP, "Test case is SKIPPED: "+ result.getName());

    }


    public void onFinish(ITestContext context){
        extent.flush();

    }

}
