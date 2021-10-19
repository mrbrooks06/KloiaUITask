package com.n11.stepDef;

import com.n11.pages.FooterPage;
import com.n11.utilities.BrowserUtils;
import com.n11.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class FooterStepDef {
   FooterPage footerPage=new FooterPage ();
   String expectedLink="";
    @When("user checks footer Links")
    public void user_checks_footer_Links() {
       footerPage.writeAllLinksFromFooter ();

    }

    @When("user clicks {string} link from Footer")
    public void user_clicks_link_from_Footer(String link) {
        expectedLink=footerPage.footerLinks ( link ).getAttribute ( "href" );
        footerPage.footerLinks ( link ).click ();

    }

    @Then("user verifies links are same")
    public void user_verifies_links_are_same() {
       String actualLink= Driver.get ().getCurrentUrl ();

        Assert.assertEquals ( expectedLink,actualLink );
    }




}
