/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp.alex.designpatterns.structural.flyweight;

/**
 *
 * @author Alex
 */
public class FlyweightMultiplier implements Flyweight {

	String operation;

	public FlyweightMultiplier() {
		operation = "multiplying";
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doMath(int a, int b) {
		System.out.println(operation + " " + a + " and " + b + ": " + (a * b));
	}
    
}
