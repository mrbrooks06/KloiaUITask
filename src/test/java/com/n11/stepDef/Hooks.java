package com.n11.stepDef;

import com.n11.utilities.ConfigReader;
import com.n11.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {



        @Before
        public void setUp(){

            Driver.get().get( ConfigReader.get("url"));
            Driver.get().manage().window().maximize();
            Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }




        @After
        public void tearDown(Scenario scenario) throws InterruptedException {


            if (scenario.isFailed ()){
                byte[] screenshot= ((TakesScreenshot) Driver.get ()).getScreenshotAs ( OutputType.BYTES );

                scenario.attach ( screenshot,"image/png","screenshot" );


            }
            Driver.closeDriver ();

            Thread.sleep(2000);
            Driver.closeDriver();

        }
    }
