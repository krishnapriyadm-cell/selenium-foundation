package com.qa.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryPracticeTest {

    @Test(retryAnalyzer = RetryAnalyzer.class, enabled = false)
    public void verifyPayment() {

        System.out.println("Executing verifyPayment");
        Assert.fail("Intentional failure for retry practice");
    }
}