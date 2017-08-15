package com.mtrading.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private static final String PAGE_URL = "https://accounts.mtrading.com/cas/login?language=en-US";
    private WebDriver webDriver;

    @FindBy(css = "#username")
    public WebElement emailInputWebElement;

    @FindBy(css = "#password")
    public WebElement passwordInputWebElement;

    @FindBy(css = "[name='submitButton']")
    public WebElement loginButtonWebElement;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this);
    }

    public String getUrl() {
        return LoginPage.PAGE_URL;
    }

    public void open (){
        this.webDriver.get(this.getUrl());
    }

    public void login(String email, String password) {
        this.emailInputWebElement.sendKeys(email);
        this.passwordInputWebElement.sendKeys(password);
        this.loginButtonWebElement.click();
    }
}
