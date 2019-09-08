package com.test;





import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.utility.ReadPropFile;

public class BaseTest {
	WebDriver driver;
	Properties prop;

	// @Before
	// public void open() {
//		// String browser = System.getProperty("browser");
//
//		prop = ReadPropFile.ReadFile("");
//		String browser = prop.getProperty("browser");
//		if (browser.equals("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "/Users/muhammadagalib/Downloads/chromedriver");
//			driver = new ChromeDriver();
//
//		} else if (browser.equals("firefox")) {
//			driver = new FirefoxDriver();
//
//		} else if (browser.equals("ie")) {
//			driver = new InternetExplorerDriver();
//		} else if (browser.equals("Safari")) {
//			driver = new SafariDriver();
//		}
//
//	}
//
//	WebDriver driver;
//	Properties prop;

	@Before
	public void open() throws IOException {
		prop = ReadPropFile.ReadFile("/Users/muhammadagalib/eclipse-workspace/MavenProject/config.properties");
		String browser = prop.getProperty("browser");
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/muhammadagalib/Downloads/chromedriver");
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();

		} else if (browser.equals("ie")) {
			driver = new InternetExplorerDriver();
		} else if (browser.equals("Safari")) {
			driver = new SafariDriver();
		}
		driver.get(prop.getProperty("url"));
		System.out.println("cxvjksdgfcjh,asr");
		

	}

}
