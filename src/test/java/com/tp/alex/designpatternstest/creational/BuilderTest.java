/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp.alex.designpatternstest.creational;

import com.tp.alex.designpatterns.creational.builder.ItalianMealBuilder;
import com.tp.alex.designpatterns.creational.builder.Meal;
import com.tp.alex.designpatterns.creational.builder.MealBuilder;
import com.tp.alex.designpatterns.creational.builder.MealDirector;
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
public class BuilderTest {
    
    public BuilderTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void builderTest() {
        MealBuilder mealBuilder = new ItalianMealBuilder();
	
        MealDirector mealDirector = new MealDirector(mealBuilder);
	mealDirector.constructMeal();
	Meal meal = mealDirector.getMeal();
        Assert.assertEquals(meal.getDrink(), "red wine");
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
