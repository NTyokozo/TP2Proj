/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.designprinciplestp2.Principles.SRP.obey.service.Imp;

import com.nobubele.designprinciplestp2.Principles.SRP.obey.service.RentOutInterface;

/**
 *
 * @author nobu
 */
public class RomMoviez implements RentOutInterface
{

    @Override
    public int inStock()
    {
        
       int stock = 20;
        String words; 
       
       if (stock > 0 )
          words = "Stock available";
       else
           words = "Stock not available";
       return stock;
       
       
    }

    @Override
    public double totalPrice() 
    {
        double amount = 50;
        double tax = 0.14;
        
        return amount * tax + amount ;
        
    }
    
    
}
