package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BasePage {
    public BasePage() {
        PageFactory.initElements ( Driver.get (), this );
    }

    Actions actions = new Actions ( Driver.get () );

    @FindBy(xpath = "(//div[@id='contentMain']//ul)[1]/li")
    public List<WebElement> categoriesMain;

    @FindBy(xpath = "//a[.='Hesabım']")
    public WebElement hesabımTab;


    public WebElement hesabımSubLink(String result) {

        actions.moveToElement ( hesabımTab ).perform ();
        WebElement hesabımSublink = Driver.get ().findElement ( By.xpath ( "//a[.= '" + result + "']" ) );
        return hesabımSublink;

    }

    public WebElement categoryChoose(String category) {
        Map<String, WebElement> mainCategory = new LinkedHashMap<> ();
        categoriesMain.stream ().forEach ( (c) -> {
            mainCategory.put ( c.getText (), c );

        } );

       return mainCategory.get ( category );

    }



}


