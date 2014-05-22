/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp.alex.designpatternstest.structural;

import com.tp.alex.designpatterns.structural.decorator.Animal;
import com.tp.alex.designpatterns.structural.decorator.GrowlDecorator;
import com.tp.alex.designpatterns.structural.decorator.LegDecorator;
import com.tp.alex.designpatterns.structural.decorator.LivingAnimal;
import com.tp.alex.designpatterns.structural.decorator.WingDecorator;
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
public class DecoratorTest {
    
    public DecoratorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void decoratorTest() {
        Animal animal = new LivingAnimal();
	animal = new LegDecorator(animal);
	animal = new WingDecorator(animal);
	animal = new GrowlDecorator(animal);
        Assert.assertNotNull(animal);
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
