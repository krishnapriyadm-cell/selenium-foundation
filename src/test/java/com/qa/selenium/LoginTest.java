
	package com.qa.selenium;

	import org.testng.annotations.Test;

	
		public class LoginTest {
			
			

		   
		    @Test(groups = "smoke")
		    public void verifyLogin() {
		        System.out.println("TestNG setup verified");
		        System.out.println("Login branch practice");
		    }

		    
		    @Test(groups = "regression")
		    public void verifyLogout() {
		        System.out.println("Logout verified");
		    }

		
	    }
	

