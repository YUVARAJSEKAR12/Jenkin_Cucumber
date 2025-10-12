package com.app.base;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	
	//git changes
	//Git COnflict

		public static WebDriver driver = null;
		public static Properties prop = new Properties();
		public static Select s;

		public static void browserLaunch() {

			driver = new ChromeDriver();

		}

		public static void maxWindow() {
			driver.manage().window().maximize();
		}

		public static void loadUrl(String url) {
			driver.get(url);
		}

		public static void closeWindow() {

			driver.quit();

		}

		public static void clear(WebElement element) {
			element.clear();
		}

		public static void click(WebElement element) {
			element.click();
		}

		public static void inputText(WebElement element, String value) {
			element.sendKeys(value);
		}

		public static void selectByValueMethod(WebElement element, String value) {
			s = new Select(element);
			s.selectByValue(value);
		}

		public static void selectByVisibleTextMethod(WebElement element, String value) {
			s = new Select(element);
			s.selectByVisibleText(value);
		}

		public static void prop_read() {
			try {
				FileReader read = new FileReader(new File(
						"C:\\Users\\mkpan\\eclipse-workspace\\sand\\Cucumber_Task\\src\\test\\resources\\TestData\\config.properties"));

				prop.load(read);
				String url = prop.getProperty("url");
				//System.out.println(url);
				String username = prop.getProperty("username");
				//System.out.println(username);
				String password = prop.getProperty("password");
				//System.out.println(password);

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public static void test1(){
			System.out.println("test");

		}
		
		public static void prop_write() {
			try {
				FileReader read = new FileReader(new File(
						"C:\\Users\\mkpan\\eclipse-workspace\\sand\\Cucumber_Task\\src\\test\\resources\\TestData\\config.properties"));

				prop.load(read);
				String url = prop.getProperty("url");
				//System.out.println(url);
				String username = prop.getProperty("username");
				//System.out.println(username);
				String password = prop.getProperty("password");
				//System.out.println(password);

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void test2() {
			
		}
}
	

	





