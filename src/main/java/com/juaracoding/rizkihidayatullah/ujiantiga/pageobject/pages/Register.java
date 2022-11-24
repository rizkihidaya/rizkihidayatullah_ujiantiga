package com.juaracoding.rizkihidayatullah.ujiantiga.pageobject.pages;

import com.juaracoding.rizkihidayatullah.ujiantiga.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
    private WebDriver driver;

    public Register() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "reg_username")
    WebElement username;

    @FindBy(id = "reg_email")
    WebElement email;

    @FindBy(id = "reg_password")
    WebElement password;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[2]/div[2]/form[1]/p[3]/span[1]/span[1]")
    WebElement visiblePassword;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[2]/div[2]/form[1]/p[4]/button[1]")
    WebElement btnRegister;

    @FindBy(xpath = "//h1[@class='page-title']")
    WebElement txtMyAccount;

    public void registerForm(String username, String email, String password) {
        this.username.sendKeys(username);
        System.out.println("Insert username");
        this.email.sendKeys(email);
        System.out.println("Insert email");
        this.password.sendKeys(password);
        System.out.println("Insert password");
        visiblePassword.click();
        System.out.println("Click for visible password");
        btnRegister.click();
        System.out.println("Click button register");
    }

    public String getTxtMyAccount() {
        return txtMyAccount.getText();
    }
}
