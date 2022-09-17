package com.coinmena.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {

    public WebDriver driver;
    static  FileInputStream fis;
    public static Properties prop;

    public WebDriver driverInit() {

        try {
            fis = new FileInputStream(System.getProperty("user.dir") + "/config.properties");
            prop = new Properties();
            prop.load(fis);
            if (prop.get("browser").equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver");
                driver = new ChromeDriver();
                System.out.println(driver);
            }

        } catch (IOException e) {
            System.out.println("Failed at Driver init");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;
    }


}
