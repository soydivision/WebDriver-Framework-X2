package com.mycompany.app.test;

import com.mycompany.app.driver.DriverSingleton;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonConditions {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriverSingleton.getDriver();
    }

    @AfterMethod
    public void stopBrowser() {
       // DriverSingleton.closeDriver();
    }
}
