package com.n11.stepDef;

import com.n11.pages.BasePage;
import com.n11.pages.FavoritePage;
import com.n11.pages.ProductDetailPages;
import com.n11.pages.ProductsPage;
import com.n11.utilities.BrowserUtils;
import com.n11.utilities.Driver;
import io.cucumber.java.en.*;

import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class FavoriteStepDef {
    ProductsPage productsPage=new ProductsPage ();
    ProductDetailPages productDetailPages=new ProductDetailPages ();
    FavoritePage favoritePage =new FavoritePage ();
    String ecpectedProductTitle="";
    Actions actions = new Actions (Driver.get () );

    @When("user hover {string} clicks {string}")
    public void user_hover_clicks(String mainProduct, String subProduct) {
        actions.moveToElement (   new BasePage ().categoryChoose ( mainProduct )).perform ();

        //new BasePage ().categoriesChoose ( mainProduct );

      productsPage.cosmeticProduct ( subProduct ).click ();


    }
    @When("user search for {string} in  Brand Filter")
    public void user_search_for_in_Brand_Filter(String brand) {

        productsPage.brandSearch ( brand ).click ();
    }

    @When("user click {int} th product")
    public void user_click_th_product(Integer product) {
        productsPage.searchedProduct.get ( (product-1) ).click ();

    }

    @When("user add product to Favorites")
    public void user_add_product_to_Favorites() {
        ecpectedProductTitle=productDetailPages.productTitle.getText ();
       favoritePage.addtoFavorite ();

    }

    @When("user clicks {string} from hesabım tab")
    public void user_clicks_from_hesabım_tab(String link) {
       new BasePage ().hesabımSubLink ( link ).click ();

    }

    @When("user clicks Favorilerim Link")
    public void user_clicks_Favorilerim_Link() {

        favoritePage.favorilerimLink.click ();


    }

    @Then("user verifies correct product added to favorite")
    public void user_verifies_correct_product_added_to_favorite() {
       String actualProductTitle=favoritePage.favoriteProduct.getText ();

        Assert.assertEquals ( ecpectedProductTitle,actualProductTitle );
    }




}
