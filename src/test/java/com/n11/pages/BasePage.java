package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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


    public void categoriesChoose(String categories) {


        switch (categories) {
            case "giybiModa":
                actions.moveToElement ( categoriesMain.get ( 0 ) ).perform ();

                break;
            case "Elektronik":
                actions.moveToElement ( categoriesMain.get ( 1 ) ).perform ();

                break;
            case "Ev & Yaşam":
                actions.moveToElement ( categoriesMain.get ( 2 ) ).perform ();

                break;
            case "Ane & Bebek":
                actions.moveToElement ( categoriesMain.get ( 3 ) ).perform ();
                break;
            case "Kozmetik & Kişisel Bakım":
                actions.moveToElement ( categoriesMain.get ( 4 ) ).perform ();
                break;

            case "Mücevher & Saat":
                actions.moveToElement ( categoriesMain.get ( 5 ) ).perform ();

            case "Spor & Outdoor":
                actions.moveToElement ( categoriesMain.get ( 6 ) ).perform ();

            case "Kitap,Müzik,Film,Oyun":
                actions.moveToElement ( categoriesMain.get ( 7 ) ).perform ();

            case "Petshop":
                actions.moveToElement ( categoriesMain.get ( 8 ) ).perform ();

            case "Otomotiv & Motosiklet":
                actions.moveToElement ( categoriesMain.get ( 9 ) ).perform ();


        }

    }

}


