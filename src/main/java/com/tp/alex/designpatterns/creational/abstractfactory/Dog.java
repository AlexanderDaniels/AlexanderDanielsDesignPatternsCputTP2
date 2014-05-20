/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp.alex.designpatterns.creational.abstractfactory;

import com.tp.alex.designpatterns.creational.factorymethod.*;

/**
 *
 * @author Alex
 */
public class Dog extends Animal {

	@Override
	public String makeSound() {
		return "Woof";
	}
}
