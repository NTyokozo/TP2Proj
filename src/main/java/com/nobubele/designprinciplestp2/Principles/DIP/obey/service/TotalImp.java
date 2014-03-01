/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.designprinciplestp2.Principles.DIP.obey.service;

import com.nobubele.designprinciplestp2.Principles.DIP.obey.TotalInterface;

/**
 *
 * @author nobu
 */
public class TotalImp implements TotalInterface{

    @Override
    public double amount()
    {
        double tax = 0.14;
        double price = 50 ;
        int quan = 7;
        
        double total = (quan * price ) ;
        double tot = total * tax + total;
        return (tot);
    }
    
}
