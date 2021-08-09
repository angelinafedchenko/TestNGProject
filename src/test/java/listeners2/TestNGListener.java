package listeners2;


import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

@Listeners
public class TestNGListener implements ITestListener {

 @Override
 public void onTestStart(ITestResult result) {
  System.out.println("TestCase Started and details are " + result.getName());
 }

 @Override
 public void onTestFailure(ITestResult result) {
  System.out.println("TestCase Failed and details are " + result.getName());
 }

}

