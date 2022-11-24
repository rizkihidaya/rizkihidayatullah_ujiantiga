package com.juaracoding.rizkihidayatullah.ujiantiga.pageobject.pages;

import com.juaracoding.rizkihidayatullah.ujiantiga.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    private WebDriver driver;

    public Login() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    WebElement usernameLogin;

    @FindBy(id = "password")
    WebElement passwordLogin;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[2]/div[1]/form[1]/p[2]/span[1]/span[1]")
    WebElement visiblePassword;

    @FindBy(id = "rememberme")
    WebElement checklistRememberme;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[2]/div[1]/form[1]/p[3]/button[1]")
    WebElement btnLogin;

    @FindBy(xpath = "//h1[@class='page-title']")
    WebElement txtMyAccount;


    public void loginForm(String email, String password) {
        this.usernameLogin.sendKeys(email);
        System.out.println("insert username or email login");
        this.passwordLogin.sendKeys(password);
        System.out.println("insert password login");
        visiblePassword.click();
        checklistRememberme.click();
        btnLogin.click();
    }

    public String getTxtMyAccount() {
        return txtMyAccount.getText();
    }
}
