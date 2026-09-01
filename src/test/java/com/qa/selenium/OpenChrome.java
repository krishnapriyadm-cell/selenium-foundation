package com.qa.selenium;
import java.net.URI;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenChrome {

	public static void main(String[] args)throws MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//URI websiteAddress = URI.create("https://www.selenium.dev");
		//URL websiteURL = websiteAddress.toURL();
		//driver.navigate().to(websiteURL);
		driver.navigate().to("https://example.com");
		//driver.manage().window().fullscreen();
		//driver.manage().window().minimize();
		//driver.manage().window().maximize();
		Point requiredPosition = new Point(200,150); 
		driver.manage().window().setPosition(requiredPosition);
		Point actualPosition = driver.manage().window().getPosition(); 
		System.out.println(actualPosition);
		//Dimension browserSize = new Dimension(800, 500);
		//driver.manage().window().setSize(browserSize);
		//Dimension actualSize =
		        driver.manage().window().getSize();
		//System.out.println(actualSize);
		//Point requiredPosition =
		        new Point(100, 100);

		//driver.manage().window().setPosition(requiredPosition);

		//Point actualPosition =
		        driver.manage().window().getPosition();

		//System.out.println(actualPosition);

		//Point windowPosition =
		        driver.manage().window().getPosition();

		//System.out.println(windowPosition);
		//Dimension requiredSize =
		        new Dimension(1000, 700);

		//driver.manage().window().setSize(requiredSize);

		//Dimension actualSize =
		        driver.manage().window().getSize();

		//System.out.println(actualSize);
		//Dimension windowSize =
		//driver.manage().window().getSize();

		//System.out.println(windowSize);
		//String currentUrl = driver.getCurrentUrl();
		//System.out.println(currentUrl);
		//String pageTitle = driver.getTitle();
		//System.out.println(pageTitle);
		//String pageSource = driver.getPageSource();

		//System.out.println(pageSource);
		//driver.navigate().to("https://example.com");
		//driver.navigate().to("https://www.selenium.dev");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		//driver.get("https://example.com");
		driver.quit();
	}

}
