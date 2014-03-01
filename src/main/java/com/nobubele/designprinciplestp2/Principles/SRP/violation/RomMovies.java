/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.designprinciplestp2.Principles.SRP.violation;

/**
 *
 * @author nobu
 */
public class RomMovies 
{
     
      public static void main(String[] args)
      {
          
       int stock = 20;
        String words; 
        double amount = 50;
        double tax = 0.14;
       
       if (stock > 0 )
          words = "Stock available";
       else
           words = "Stock not available";
       
        
        double total = amount * tax + amount ;
        
        System.out.println( words + " R" + total);
        
}
    
}
