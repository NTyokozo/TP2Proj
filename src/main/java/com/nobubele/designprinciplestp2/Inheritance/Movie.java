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
public class Movie 
{
    private String name;
    private int duration;
    private double price  = 50;
    

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }
    public double getPrice()
    {
        int qua=4;
        
        double tot = qua * price;
        
        return tot;
    }
    
    
    
}
