package com.qa.selenium;

		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;

		public class SelectDropdownPractice {

		    public static void main(String[] args) {

		        WebDriver driver = new ChromeDriver();

		        driver.get(
		                "https://www.selenium.dev/selenium/web/formPage.html"
		        );

		        // Single-selection dropdown
		        WebElement singleDropdown =
		                driver.findElement(By.name("selectomatic"));

		        Select singleSelect =
		                new Select(singleDropdown);

		        singleSelect.selectByVisibleText("Four");

		        WebElement currentOption =
		                singleSelect.getFirstSelectedOption();

		        System.out.println(currentOption.getText());

		        // Multiple-selection dropdown
		        WebElement multipleDropdown =
		                driver.findElement(By.name("multi"));

		        Select multipleSelect =
		                new Select(multipleDropdown);

		        multipleSelect.selectByValue("ham");
		        multipleSelect.selectByValue("onion gravy");

		        List<WebElement> selectedFoods =
		                multipleSelect.getAllSelectedOptions();

		        for (WebElement item : selectedFoods) {
		            System.out.println(item.getText());
		        }

		        multipleSelect.deselectAll();

		        selectedFoods =
		                multipleSelect.getAllSelectedOptions();

		        System.out.println(selectedFoods.size());

		        driver.quit();
		    }
		
	}


