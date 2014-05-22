/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp.alex.designpatternstest.structural;

import com.tp.alex.designpatterns.structural.bridge.BigBus;
import com.tp.alex.designpatterns.structural.bridge.SmallCar;
import com.tp.alex.designpatterns.structural.bridge.SmallEngine;
import com.tp.alex.designpatterns.structural.bridge.Vehicle;
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
public class BridgeTest {
    
    public BridgeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void bridgeTest() {
        Vehicle vehicle1 = new BigBus(new SmallEngine());
        Vehicle vehicle2 = new SmallCar(new SmallEngine());
	Assert.assertNotSame(vehicle1, vehicle2);
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
