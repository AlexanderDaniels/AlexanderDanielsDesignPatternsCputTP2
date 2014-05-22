/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp.alex.designpatternstest.behavioral;

import com.tp.alex.designpatterns.behavioral.mediator.AmericanSeller;
import com.tp.alex.designpatterns.behavioral.mediator.Buyer;
import com.tp.alex.designpatterns.behavioral.mediator.DollarConverter;
import com.tp.alex.designpatterns.behavioral.mediator.FrenchBuyer;
import com.tp.alex.designpatterns.behavioral.mediator.Mediator;
import com.tp.alex.designpatterns.behavioral.mediator.SwedishBuyer;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Alex
 */
public class MediatorTest {
    
    public MediatorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void mediatorTest() {
        
	Mediator mediator = new Mediator();

	Buyer swedishBuyer = new SwedishBuyer(mediator);
        
	float sellingPriceInDollars = 10.0f;
        
	AmericanSeller americanSeller = new AmericanSeller(mediator, sellingPriceInDollars);
	DollarConverter dollarConverter = new DollarConverter(mediator);
        
        float swedishBidInKronor = 85.0f;
        if(!swedishBuyer.attemptToPurchase(swedishBidInKronor))
            Assert.assertTrue(true);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
