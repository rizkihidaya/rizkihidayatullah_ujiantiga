package com.juaracoding.selenium;

import com.juaracoding.rizkihidayatullah.ujiantiga.pageobject.drivers.DriverSingleton;
import com.juaracoding.rizkihidayatullah.ujiantiga.pageobject.pages.Register;
import com.juaracoding.rizkihidayatullah.ujiantiga.pageobject.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRegister {
    public static WebDriver driver;
    private Register register;

    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        driver.get(Constants.URL_LOGIN);
    }

    @BeforeMethod
    public void pageObject() {
        register = new Register();
    }

    @AfterClass
    public void closeBrowser() {
        delay(3);
//        driver.quit();
        DriverSingleton.closeObjectInstance();
    }

    @Test
    public void testValidLogin() {
        delay(Constants.DETIK);
        register.registerForm("rizki_h1","rizki.hidayatullah007@email.com","@rizki03081996");
        Assert.assertEquals(register.getTxtMyAccount(), "MY ACCOUNT");
        System.out.println("Test case valid login");
    }

    static void delay(int detik) {
        try {
            Thread.sleep(1000*detik);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
