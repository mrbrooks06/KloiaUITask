package com.n11.pages;

import com.n11.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FavoritePage extends BasePage {
    ProductDetailPages productDetailPages = new ProductDetailPages ();


    @FindBy(xpath = "(//a/h4)[1]")
    public WebElement favorilerimLink;

    @FindBy(css = "[itemprop='name']")
    public WebElement favoriteProduct;

    public void addtoFavorite() {

        productDetailPages.addtoFavoriteIcon.click ();
        BrowserUtils.waitFor ( 3 );
        productDetailPages.getAddtoFavoritePupUpIcon.click ();
        productDetailPages.confirmButton.click ();
    }

}
