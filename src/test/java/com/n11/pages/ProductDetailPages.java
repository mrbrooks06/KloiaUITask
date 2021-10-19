package com.n11.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPages extends BasePage {
    @FindBy(css = "#getWishList")
    public WebElement addtoFavoriteIcon;

    @FindBy(xpath = "//h1[@class='proName']")
    public WebElement productTitle;

    @FindBy(xpath = "//a[@id='addToFavouriteWishListBtn']")
    public WebElement getAddtoFavoritePupUpIcon;

    @FindBy(css = ".confirm")
    public WebElement confirmButton;
}
