package com.n11.pages;

import com.n11.utilities.BrowserUtils;
import com.n11.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends BasePage {

    @FindBy(xpath = "(//li//div[@class='catMenuTree']/ul)[5]/li/a")
    public List<WebElement> cosmeticProducts;

    @FindBy(xpath = "//section[3]//i[@class='icon iconSearchDark']")
    public WebElement searchBrandIcon;

    @FindBy(xpath = "//section[3]//input[@class='attributeSearch']")
    public WebElement searchBrandCase;
    @FindBy(xpath = "//section[3]//a")
    public WebElement brandResult;
    @FindBy(xpath = "//a[.='Parfüm & Deodorant']")
    public WebElement parfum;

    @FindBy(xpath = "(//section)[2]//li[@class='column ']/div")
    public List<WebElement> searchedProduct;


    public WebElement cosmeticProduct(String product) {
        WebElement cosmeticProduct = Driver.get ().findElement ( By.xpath ( "//a[.='" + product + "']" ) );
        return cosmeticProduct;

    }

    public WebElement brandSearch(String brand) {
        searchBrandIcon.click ();
        BrowserUtils.waitFor ( 2 );
        searchBrandCase.sendKeys ( brand );
        BrowserUtils.waitFor ( 2 );
        WebElement brandSearchResult = Driver.get ().findElement ( By.xpath ( " //input[@id='brand-m-" + brand + "']" ) );
        return brandSearchResult;

    }


}
