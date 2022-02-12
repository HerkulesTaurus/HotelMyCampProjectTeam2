package tests.US1001;

import org.testng.annotations.Test;
import utilities.Driver;

public class TC02 {

    @Test
    public void test1(){

        Driver.getDriver().get("https://www.hotelmycamp.com");

    }
  
}