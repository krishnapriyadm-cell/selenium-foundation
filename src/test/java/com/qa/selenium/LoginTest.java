
	package com.qa.selenium;

	import org.testng.annotations.Test;

	
		public class LoginTest {
			
			

		   
		    @Test(groups = "smoke")
		    public void verifyLogin() {
		        System.out.println("TestNG setup verified");
		        System.out.println("Main branch version");
		        System.out.println("Login branch practice");
		        System.out.println("Conflict branch version");

		    }

		    
		    @Test(groups = "regression")
		    public void verifyLogout() {
		        System.out.println("Logout verified");
		    }

		
	    }
	

