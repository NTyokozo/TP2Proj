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
public class Comedy extends Movie
{   
    private final float tax = (float) 0.17;
    
    public float getTax()
    {
        
        float tot = (float) (getPrice() * tax );
        float total = (float) (tot + getPrice());
        
        return total;
    }
    
}
