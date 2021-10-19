package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FooterPage extends BasePage {
    @FindBy(xpath = "//footer//div//li/a")
    public List<WebElement> footerLinks;

    public WebElement footerLinks(String footerItem) {
        WebElement footerLink = Driver.get ().findElement ( By.xpath ( "//footer//div//li/a[@title='" + footerItem + "']" ) );
        return footerLink;


    }

    public void writeAllLinksFromFooter() {
        footerLinks.stream ().forEach ( (f) -> {
            System.out.println ( f.getText () + "=" + f.getAttribute ( "href" ) );
        } );


    }

}
