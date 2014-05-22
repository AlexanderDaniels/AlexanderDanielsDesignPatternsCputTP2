/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp.alex.designpatternstest.behavioral;

import com.tp.alex.designpatterns.behavioral.strategy.Context;
import com.tp.alex.designpatterns.behavioral.strategy.SkiStrategy;
import com.tp.alex.designpatterns.behavioral.strategy.Strategy;
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
public class StrategyTest {
    
    public StrategyTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void strategyTest() {
        int temperatureInF = 60;

	Strategy skiStrategy = new SkiStrategy();
	Context context = new Context(temperatureInF, skiStrategy);
        
        Assert.assertNotNull(context);
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
