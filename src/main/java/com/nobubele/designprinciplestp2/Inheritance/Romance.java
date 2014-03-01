/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.designprinciplestp2.Inheritance;

/**
 *
 * @author nobu
 */
public class Romance extends Movie
{
    private final double tax = 0.14;
    
    public double getTax()
    {
        double tot = getPrice() * tax * getPrice();
        return tot;
    }
}
