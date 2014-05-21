/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp.alex.designpatterns.behavioral.visitor;

/**
 *
 * @author Alex
 */
public interface NumberElement {

	public void accept(NumberVisitor visitor);
    
}
