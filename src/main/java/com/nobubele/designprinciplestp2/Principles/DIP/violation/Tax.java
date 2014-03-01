/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.designprinciplestp2.Principles.DIP.violation;

/**
 *
 * @author nobu
 */
public class Tax 
{
    private final double tax = 0.14;
    private final int amount = 50;
    
    public double calc()
    {
        double total = tax * amount;
        
        return total;
    }
    
}
