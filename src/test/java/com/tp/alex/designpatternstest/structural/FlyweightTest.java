/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp.alex.designpatternstest.structural;

import com.tp.alex.designpatterns.structural.flyweight.Flyweight;
import com.tp.alex.designpatterns.structural.flyweight.FlyweightFactory;
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
public class FlyweightTest {
    
    public FlyweightTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void flyweightTest() {
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();
        
        Flyweight flyweightAdder = flyweightFactory.getFlyweight("add");
	
        Assert.assertNotNull(flyweightAdder);
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
