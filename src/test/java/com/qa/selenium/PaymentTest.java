

package com.qa.selenium;
import org.testng.annotations.Optional;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PaymentTest {
	
    @Parameters("environment")
    @Test(groups = "smoke")
    public void verifyPayment(@Optional("LOCAL") String environment)
              {
    	
        System.out.println("Payment verified in " + environment);
    }

}

