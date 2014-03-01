/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.designprinciplestp2.Principles.LSP.violation.service.Imp;

import com.nobubele.designprinciplestp2.Principles.LSP.violation.service.MovieInterface;

/**
 *
 * @author nobu
 */
public class ComMovie implements MovieInterface {
    
    String name;
    String duration; 
    String type;
    
   @Override
    public String genre() 
    {
        
        
        String myObject =(name+duration+type);
         
        return myObject;
    }
    
    @Override
     public boolean Type()
     {
         return true;
     }   
    
}
