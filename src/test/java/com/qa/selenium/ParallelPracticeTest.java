package com.qa.selenium;

import org.testng.annotations.Test;

public class ParallelPracticeTest {

    @Test
    public void verifyLogin() {
System.out.println(
                "verifyLogin: " + Thread.currentThread().getName()
                + " | ID: " + Thread.currentThread().threadId()
        );
    }

    @Test
    public void verifyPayment() {
    	System.out.println(
    	        "PaymentModule: " + Thread.currentThread().getName()
    	        + " | ID: " + Thread.currentThread().threadId()
    	);
    }

    @Test
    public void verifyLogout() {
        System.out.println(
                "verifyLogout: " + Thread.currentThread().getName()
        );
    }
}
