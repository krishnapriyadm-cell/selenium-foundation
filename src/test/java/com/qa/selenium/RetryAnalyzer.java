package com.qa.selenium;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    private int retryCount = 0;
    private int maximumRetryCount = 2;

    @Override
    public boolean retry(ITestResult result) {

        if (retryCount < maximumRetryCount) {
            retryCount++;
            return true;
        }

        return false;
    }
}
