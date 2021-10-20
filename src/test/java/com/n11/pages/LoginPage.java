package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(className = "seg-popup-close")
    public WebElement popupClose;

    @FindBy(css = ".btnSignIn")
    public WebElement GririsYapButton;

    @FindBy(css = ".facebook_large")
    public WebElement fbLoginButton;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement fbEmail;

    @FindBy(xpath = "//input[@id='pass']")
    public WebElement fbPassword;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement fbLoginPupUpButton;

    @FindBy(xpath = "//div[@class='dn-slide-buttons horizontal']/button[@class='dn-slide-deny-btn']")
    public WebElement dahaSonra;

    @FindBy(xpath = "(//a[@title=\"Hesabım\"])[2]")
    public WebElement accountName;


}
