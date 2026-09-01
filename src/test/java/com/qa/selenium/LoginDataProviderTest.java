package com.qa.selenium;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.Reporter;

@Listeners(TestListener.class)

public class LoginDataProviderTest {

    @DataProvider(name = "provideLoginData")
    public Object[][] supplyLoginData() {
        return new Object[][] {
                {"Krishna", "Pass123", 1},
                {"Priya", "Pass456", 2}
        };
    }

    @Test(dataProvider = "provideLoginData")
    public void verifyLogin(
            String username,
            String password,
            int attemptNumber) {

        System.out.println(
                username + " | " + password + " | " + attemptNumber
        );
        Reporter.log("Login tested for: " + username, true);
    }
}