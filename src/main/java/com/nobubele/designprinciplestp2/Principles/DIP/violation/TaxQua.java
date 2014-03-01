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
public class TaxQua extends Tax
{
    private int qua ;
    
    
    public double total()
    {
        double total = calc()* qua; 
        
        return total;
    }
    
}
