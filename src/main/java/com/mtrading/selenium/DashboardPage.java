package com.mtrading.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    private static final String PAGE_URL = "https://tr3.mtrading.com/dashboard";
    private WebDriver webDriver;

    public DashboardPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this);
    }

    public String getUrl() {
        return DashboardPage.PAGE_URL;
    }

    public void open() {
        this.webDriver.get(this.getUrl());
    }

}
