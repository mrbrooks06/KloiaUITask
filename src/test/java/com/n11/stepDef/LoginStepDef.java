package com.n11.stepDef;

import com.n11.pages.BasePage;
import com.n11.pages.LoginPage;
import com.n11.utilities.BrowserUtils;
import com.n11.utilities.ConfigReader;
import com.n11.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;


import java.util.Set;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage ();
    String currentWindowHandle = Driver.get ().getWindowHandle ();

    @Given("user closes popups pages")
    public void user_closes_popups_pages() {

        BrowserUtils.waitFor ( 5 );
        loginPage.popupClose.click ();
        BrowserUtils.waitFor ( 5 );

        loginPage.dahaSonra.click ();

    }

    @When("user clicks Giris Yap Button")
    public void user_clicks_Giris_Yap_Button() {

        Actions actions=new Actions ( Driver.get () );
        actions.moveToElement ( loginPage.GririsYapButton ).perform ();

        loginPage.GririsYapButton.click ();
    }

    @When("user clicks fb ile giris yap Button")
    public void user_clicks_fb_ile_giris_yap_Button() {
        loginPage.fbLoginButton.click ();
    }

    @When("user enters valid credentials to input boxes")
    public void user_enters_valid_credentials_to_input_boxes() {
        Set<String> windowHandles = Driver.get ().getWindowHandles ();
       windowHandles.stream ().forEach ( h->{
           if (!h.equals ( currentWindowHandle )) {

               Driver.get ().switchTo ().window ( h );
               loginPage.fbEmail.sendKeys ( ConfigReader.get ( "fbUserName" ) );
               loginPage.fbEmail.sendKeys ( Keys.TAB );
               loginPage.fbPassword.sendKeys ( ConfigReader.get ( "fbPassword" ) );
               loginPage.fbPassword.sendKeys ( Keys.TAB );
               loginPage.fbLoginPupUpButton.sendKeys ( Keys.ENTER );
               Driver.get ().switchTo ().window ( currentWindowHandle );

           }

       } );



    }


    @Then("user verified login successfully")
    public void user_verified_login_successfully() {
        BrowserUtils.waitFor ( 5 );
        Assert.assertFalse ( loginPage.accountName.getText ().isEmpty () );
    }




}



